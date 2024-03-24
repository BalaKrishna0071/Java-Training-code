import java.util.Scanner;
class evenArr{
	public static void main(String[] args) {
		int arr[]=new int[5];
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Elements");
		for(int i = 0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements are :");
		for(int i =0;i<5;i++)
		{
			if(arr[i]%2==0)
			{
				sum=sum+arr[i];
			}
		}
		System.out.print(sum);
	
	}
}