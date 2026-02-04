import java.util.Scanner;

public class OcurenceUsingBoolean {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] a = new int[5];
		for(int i = 0 ; i<a.length ; i++) {
			System.out.print("\n Enter elements : ");
			a[i] = sc.nextInt();
		}
		int count=1;
		boolean [] ab = {false,false,false,false,false};
		for(int i=0 ; i<a.length ; i++) {
			if (ab[i]) {
				continue;
			}for(int j=i+1;j<ab.length ; j++) {
				if(a[i]==a[j]) {
					ab[j]=true;
					count++;
				}
			}			
			System.out.print("\n "+a[i]+" appered "+count+" times in an array");
			count=1;
		}
	}

}
