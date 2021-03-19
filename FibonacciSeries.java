package assignments;

public class FibonacciSeries {

	/*since we know fibonacci starts with 0 and 1 and followed value is adding up with previous value
	 * so declared two variables as Firstnum and secodnum and we have to define the range, range is given as 8
	 * sum variable assigned to collect dynamic out of adding numners to print
	 * initially we print firstnum
	 * in loop , i iterate upto range
	 * In this code, i analyze how to print fibonacci series by using assigining one variable with another to print it
	 */
	public static void main(String[] args) {

		int firstNum=0, secNum=1,range=8,sum;
		System.out.print(firstNum+ ", " +secNum);
		for(int i=0;i<range-2;i++)
		{
			sum=firstNum+secNum;
			firstNum=secNum; 
			secNum=sum; 
			System.out.print(", " +sum);
		}
	}

}
