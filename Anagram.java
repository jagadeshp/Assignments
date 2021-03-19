package assignments;

import java.util.Arrays;

public class Anagram
{

	public static void main(String[] args)
	{
		String text1 = "harikrishnan";
		String text2 = "nanhsirkirah"; 
    	int count=0;
		if(text1.length()==text2.length())
		{
		    char []arr = text1.toCharArray(); 
		    char []arr1 = text2.toCharArray();
		    Arrays.parallelSort(arr);
		    Arrays.parallelSort(arr1);
		    for(int i=0;i<arr.length;i++)
		    {
		    	if(arr[i]==arr1[i])
		    	{
		    		count=count+1;
		    	}
		    }
            if(count==arr.length)
            {
            	System.out.println("The both array has same value");
            }
            else
            	System.out.println("The both array has same length but doesnt have same value");
		}
		else
		{
        	System.out.println("The Given both array doesn't have same length, so it wont be same");
		}
		
	}

}
