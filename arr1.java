import java.util.Scanner;
class arr1{
	public static void main(String[] args) {
		int arr[]=new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Elements");
		for(int i =0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Array Elements are :");
		for(int i =0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
	}
}