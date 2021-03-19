package assignments;

public class ArmstrongNumber {

	/*Initialized input 153 as integer
	 * assigned input to another variable for comparison at final step
	 * To add the cube values and to print, introduced a new variable as armstrongnumber
	 * executed the for loop to know about the last digits of given input and cube it and assigned to armstrongnumber
	 * The loop will run till input!=0
	 * The loop will be executed as below
	 * First iterate - a=3, a=3*3*3(a=27), now armstrongnumber = 27+0(armstrongnumber=27)
	 * Second iterate - a=5,a=5*5*5(125),  now armstrongnumber = 27+125(armstrongnumber=152)
	 * Third iterate - a=1,a=1*1*1(1),  now armstrongnumber = 152+1(armstrongnumber=153)
	 * The loop ends still condition is not equal to zero
	 * now i compare the input value with final output.
	 * If it satisfied, will print the output or print nothing
	 * In this program, i learned how to get each digits of integer input and how to assign to other variable and compare whether its expected or not 
	 */
	public static void main(String[] args) {

		int input = 153;
		int temp=input;
		int armstrongnumber=0;
	    for(int i=0;input!=0;input=input/10,i++)
	    {
	    	int a =input%10;
	    	a = a*a*a;
	    	armstrongnumber=armstrongnumber+a;
	    }
	    if (temp==armstrongnumber)
	    System.out.println("The given input " +armstrongnumber+ " is an armstrong number");
	}

	}
