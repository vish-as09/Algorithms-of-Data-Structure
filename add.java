import java.util.*;
public class add {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] a = new int[5];
		int sum=0;
		for (int i=0;i<a.length;i++) {
			System.out.print("\n Enter elements : ");
			a[i]=sc.nextInt();
		}
		for (int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		System.out.print("\n Sum of the array is: "+sum);
		sc.close();
	}

}
