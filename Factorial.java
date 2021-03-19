package assignments;

public class Factorial {

	/*The below is learning of my code
	 * Initially i declared a variable as 5, to find the factorial of 5
	 * i introduced a new variable as fact as 1 to track the factorial process
	 * now introduced a for loop from 1 to input (5) i given
	 * now inside the loop, i am calculating procedure like below to know the output
	 * 1=1*1
	 * 1=1*2
     * 2=2*3
	 * 3=3*4
	 * 24=24*5
	 * Now we get the output as 120 and we store in fact variable and printed outside the loop
	 * In this program i get to know how to assign the dynamic input to the variable and to print it
	 */

	public static void main(String[] args)
	{
		int a=5;
		int fact=1;
		for (int i=1;i<=a;i++)
		{
			 fact=fact*i;
		}
		System.out.println("The factorial of given numnber is " +fact);
	}
}