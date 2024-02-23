import java.util.Scanner;
class Average{
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println(" Enter First Digit ");
			int num1 = sc.nextInt();
			System.out.println(" Enter Second Digit ");
			int num2 = sc.nextInt();
			System.out.println(" Enter Third Digit ");
			int num3 = sc.nextInt();
			int sum = num1+num2+num3;
			int avg = sum/3;
			System.out.println(" Averge of Three Digit is " + avg);

		}
}