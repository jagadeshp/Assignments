package assignments;

public class Palindrome 
{
	/*in this code, i learned how to pick the last char of string and to loop from last to first
	 * and also learned how to concatenate the string char i got.
	 * Final i used equals to find it and print
	 */
	public static void main(String[] args) 
	{
		String input = "madam";
		String rev="";
		for (int i=input.length()-1;i>=0;i--)
		{
			rev=rev+input.charAt(i);
		}
		if (input.equals(rev))
		System.out.println("The given input is palindrome");
	}
}
