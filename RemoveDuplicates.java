package assignments;

public class RemoveDuplicates 
{

	public static void main(String[] args)
	{
		String text = "We learn java basics as part of java sessions in java week1";	
		String[] Split= text.split(" ");
		for (int i=0;i<Split.length;i++)
		{
			int count=0;
			for(int j=0;j<Split.length;j++)
			{
				if(Split[i].equalsIgnoreCase(Split[j]))
				{
					count=count+1;
				}
			}
			if(count>1)
			{
				text=text.replaceAll(Split[i], "");
			}
		}
		System.out.println(text);
	}

}
