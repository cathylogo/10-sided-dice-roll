 /* Student Name: catherine logo
 * Student Number:041158107
 * Lab Professor:Narges Tabar
 * Due date :August 9th 2024
 * Lab section:302 
 */
public class Assignment03CatherineLogo {

	public static void main(String[] args) {
		// The program rolls a 10-sided dice NUM_ROLLS times and records the
		// results, then outputs the largest value
		final int NUM_ROLLS = 10;
		int[] rollResults = new int[NUM_ROLLS];
		// Roll the dice 10 times
		for(int count = 0; count < NUM_ROLLS; count++) {
		// Math.random() returns 0.0 to <1.0 i.e. we could get 0.99999999999 etc. but not 1.0
		// So Math.random() times 10 gives a number between 0 to 9. To get a range of 1 to 10,
		// add 1 to (int)(Math.random *10) to give a die value between 1 and 10 for each roll
		rollResults[count] = (int)(Math.random() * 10) + 1;
		}
		// find the largest
		int largestValue = Integer.MIN_VALUE;
		for(int diceNum = 0; diceNum < NUM_ROLLS;diceNum++) {
		if (rollResults[diceNum] > largestValue)
		largestValue = rollResults[diceNum];
		}
		// display the results
		for(int rollNum = 0; rollNum < rollResults.length; ++rollNum) { // corrected index
		System.out.printf("Result of roll #%d is: %d%n", rollNum +1, rollResults[rollNum]);
		}
		System.out.printf("Largest value = %d%n", largestValue);

		// Programmer's name goes here
		System.out.print("program by catherine logo");

	}

}
