import java.util.*;
class DublArr{
	public static void main(String[] args) {
		String[] strArr ={"Bala","Bala","Vikas","Rahul","Darinda"};
		for(int i =0;i<strArr.length-1;i++){
			for (int j =0;j<strArr.length; j++) {
				if(strArr[i].equals(strArr[j]) && (i!=j))
					{
						System.out.println("Dublicate"+strArr[j]);
					}
			}  
		}
	}
}