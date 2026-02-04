import java.util.Scanner;

public class countNoOfEvenOddInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter rows : ");
		int rows = sc.nextInt();
		System.out.print("\n Enter columns : ");
		int cols = sc.nextInt();
		int evenCount=0;
		int oddCount = 0;
		int [][]a= new int [rows][cols];
		for(int i=0 ; i<rows ; i++) {
			for(int j=0 ; j<cols ; j++) {
				System.out.print("\n a["+i+"]["+j+"] : ");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("\n -----------------------------------");
		for(int i=0 ; i<rows ; i++) {
			for(int j=0 ; j<cols ; j++) {
				if (a[i][j]==0)
					continue;
				else if(a[i][j]%2 == 0)
					evenCount++;
				else
					oddCount++;
			}
		}
		System.out.println("\n Even count : "+evenCount);
		System.out.println("\n Odd count : "+oddCount);
	}

}
