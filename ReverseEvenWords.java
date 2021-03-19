package assignments;

public class ReverseEvenWords {

	public static void main(String[] args)
	{

		String test = "I am a software tester"; 
		String[] input=test.split(" ");
		for(int i=0;i<input.length;i++)
			{
			     if(i%2!=0)
			     {
			    	String[] input1 =input[i].split("");
			    	for(int j=input1.length-1;j>=0;j--)
			    	{
		
			    	 System.out.print(input1[j]);
			         }
			    	 System.out.print(" ");
			     }
			     else
			    	 System.out.print(input[i] + " ");
		  
			}
	}

}
