import java.util.*;
class CopyArr{
	public static void main(String[] args) {
		int a1[]=new int[]{55,66,44,88,22,44,88};
		int a2[]=Arrays.copyOf(a1,7);
		System.out.println(Arrays.toString(a2));
		int a3[]=new int[10];
		System.arraycopy(a2,0,a3,0,6);
		System.out.println(Arrays.toString(a3));
	}
}