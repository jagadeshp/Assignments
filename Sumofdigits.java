package assignments;

public class Sumofdigits {

	/*Declared the input as integer and passed the input as 123
	 * One more variable included to track the sum of all digits
	 * in Initialization - loop has started in 0 and Condition - ends up to till quotient returns 0 
	 * I used post increment and once first iteration is completed, i get the updated quotient to process by dividing by 10
	 * In first iteration, to know the remainder i given modulo of 10 to know about last digit
	 * once i know last digit, i add up with assigned value of sum(0).
	 * loop goes till input!=0
	 * The loop output = 3+2+1 = 6
	 * In this program i get to know about how to get last digit of the integer as input and assign to another variable to print
	 */
	public static void main(String[] args) 
	{

		int input = 123;
		int Sum=0;
	    for(int i=0;input!=0;input=input/10,i++)
	    {
	    	int a =input%10;
	    	 Sum=Sum+a;
	    }
	    System.out.println("The sum of given digits is " +Sum);
	}

}
