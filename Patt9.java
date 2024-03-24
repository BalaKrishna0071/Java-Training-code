class Patt9{
	public static void main(String[] args) {
		int r =8;
		for(int i = 1 ; i <=r;i++)
		{
			System.out.println(" ");
			for(int j =1;j<=r-i;j++)
			{
				System.out.println();
				for(int k =1 ;k<=i;k++)
				{
					System.out.print(i+" ");
				}
				System.out.println();
			}

		}
	}
}