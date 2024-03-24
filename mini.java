import java.util.*;
class Student{
	int sid[]=new int[10];
	int id=0;
	int n1=0;
	String name,cityUp;
	String sname[]=new String[10];
	String city[]=new String[10];
	String mob[]=new String[10];
	int i=0;
	Scanner sc = new Scanner(System.in);
	public void addStudent()
	{
		System.out.println("Enter Student ID :");
		sid[i]=sc.nextInt();
		System.out.println("Enter Student name :");
		sname[i]=sc.next();
		System.out.println("Enter City name :");
		city[i]=sc.next();
		System.out.println("Enter Phone number :");
		mob[i]=sc.next();
		i++;
	}
	public void updateStudent()
	{
		System.out.println("Enter Student ID :");
		id = sc.nextInt();
		for(int j=0;j<i;j++)
		{
			if(id==sid[j])
			{
				System.out.println("Student Id: "+sid[j]);
				System.out.println("1. Student Name: "+sname[j]);
				System.out.println("2. City: "+city[j]);
				System.out.println("Enter any Choice");
				n1=sc.nextInt();
				switch (n1){
				case 1: System.out.println("Enter new Student name: ");
					name = sc.next();
					sname[j]=name;
					System.out.println("Record Updated....");
					break;
				case 2:  System.out.println("Enter new City: ");
					cityUp = sc.next();
					city[j]=cityUp;
					System.out.println("Record Updated....");
					break;
				}
			}
		}
	}
	public void deleteStudent()
	{
		System.out.println("Enter Student ID :");
		id = sc.nextInt();
		for(int j=0;j<i;j++)
		{
			if(id==sid[j])
			{
				for(int k=j;k<i;k++)
				{
					sid[k]=sid[k+1];
					sname[k]=sname[k+1];
				}
				--i;
			}
		}
	}
	public void showStudent()
	{
		System.out.println("sid\tsname\tcity\tmobile");
		for(int j=0;j<i;j++)
		{
			System.out.println(sid[j]+"\t"+sname[j]+"\t"+city[j]+"\t"+mob[j]);
		}
	}
}
class mini{
	public static void main(String[] args) {
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("Select Option");
			System.out.println("1 ADD Student");
			System.out.println("2. Edit Student");
			System.out.println("3. Delete Student"); 
			System.out.println("4. Show Student");
			System.out.println("5. Exit");
			int ch=sc.nextInt();
			switch (ch) {
				case 1: s.addStudent();
					break;
				case 2: s.updateStudent();
					break;
				case 3: s.deleteStudent();
					break;
				case 4: s.showStudent();
					break;
				case 5: 
					System.exit(0);
			}

		}
	}
}