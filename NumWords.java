// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int input = Integer.parseInt(args[0]); 
		int	ones = input%10;
		int tens = (input/10)%10; 
		int hundreds = (input/100)%10; 
		// int thousands = (input/1000)%10; if you want to continue..  

		System.err.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
	}
}
