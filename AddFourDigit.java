import java.util.Scanner;
class AddFourDigit
{
 	public static void main(String args[])
 	{
 	   Scanner sc = new Scanner(System.in);
 	   System.out.println(" Enter Digit ");
 	   int num = sc.nextInt();
 	   int num1 = num%10;
 	   num = num/10;
 	   int num2 = num%10;
 	   num = num/10;
 	   int num3 = num%10;
 	   num = num/10;
 	   int num4 = num%10;

 	   int val = num1 + num2 + num3 + num4;
 	   System.out.println(" Addition Of four Digit is = " + val);


 	}
}