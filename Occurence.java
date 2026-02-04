import java.util.Scanner;
public class Occurence {

	public static void main(String[] args) {
		int [] a = new int[5];
		int count = 0;
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<a.length;i++) {
			System.out.print("\n Enter elements : ");
			a[i]=sc.nextInt();
		}
		System.out.print("\n Enter a element you want to count: ");
		int element=sc.nextInt();
		for (int i=0;i<a.length;i++) {
			if (a[i]==element) {
				count++;
			}
		}
		System.out.print("\n Element "+element+" appered "+count+" times in array");
		sc.close();
	}

}
