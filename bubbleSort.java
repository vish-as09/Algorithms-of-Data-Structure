import java.util.Scanner;

public class bubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter rows : ");
		int rows = sc.nextInt();
		int []a= new int [rows];
		for(int i=0 ; i<rows ; i++) {
				System.out.print("\n a["+i+"] : " );
				a[i]=sc.nextInt();
		}
		int temp=0;
		for (int j=0;j<rows ; j++) {
		for (int i=0;i<rows;i++) {
			if(i+1<rows && a[i]>a[i+1]) {
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				}
			}
		}
		for(int i=0 ; i<rows ; i++) {
			System.out.print(a[i]+" " );
	}
	}

}
