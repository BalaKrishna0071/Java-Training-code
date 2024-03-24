class Patt8{
	public static void main(String[] args) {
		
		for(int i = 1;i<=10;i++)
		{
			int n = 74;
			for(int j =10;j>=i;j--)
			{
				
				System.out.print((char)n);
				n--;

			}
			System.out.println();
		}
	}
}