import java.util.Scanner;
class FindLargestAmong{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter First number !");
		int num1 = sc.nextInt();
		System.out.println(" Enter Second number !");
		int num2 = sc.nextInt();
		System.out.println(" Enter third number !");
		int num3 = sc.nextInt();
		System.out.println(" Enter Fourth number !");
		int num4 = sc.nextInt();
		System.out.println(" Enter Fifth number !");
		int num5 = sc.nextInt();

		if(num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5)
		{
			System.out.println(" largest number is  = "+ num1);
		}else if(num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5 )
		{
			System.out.println(" largest number is  = "+ num2);
		}else if(num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5 )
		{
			System.out.println(" largest number is  = "+ num3);
		}else if(num4 > num1 && num4 > num2 && num4 > num4 && num3 > num5 )
		{
			System.out.println(" largest number is  = "+ num4);
		}else if(num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4 )
		{
			System.out.println(" largest number is  = "+ num5);
		}else{
			System.out.println("Invalid Input");
		}

	}
}