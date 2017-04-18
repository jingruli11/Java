/******************************************************************************
 * Sorting incoming words on command line 
 * Using: 1) standard Java array sort
 *        2) bubble sort
 *        3) bubble sort with an improvement
 *        4) quick sort (recursive)
******************************************************************************/
import java.util.Arrays;

public class testing81
{
    public static void main (String[] args) 
    {

        if (args.length < 2) {
            System.out.println("Re-execute with at least 2 words");
            System.exit(-1);
        }
    
        System.out.println("Before the sort:");

        String str = "";

        for (int i=0; i < args.length; i++)
        { 
            System.out.println(args[i]);          //print each word on a separate line
            str += args[i] + " ";                 //sting out the array
        }
        System.out.println(str);

        String[] words1 = Arrays.copyOf(args, args.length);		//copy array to test multiple sorts 
        String[] words2 = Arrays.copyOf(args, args.length);		
        String[] words3 = Arrays.copyOf(args, args.length);		 
        String[] words4 = Arrays.copyOf(args, args.length);		

        //Standard Java sort -----------------------------------------------------------------------------------
        long start    = System.nanoTime();
        Arrays.sort(words1);                             //Java standard sort
        long end      = System.nanoTime();
        System.out.printf("\n Standard Sort duration: %6.3f microseconds \n\n" , (end-start)/1000.0);

        //Sequential sort ---------------------------------------------------------------------------------------
        long start1 = System.nanoTime();
        bubbleSort1(words2);                            //custom bubble sort method
        long end1   = System.nanoTime();
        System.out.printf("\n Bubble Sort duration:   %6.3f microseconds \n\n" , (end1-start1)/1000.0);

        //Bubble sort with improvement --------------------------------------------------------------------------
        long start2 = System.nanoTime();
        bubbleSort2(words3);                            //custom bubble sort with improvement
        long end2   = System.nanoTime();
        System.out.printf("\n Bubble2 Sort duration:  %6.3f microseconds \n\n" , (end2-start2)/1000.0);

        //Recursive quick sort ---------------------------------------------------------------------------------
        long start3 = System.nanoTime();
        quickSort(words4);                             //recursive quick sort
        long end3   = System.nanoTime();
        System.out.printf("\n Quick Sort duration:    %6.3f microseconds \n\n" , (end3-start3)/1000.0);

        //------------------------------------------------------------------------------------------------------

        System.out.println("After the sort:");

        StringBuffer buf = new StringBuffer();

        for (int i=0; i < words1.length; i++) 
        { 
            System.out.println(words1[i]);        //print after sort
            buf.append(words1[i] + " ");          //string out the array
        }

        System.out.println(buf);
    }


/*********************************************************************************
 * Custom bubble sort method
 * @param - String[ ] array
 *
 ********************************************************************************/  
    static void bubbleSort1(String[ ] array)
    { 
        String temp;

        for (int i=0; i < array.length; i++)            //loop for every element
        {
            for (int j=i+1; j < array.length; j++)      //loop for every element starting with 2nd element
            {
                if (array[i].compareTo(array[j]) > 0)   //compare 2 elements, if greater
                {
                    temp     = array[i];                //switch elements
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

/*********************************************************************************
 * Custom bubble sort sort method with an improvement
 * If there are no more swaps, then there is no reason to continue
 * @param - String[ ] array
 *
 ********************************************************************************/  
    static void bubbleSort2(String[ ] array)
    { 
        String  temp;
        int     upto    = array.length;
        boolean process = true;

        while(process)                                      //while there is more to compare
        {
            process = false;                                //always turn off

            for (int i=0; i < upto-1; i++)                  //loop for every element
            {
                if (array[i].compareTo(array[i+1]) > 0)     //compare 2 elements, if greater 
                {
                    temp       = array[i];                  //switch elements
                    array[i]   = array[i+1];
                    array[i+1] = temp;
                    process = true;         //as long as we swap, we have to continue processing
                }
            }
        }
    }

//*********************************************************************************************************
// Recurssive quick sort
// @param - String[ ] array
//
// quickSort: sort an array using recursive processing 
//      args: array to be sorted, starting position, ending position
//
// For each pass, this sort will place the first element exactly where it is suppose to be in the array.
// In doing so, it will also move all the elements that are less than the first element to the top,
// and will move all the elements that are greater than the first element to the bottom.
// The sort will split the array at the position where the first element is supposed to be. 
// The sort will recursively call the sort for the top section, and again for the bottom section.  
//*********************************************************************************************************  
    static void quickSort(String[ ] array)
    { 
        int from = 0;                       //start the sort at 0
        int to   = array.length-1;          //end the sort at array.length-1        
        quickSort(array, from,  to);        
    }

    static void quickSort(String[ ] array, int from, int to)	//overloaded method
    { 
        if (from >= to) return;                         //end of recurssion
        
        String  temp;

        int top = from;
        int bot = to;
        int direction = -1;                             //start direction going up

        while(top < bot)                        
        {
            if (array[top].compareTo(array[bot]) > 0)   //if top element > bottom element
            {
                temp     = array[top];                  //switch elements
                array[top] = array[bot];
                array[bot] = temp;
                direction *= -1;                        //if direction down then top++, else bottom--
            }
            if (direction == 1)
                top++ ;									//move down 1
            else
                bot-- ;									//move up 1
        }

        quickSort(array, from,  top-1);                 //call recursion for the top half
        quickSort(array, bot+1, to);                    //call recursion for the bottom half
    }
}