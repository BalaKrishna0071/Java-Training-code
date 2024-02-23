import java.util.Scanner; 
class AddTwoDigit
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Digit !!! ");
		int val = sc.nextInt();
		int num1 = val%10;
		int num2 = val/10;
		int sum = num1+num2;
		System.out.println(" Addition Of Two Digit are  =" + sum);
	}
}