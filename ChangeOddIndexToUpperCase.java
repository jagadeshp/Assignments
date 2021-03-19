package assignments;

public class ChangeOddIndexToUpperCase {

		/*In this code i learned how to tack each char of the string
		 *I learned how to change to uppercase it and print it if index is odd
		 */
	public static void main(String[] args) {

		String test = "changeme";
		for (int i =0;i<=test.length()-1;i++)
		{
			if(i%2!=0)
				System.out.println(Character.toUpperCase(test.charAt(i)));
			else
				System.out.println(test.charAt(i));
		}
	}

}
