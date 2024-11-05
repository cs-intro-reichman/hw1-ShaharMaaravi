// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int number = Integer.parseInt(args[0]); 
		int	ones = number%10;
		int tens = (number/10)%10; 
		int hundreds = (number/100)%10; 
		int thousands = (number/1000)%10; //if you want to continue..  

		System.err.println(hundreds + " hundreds," + tens + " tens, and " + ones + " ones.");
	}
}
