
import java.util.Scanner;
class sumArr{
	public static void main(String[] args) {
		int arr[]=new int[5];
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Elements");
		for(int i =0 ; i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Elements are :");
		for(int i =0 ; i<5;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}
}