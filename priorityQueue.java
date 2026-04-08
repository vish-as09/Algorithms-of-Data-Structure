import java.util.*;
public class priorityQueue {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("\n Enter length : ");
		int l=sc.nextInt();
		int [] a= new int[l];
		int [] priority = new int [l];
		System.out.println("\n Enter elements of Array");
		for(int i=0 ; i<a.length ; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("\n Enter priorities of elements");
		for(int i=0 ; i<a.length ; i++) {
			priority[i]=sc.nextInt();
		}
		int [] priorityQueue = new int[a.length];
		int j=1;
		while(j<a.length) {
			for(int i=0 ; i<a.length ; i++) {
				if(priority[i]==j) {
					priorityQueue[j-1]=a[i];
					j++;
				}
			}
		}System.out.println("\nPriority Queue:");
		for(int i=0 ; i<a.length ; i++) {
			System.out.print(priorityQueue[i]+" ");
		}
	}

}
