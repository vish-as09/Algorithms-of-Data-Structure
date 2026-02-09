import java.util.Scanner;

public class binarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter length : ");
		int n = sc.nextInt();
		boolean found=false;
		System.out.print("\n Enter target element : ");
		int ele = sc.nextInt();
		int []a= new int [n];
		for (int i=0;i<n;i++) {
				System.out.print("\n Enter elements : ");			
				a[i]=sc.nextInt();
		}
			int c=0;
			int low=0;
			int hi=n-1;
			while(low<=hi) {
				if(n==0) {
					System.out.print("\n Not Applicable");
				}c++;
				int mid=(low+hi)/2;
				if(a[mid]==ele) {
					found=true;
					break;
				}
				else if (a[mid]<ele)
					low=mid+1;
				else 
					hi=mid-1;
				
			}
		if(found==true)
			System.out.print("\n "+ele+" Element Found");
		else
			System.out.print("\n "+ele+" Element Not Found");
		System.out.print("\n Comparison "+c);

	}

}
