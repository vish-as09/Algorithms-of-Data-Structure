import java.util.*;
class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
class  linkedList{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter first element: ");
		int n=sc.nextInt();
		Node head=new Node(n);
		Node temp=head;
		while(true) {
			System.out.print("\n Add element");
			System.out.print("\n [1. Yes]");
			System.out.println("\n [0. No]");
			int choice=sc.nextInt();
			if(choice==1) {
				System.out.print("\n Enter element : ");
				int d=sc.nextInt();
				temp.next=new Node(d);
				temp=temp.next;
			}else
				break;
			
		}
		System.out.println("\nLinked List:");
        temp = head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }sc.close();
	}

}
