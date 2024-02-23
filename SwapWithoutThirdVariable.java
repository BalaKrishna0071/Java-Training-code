import java.util.Scanner;
class SwapWithoutThirdVariable
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter First Digit ");
		int num1 = sc.nextInt();
		System.out.println(" Enter Second Digit ");
		int num2 = sc.nextInt();
		System.out.println("====================================");
		System.out.println(" First Digit Value Before swapping " + num1);
		System.out.println(" Second Digit Value Before swapping " + num2);
		System.out.println("====================================");
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		System.out.println("====================================");
		System.out.println(" First Digit Value After swapping " + num1);
		System.out.println(" Second Digit Value After swapping " + num2);
		System.out.println("====================================");
		

	}
}