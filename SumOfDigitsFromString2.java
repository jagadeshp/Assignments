package assignments;

public class SumOfDigitsFromString2 {

	public static void main(String[] args) {

		String text = "Tes12Le79af65";
		String update=text.replaceAll("[0-9]", "");
		//System.out.println(update);
		int sum = 0;
		char[] ch=update.toCharArray();
		for(int i=0;i<update.length();i++)
		{
			sum=sum + Character.getNumericValue(ch[i]);
			System.out.println(Character.getNumericValue(ch[i])+ " " +ch[i]);
		}
		System.out.println(sum);
	}

}
