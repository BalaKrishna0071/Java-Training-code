import java.util.Scanner;
class ReverseDigit
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter 3 Digit Number ");
		int num = sc.nextInt();
		int num1 = num%10;
		num = num/10;
		int num2 = num %10;
		num = num/10;
		int num3 = num%10; 
		System.out.println(" Reverse of Digit is = " + num1 + num2 + num3);
	}
}