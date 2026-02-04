import java.util.*;
public class Counter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] a = new int[5];
		int eCount=0;
		int oCount=0;
		for (int i=0;i<a.length;i++) {
			System.out.print("\n Enter elements : ");
			a[i]=sc.nextInt();
		}
		for (int i=0; i<a.length;i++) {
			if (a[i]%2==0) 
				eCount++;
			else
				oCount++;
		}
		System.out.print("\n Even Elements are : "+eCount);
		System.out.print("\n Odd Elements are : "+oCount);

	}

}
