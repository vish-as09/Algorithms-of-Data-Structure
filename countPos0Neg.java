import java.util.*;
public class countPos0Neg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] a = new int[5];
		for(int i = 0 ; i<a.length ; i++) {
			System.out.print("\n Enter elements : ");
			a[i] = sc.nextInt();
		}
		int countPos = 0;
		int count0 = 0;
		int countNeg = 0;
		for (int i=0 ; i<a.length ; i++) {
			if (a[i]==0)
				count0++;
			else if (a[i]>0)
				countPos++;
			else
				countNeg++;
	}
		System.out.print("\n Number of O's are : "+count0);
		System.out.print("\n Number of Positive count is : "+countPos);
		System.out.print("\n Number of Negative count is : "+countNeg);
	}
}
