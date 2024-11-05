// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]); 
		int randomA =  (int) (Math.random() * lim);
		int randomB =  (int) (Math.random() * lim);
		int randomC =  (int) (Math.random() * lim);

		System.out.println(randomA + ", " + randomB + ", " + randomC);
		int min1 = (int) Math.min(randomA, randomB);
		int min2 = (int) Math.min(randomB, randomC);
		int min = (int) Math.min(min1, min2);
		// find min number	
		int max1 = (int) Math.max(randomA, randomB);
		int max2 = (int) Math.max(randomB, randomC);
		int max = (int) Math.max(max1, max2);
		// find max number
		int middle = randomA + randomB + randomC - max - min; 
		//find middle number 
		System.out.println(min + ", " + middle + ", " + max);
	}
}
