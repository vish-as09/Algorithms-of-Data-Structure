import java.util.*;
public class Addition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter rows : ");
		int rows = sc.nextInt();
		System.out.print("\n Enter columns : ");
		int cols = sc.nextInt();
		int [][]a= new int [rows][cols];
		int [][]b= new int[rows][cols];
		int [][]sum = new int[rows][cols];
		for(int i=0 ; i<rows ; i++) {
			for(int j=0 ; j<cols ; j++) {
				System.out.print("\n a["+i+"]["+j+"] : ");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.print("\n 2D Array of a is : ");
		for(int i=0 ; i<rows ; i++) {
			System.out.print("\n ");
			for(int j=0 ; j<cols ; j++) {
				System.out.print(a[i][j]+" ");
			}
		}
		System.out.println("\n -----------------------------------");
		for(int i=0 ; i<rows ; i++) {
			for(int j=0 ; j<cols ; j++) {
				System.out.print("\n b["+i+"]["+j+"] : ");
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("\n 2D Array of b is  : ");
		for(int i=0 ; i<rows ; i++) {
			System.out.print("\n ");
			for(int j=0 ; j<cols ; j++) {
				System.out.print(b[i][j]+" ");
			}
		}
		System.out.println("\n -----------------------------------");
		System.out.println("\n Sum of Arrays(a,b) : ");
		for(int i=0 ; i<rows ; i++) {
			for(int j=0 ; j<cols ; j++) {
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0 ; i<rows ; i++) {
			System.out.print("\n ");
			for(int j=0 ; j<cols ; j++) {
				System.out.print(sum[i][j]+" ");
			}
		}
	}

}
