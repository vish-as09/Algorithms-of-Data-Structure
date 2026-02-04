import java.util.Scanner;

public class DeleteMultipleElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] a = new int[5];
		for (int i=0;i<a.length;i++) {
			System.out.print("\n Enter elements : ");
			a[i]=sc.nextInt();
		}
		int count=0;
		System.out.print("\n Enter element you want to delete : ");
		int element = sc.nextInt();
		for(int i=0;i<a.length;i++) {
			if(element==a[i]) {
				count++;
			}
		}
		int i=1;
		while(i<=count) {
			for(int k=0;k<a.length;k++) {
				if(element==a[k]) {
					for(int j=k;j<a.length-1;j++) {
						a[j]=a[j+1];
					}
				}
			}
			i++;
		}
		for( i=0;i<a.length-count;i++) {
			System.out.print("\n " +a[i]);
		}

	}

}
