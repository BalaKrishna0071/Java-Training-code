class Patt7{
	public static void main(String[] args) {
		int n =74;
		for(int i =1;i <= 10;i++)
		{
			for(int j =10;j>=i;j--)
			{
				System.out.print((char)n);
				
			}
			System.out.println();
			n--;
		}
	}
}