import java.util.Scanner;

public class DeltionThroughElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] a = new int[5];
		for (int i=0;i<a.length;i++) {
			System.out.print("\n Enter elements : ");
			a[i]=sc.nextInt();
		}
		System.out.print("\n Enter element you want to delete : ");
		int element = sc.nextInt();
		int pos=0;
		int l=a.length;
		int count = -1;
		boolean found = false;
		for(int i=0;i<a.length ; i++) {
			if (a[i] == element) {
				pos=i;
				found=true;
				count++;
				for(int j=pos;j<l-1 ; j++) {
					a[j]=a[j+1];
					i--;
					l--;
				}
			}
			
		}
		if (found == true) {
			System.out.print("\n Element found!!!");
			System.out.print("\n New Updated Array is : ");
			for (int i=0 ; i<a.length-2;i++) {
				System.out.print("\n "+a[i]);
			}
			
		}else {
			System.out.print("\n Element not found !!!");
			System.out.print("\n Existing Array is : ");
			for (int i=0 ; i<a.length;i++) {
				System.out.print("\n "+a[i]);
			}
		}	
	}

}
