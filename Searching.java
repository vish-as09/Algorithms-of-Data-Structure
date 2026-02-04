import java.util.*;
public class Searching {

	public static void main(String[] args) {
		int [] a = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<a.length;i++) {
			System.out.print("\n Enter elements : ");
			a[i]=sc.nextInt();
		}
		System.out.print("\n Enter a element you want to search : ");
		int element=sc.nextInt();
		for (int i=0;i<a.length;i++) {
			if (a[i]==element) {
				System.out.print("\n Element "+element+" found at the position "+(i+1));
				break;
			}
		}
		sc.close();
	}

}
