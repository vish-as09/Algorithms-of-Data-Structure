import java.util.*;
public class Insertion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] a = new int[5];
		for (int i=0;i<a.length-1;i++) {
			System.out.print("\n Enter elements : ");
			a[i]=sc.nextInt();
		}
		System.out.print("\n Enter element you want to insert : ");
		int element = sc.nextInt();
		System.out.print("\n Enter position on which you want to insert : ");
		int pos = sc.nextInt();
		for(int i=4;i>pos-1;i--) {
			a[i]=a[i-1];
		}
		a[pos-1]=element;
		for(int i=0;i<a.length;i++) {
			System.out.print("\n " + a[i]);
		}
		sc.close();
	}

}
