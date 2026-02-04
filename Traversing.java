import java.util.Scanner;

public class Traversing {

	public static void main(String[] args) {
		int [] a = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<a.length;i++) {
			System.out.print("\n Enter elements : ");
			a[i]=sc.nextInt();
		}
		for (int i=0;i<a.length;i++) {
			System.out.print("\n Elements at index["+i+"] is : "+a[i]);
		}
	}

}
