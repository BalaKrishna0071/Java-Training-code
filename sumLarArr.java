import java.util.Scanner;
class sumLarArr{
	public static void main(String[] args) {
		int arr[]=new int[5];
		int small=0;
		int lar=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Elements");
		for(int i =0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(" Array Elements are:");
		small=lar=arr[0];
		for(int i = 0;i<5;i++)
		{
			if(small>arr[i])
			{
				small=arr[i];
			}
			if(lar<arr[i])
			{
				lar=arr[i];
			}
		}
		System.out.println(small);
		System.out.println(lar);
	}
}