import java.util.Scanner;
class LastDigit
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number !!!");
		int num = sc.nextInt();
		int val = num%10;
		System.out.println("Last Digit is  = "+val);
	}
}