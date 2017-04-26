import java.util.*;
import java.lang.*;

public class Analytics {
	// Instantiate instance fields
	private double[] array, sortedArray;
	private int count;
	private double sum, average, median, min, max, stdDev, mode, range;

	// Create constructor
	Analytics(double[] array) {
		this.array = normalize(array);
		this.sortedArray = Arrays.copyOf(this.array, this.array.length);
		Arrays.sort(this.sortedArray);

		count = count();
		sum = sum();
		average = average();
		median = median();
		min = min();
		max = max();
		stdDev = stdDev();
		mode = mode();
		range = range();
	}


	// Method to normalize this.array
	double[] normalize(double[] array1) {
		int i = 0;
		int cnt = 0;

		for (double col : array1) {
			if (col != Double.MIN_VALUE) {
				cnt += 1;
			}
		}

		double[] array2 = new double[cnt];

		for (double col : array1) {
			if (col != Double.MIN_VALUE) {
				array2[i] = col;
				i++;
			}
		}
		return array2;
	}

	// Method to count elements
	int count() {
		return this.array.length;
	}

	// Method to sum elements
	double sum() {
		double total = 0;
		for (double i : this.array) {
			total += i;
		}
		return total;
	}

	// Method to compute average
	double average() {
		double total = this.sum();
		double count = this.count();
		double average = total / count;
		return average;
	}

	// Method to return median
	double median() {
		
		int count = this.count();
		double mid;
		if (count % 2 == 0) {
			mid = (this.sortedArray[(count-2)/2]+this.sortedArray[(count-2)/2+1])/2;
		} else {
			mid = this.sortedArray[(count-1)/2];
		}
		return mid;
	}

	// Method to return minimum value
	double min() {
		double min = Double.POSITIVE_INFINITY;
		for (double i : this.array) {
			if (i < min) {
				min = i;
			}
		}
		return min;
	}

	// Method to return maximum value
	double max() {
		double max = Double.NEGATIVE_INFINITY;
		for (double i : this.array) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}

	// Method to calculate standard deviation
	double stdDev() {
		int cnt = this.count();
		double sum = this.sum();
		double average = this.average();

		double temp = 0;
		for (double i : this.array) {
			temp += Math.pow(i - average, 2);
		}
		double stdDev = Math.sqrt(temp / count);
		return stdDev;
	}

	// Method to compute mode
	double mode() {
		int unique = 1;
		
		


		double key = this.sortedArray[0];
		int tempcnt = 1;
		int maxcnt = tempcnt;



		for (int i = 1; i < this.sortedArray.length; i++) {
			if (this.sortedArray[i] == this.sortedArray[0]) {
				tempcnt += 1;
				maxcnt = tempcnt;
			} else if (this.sortedArray[i] == this.sortedArray[i-1]) {
				tempcnt += 1;
			} else {
				if (tempcnt > maxcnt) {
					maxcnt = tempcnt;
					key = this.sortedArray[i-1];
				}
				tempcnt = 1; 
			}
		}
		
		
		return key;
	}

	// Method to compute range
	double range() {
		double min = this.min();
		double max = this.max();
		return max - min;
	}

	// Getter method for fields
	int getCount() {
		return this.count;
	}

	double getSum() {
		return this.sum;
	}

	double getAverage() {
		return this.average;
	}

	double getMedian() {
		return this.median;
	}

	double getMin() {
		return this.min;
	}

	double getMax() {
		return this.max;
	}

	double getStdDev() {
		return this.stdDev;
	}

	double getMode() {
		return this.mode;
	}

	double getRange() {
		return this.range;
	}

	// toString method
	public String toString() {
		String str  = "Data points: "   + Arrays.toString(this.array);
               str += "\nCount......: " + this.count; 
               str += "\nSum........: " + Math.round(this.sum * 100) / (double) 100; 
               str += "\nAverage....: " + Math.round(this.average * 100) / (double) 100; 
               str += "\nMedian.....: " + this.median; 
               str += "\nMinimum....: " + this.min; 
               str += "\nMaximum....: " + this.max; 
               str += "\nStd.Dev....: " + Math.round(this.stdDev * 100) / (double) 100; 
               str += "\nMode.......: " + this.mode;
               str += "\nRange......: " + this.range;
        return str;  
	}

	// Slice method
	static double[] slice(double[][] array2dim, String type, int idx)
    {
        int      size  = 0;
        double[] array = null;

        if (type.equals("row"))                             //ROW slice
        {
            size  = array2dim[idx].length;                      //determine the needed array size           
            array = Arrays.copyOf(array2dim[idx], size);        //copy that row into a 1dim array
        }
        if (type.equals("col"))                             //COL slice
        {           
            size  = array2dim.length;                           //determine the needed array size           
            array = new double[size];                           //create a new array of that size
            for (int i=0; i < size ; i++)                       //loop through all rows
            {
                try {                                           //try to: 
                    array[i] = array2dim[i][idx];                //copy cell from 2dim into 1dim array                     
                }
                catch (Exception e) {                           //if exception:
                    array[i] = Double.MIN_VALUE;                //cell does not exist, populate with min value
                }
            }           
        }
        if (type.equals("all"))                             //ALL slice (turn a 2dim array to 1 dim)
        {           
            for (double[] row : array2dim)                      //loop through all rows                     
                size += row.length;                             //compute the needed array size                              
            array = new double[size];                           //create a new array of that size
            int i = 0;
            for (double[] row : array2dim)                      //loop through all rows
                for (double col : row)                          //loop through all columns
                    array[i++] = col;                           //copy cell into 1dim array                         
        }

//      System.out.println(size + Arrays.toString(array));      //debug only
        return array;
    }

    // transpose method
    static double[][] transpose(double[][] array2dim)
    {
        int rowNum  = array2dim.length;                     //compute number of rows
        int colNum  = 0;                                    //compute number of columns
            
        for (double[] row : array2dim)                      //loop through all rows                     
            if (row.length > colNum)                        //take the size of the longest row                              
                colNum = row.length;                        //this becomes the number of columns        
        
        double[][] newArray = new double[colNum][rowNum];   //create new array
                                                            //notice [row][col] dimensions are transposed
        int col2 = 0;
        for (int row=0; row < array2dim.length; row++)              //loop thru original rows
        {
            int row2 = 0;                                           
            for (int col=0; col < array2dim[row].length; col++)     //loop thru original columns
            {
                newArray[row2][col2] = array2dim[row][col];         //copy into new array           
                row2++;                                             //add 1 to row of new array
            }
            col2++;                                                 //add 1 to col of new array
        }   
        return newArray;
    }




}