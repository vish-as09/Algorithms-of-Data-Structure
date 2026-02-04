import java.util.*;

public class noOfDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int sum=0;
		int count=0;
		int rem;
		System.out.print("\n Enter elements : ");
		a=sc.nextInt();
		int temp=a;
		
		//count
		while(a>0) {
			rem=a%10;
			count++;
			a=a/10;
		}
		a=temp;
		System.out.print("\n Length of array is : "+count);
		
		//add
		while(a>0) {
			rem=a%10;
			sum+=rem;
			a=a/10;
		}
		System.out.print("\n Sum of array is : "+sum);
		a=temp;
		
		//even or odd middle value
		int index=count/2;
		int c=0;
		while(a>0) {
			rem=a%10;
			a=a/10;	
			c++;
			if (c==index+1) {
				if (rem%2==0)
					System.out.print("\n "+rem+" is Even");
				else
					System.out.print("\n "+rem+" is Odd");
			}
		}
		
		
	}

}
