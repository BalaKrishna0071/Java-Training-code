class patt7{
	public static void main(String[] args) {
		
			for(int j =1;j<=5;j++)
			{
				if(j==3)
					continue;
				System.out.println(j);
				
				if(j==5)
				{
					System.out.println();
					for(int i =10;i>=6;i--)
					{	
						if(i==8)
							continue;
						System.out.println(i);

					}
				}
			}
		
	}
}