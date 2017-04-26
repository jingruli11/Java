import java.io.*;
import java.util.*;
//--------------------------------------------------------------------------------
// Retrieve a dataset and perform analytics both across and down
// Input from arg[0], or "vAnalytics1.csv" otherwise
//--------------------------------------------------------------------------------
public class hw5test
{
    static double[][] dataPoints = null;                    //2 dim array to hold all the data points

    public static void main(String[ ] args) throws Exception
    {
      String input_file = "dataset2.csv";
//        String input_file = "/home/s/sultans/web/java/demo/8inpout/analytics/dataset1.csv";
    
        if (args.length > 0)                                //if argument is provided 
            input_file = args[0];                           //use it as an input file

        readFile(input_file);                               //read the file into a 2 dim array
        display(dataPoints);                                //print the 2 dim array
        double[] datalist = convert(dataPoints);
        Analytics x = new Analytics(datalist);                               		//compute and print

        System.out.println(x);
                                                 //print transposed 2 dim array
    }

//--------------------------------------------------------------------------------
// Read the input file, cleanse it, and store into a 2 dimensional array
//--------------------------------------------------------------------------------
    static void readFile(String filename)
    { 
        int nRows = 0;                                  //number of lines/rows in file
        int nCols = 0;                                  //number of columns for each line
        String[] data = null;                           //1 dim array to hold string data for each line

        System.out.println("SOURCE INPUT...");
        try 
        {
            File    f1   = new File(filename);                                  //create a file object               
            Scanner file = new Scanner(f1);                                     //scanner for the input file

            LineNumberReader lnr = new LineNumberReader(new FileReader(f1));    //code to get the number of lines
            lnr.skip(Long.MAX_VALUE);                                           //skip to end
//          nRows = lnr.getLineNumber() +1;                                     //obtain the num of lines/rows      
            nRows = lnr.getLineNumber();                                        //for CSV there is an extra blank line      
            lnr.close();                                                        //close the object                                      

            dataPoints = new double[nRows][];                //create a 2 dim array with as many rows as lines in file 

            int row=0;
            int col=0;

            while (file.hasNextLine())                      //while there are lines in the file
            {
                String line = file.nextLine();              //get next line
                System.out.println(line);
                data            = line.split(",");          //split it on ,
                nCols           = data.length;              //get number of columns
                double[] cols   = new double[nCols];        //create a 1 dim array with as many cols as the line 
                dataPoints[row] = cols;                     //append the 1 dim array into the 2 dim array

                for (col=0; col < nCols; col++)             //loop for all columns
                {
                    try
                    {
                        double num = Double.parseDouble(data[col]);     //convert from String to double 
                        dataPoints[row][col] = num;                     //populate the 2 dim table              
                    } 
                    catch(Exception e)                                  //if error in conversion
                    {
//                      System.out.print  ("row:" + (row+1) + ", col:" + (col+1));                      //display error
//                      System.out.println(", value not numeric: " + data[col] + ", assuming null");    //display error

                        dataPoints[row][col] = Double.MIN_VALUE;         //assume bad/no data - place smallest double value 
                    }   
                }
                row++;                                                  //next row
            }
        }            
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
//--------------------------------------------------------------------------------
// Display the 2 dimensional data array
//--------------------------------------------------------------------------------
    static void display(double[][] dataPoints)
    {
        System.out.println("\nCOLUMN ORIENTED...");

        for (double[] row : dataPoints)                  //loop through all rows of 2 dim array
        {
            for (double col : row)                       //loop through all the columns
                if (col == Double.MIN_VALUE)             //if smallest double value (assume bad/no data)
                    System.out.print("\t");              //bypass
                else
                    System.out.printf("%7.2f ", col);    //print the column value

            System.out.print("\n");
        }
    }

//--------------------------------------------------------------------------------
// Convert the 2 dimensional data array into 1 dimensional data array
//--------------------------------------------------------------------------------
    static double[] convert(double[][] d2) {
    	int cnt = 0;
    	for (int i = 0; i < d2.length; i++) {
    		for (int j = 0; j < d2[i].length; j++) {
    			cnt += 1;
    		}
    	}
    	double[] temp = new double[cnt];
    	int k = 0;
    	for (int i = 0; i < d2.length; i++) {
    		for (int j = 0; j < d2[i].length; j++) {
    			temp[k] = d2[i][j];
    			k += 1;
    		}
    	} 
    	return temp;
    }
}    