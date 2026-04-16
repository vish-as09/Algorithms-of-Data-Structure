import java.util.Scanner;

public class enqueue {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("\n Enter length : ");
		int l=sc.nextInt();
		int [] a= new int[l];
		int front=-1;
		int rear=-1;
		
		//checking 
		if (front==(rear+1)%l){
			System.out.print("\n Overflow");
		}else {
			System.out.println("\n No Overflow, you can insert elements.");
		}
		System.out.println("\n -----------------------------");

		//inserting
		System.out.print("\n Element = ");
		int ele=sc.nextInt();
		if( front==-1 && rear ==-1){
			front=rear=0;
			a[rear]=ele;
		}else if (rear==l-1 && front!=0){
			rear=0;
			a[rear]=ele;
		}else{
			rear=(rear+1)%l;
			a[rear]=ele;
		}System.out.print("Element in Queue is:  ");
		if(rear>front) {
			for(int i=front;i<=rear ; i++) {
				System.out.print("\n "+a[i]);
				
			}}
			else {
				for(int i=0;i<l ; i++) {
					System.out.print("\n "+a[i]);
					
				}
			}
		System.out.println("\n -----------------------------");

		
		
		//insert equal
		for(int i=rear+1;i<l ; i++) {
				System.out.print("\n Element = ");
				a[i]=sc.nextInt();	
				rear++;
			}
		System.out.print("Element in Queue is:  ");
		if(rear>front) {
			for(int i=front;i<=rear ; i++) {
				System.out.print("\n "+a[i]);
				
			}}
			else {
				for(int i=0;i<l ; i++) {
					System.out.print("\n "+a[i]);
					
				}
			}
		System.out.println("\n -----------------------------");

		//1
				if (front==-1 && rear==-1)
					System.out.print("\n Dequue operation is not possible");
				else 
					System.out.print("\n Dequue operation is possible");
				System.out.println("\n -----------------------------");
				
				//2

				if(front==rear) {
					front=rear=-1;
				}else{
					front=(front+1)%l;
				}
				if (front==-1 && rear==-1)
					System.out.print("\n one element deleted, now queue is empty");
				else
					System.out.println("\n Element deleted ");

				System.out.println("\n -----------------------------");

				//3
				front=(front+1)%l;
				for(int i=front; i<=rear ; i++) {
					System.out.print("\n "+a[i]);
				}
				
				
			
	}

}
