
/**
 * 				---- BUBBLE_SORT_WITH_PASS ----
 * This Bubble Sort program with Pass. The first pass will push the  
 * largest element in the array to the last position in the index. The
 * second Pass will push the second largest element to second to last
 * position in the index. Until all the values are sorted in ascending
 * order. There will be as many passes as there are elements the user inputs.
 * 
 * @author Khalil Niser; 05/15/2018
 */

package SortingAlgorithms.bubbleSort;

import java.util.Scanner;

public class BubbleSortWithPass 
{
	/**
	 * 				---- BUBBLE_SORT ----
	 * Bubble Sort, is a method that returns assorted Arrays.
	 * I created a method called Bubble Sort. The Bubble Sort is a 
	 * method that receives an "input array", which are unsorted. 
	 * And in reverse it returns another set of integer array, only 
	 * this time sorted and stored in a variable called sortedArray.
	 * 
	 * 				---- PASS ----
	 * Here I am crating a pass, there will be a loop for 
	 * pass. Within each pass Java will scan through each
	 * elements. That being said I will need a "nested-
	 * loop". An outer-for-loop (for the pass), and inner-
	 * for-loop, for each element in the input array.
	 * 
	 * 				---- STATIC METHOD ----
	 * This method must be "static". In order for this method 
	 * to be used inside the main or any other method besides 
	 * main, it needs to be "static". Data and fields inside 
	 * a "static" method are easily accessible to any "static" 
	 * method, within this class (as long as they're public).
	 * 
	 * 				---- EXCEPTION ----
	 * If I was to right the inner-for-loop statement without
	 * specifying "minus pass" (- pass), after "currentElement
	 * < numbers;" condition. Java will automatically throw at 
	 * an Exception (ArrayIndexOutOfBoundsException). Remember
	 * currentEelement is Not the actual element, rather it's
	 * the index. So inside the if-condition-statement, 
	 * (numbersArray[currentElement+1]) numbersArray is
	 * the "length" of the array. 
	 */
	// Implementing the "bubbleSort" method
	public static int[ ] bubbleSort( int[ ] numbersArray )
	{
			
		int numbers = numbersArray.length;
		
		/*
		 *  55 79 44 96 27 0 66
		 * An "outer-loop" which will be for the pass. 
		 * NOTE: There will be as many passes as there is numbers.
		 */
		for ( int pass = 1; pass <= numbers; pass++ )
		{
			/* 
			 * Within each pass I will need an "inner-loop". This inner-loop
			 * will actually represent each element inside the array
			 */
			for ( int  currentElement = 0; currentElement < numbers - pass; 
					currentElement++ )
			{
				// If the current element in the array, is greater 
				// than the adjacent element to it's right
				if ( numbersArray[ currentElement ] > numbersArray[ currentElement + 1 ] )
				{
					/**
					 * 				---- SWAP ----
					 * If current element is greater than the next element 
					 * to it's right, then perform a swap process.
					 * 
					 * Note: "temp" is the name of my temporary variable!
					 * 
					 * In int "temp", I will store "currentElement",
					 * "currentElement" I will store "currentElement + 1" 
					 * "currentElement + 1", I will store the variable temp.
					 */
					int temp = numbersArray[ currentElement ];
					numbersArray[ currentElement ] = numbersArray[ currentElement + 1 ];
					numbersArray[ currentElement + 1 ] = temp;
					
				} // END OF "IF_STATEMENT"
			}
			
			// The pass ENDS after every "inner-for-loop"
			// Therefore, I can print the pass
			System.out.println( "\nPrinting Pass: " + pass);
			printArray( numbersArray );
		}
		
		return numbersArray;
			
	}
	
	/**
	 * 				---- PRINT_METHOD ----
	 * Create a method called printArray. That method will print the array that 
	 * is passed to it. This method must be "static". In order for this method 
	 * to be used inside the main or any other method besides main, it needs to 
	 * be "static". Data inside "static" methods are easily accessible to any 
	 * "static" method, within this class!
	 */
	// As a parameter I pass an array called numbersArray
	// Which stores the elements that the user inputs.
	public static void printArray( int[ ] numbersArray )
	{
		for ( int index = 0; index < numbersArray.length; index++ )
		{
			System.out.print( " " + numbersArray[ index ]);
		}
		
		System.out.println();
	}

	public static void main(String[] args) 
	{
		//The total number of values (N), the user wishes to sort
		int userInput;
		
		// Scanner class accepts input from the user
		Scanner scanner = new Scanner( System.in );
		
		System.out.println( "How Many Numbers You Wish to Sort?" );
		// User input will be stored in "userInput"
		userInput = scanner.nextInt();
		
		// crate an array which I will store the data elements
		int[ ] inputArray = new int[ userInput ];
		
		// Asking the user to enter desired values 
		System.out.println( "Please Type-in your " + userInput + " Numbers!" );
		
		/*
		 * Using the "for-loop" I accept those elements into an
		 * array called inputArray
		 */
		for ( int index = 0; index < userInput; index++ )
		{
			/*Accept the numbers from the user and store in inpuArray*/
			inputArray[ index ] = scanner.nextInt();
		}
		
		// I print the array of values user inputs 
		// using the printArray method I created on top. 
		System.out.println( "Numbers you Entered to Sort are:" );
		printArray( inputArray );
		
		// Bubble Sort, returns and stores the "sorted"
		// input array to the sortedArray variable
		int[ ] sortedArray = bubbleSort( inputArray );
		
		// Printing the "Sorted numbers"
		System.out.println();
		System.out.println( "The Assorted Numbers are:" );
		printArray( sortedArray );

	}

}
