package assignments;

public class FindIntersection 
{
    /*
     * Here i understand how to use nested loop, here if i find the first array
     * i have to inform once to first loop if i found the first matched array, that is achieved using count
     */
	public static void main(String[] args)
	{
		int a [] = {3,2,11,4,6,7};
		int b [] = {1,2,8,4,9,7};
		int count=0;
		for (int i=0;i<=a.length-1;i++)
		{
			for (int j=0;j<=b.length-1;j++) 
			{
				if (a[i]==b[j])
				{
				System.out.println(b[j]);
				count+=1;
				}
			}
			if (count==1)
				break;
		}

	}

}
