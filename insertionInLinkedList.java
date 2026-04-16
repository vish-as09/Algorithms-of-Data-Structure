import java.util.*;
class insertionInLinkedList{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> l = new LinkedList<>();
		
		System.out.print("\n Enter length : ");
		int n = sc.nextInt();
		
		System.out.print("\n Enter values : ");
		for(int i=0 ; i<n ; i++) {
			int value=sc.nextInt();
			l.add(value);
		}
		 System.out.println("\n LinkedList elements are: " + l);
		 while(true) {
		 System.out.println("1. At Beginning");
		 System.out.println("2. At Last");
		 System.out.println("3. At pos");
		 int choice=sc.nextInt();
		 
		 if(choice==1) {
			 System.out.println("Enter elements");
			 int element = sc.nextInt();
			 l.add(0,element);
			 System.out.println("Updated list " + l);
			 n++;
		 }
		 
		 else if (choice==2) {
			 System.out.println("Enter elements");
			 int element = sc.nextInt();
			 l.add(n,element);
			 System.out.println("Updated list " + l);
			 n++;
		 }
		 else if(choice==3) {
			 System.out.println("Enter positions : ");
			 int pos=sc.nextInt();
			 int element = sc.nextInt();
			 l.add(pos,element);
			 System.out.println("Updated list " + l);
			 n++;
		 }else
			 break;
		 }
	}
}