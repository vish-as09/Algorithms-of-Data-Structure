import java.util.*;
public class evaluateExpressin {

	public static void main(String[] args) {
		//postfix expression
		Scanner sc= new Scanner(System.in);
		System.out.println("\n Enter expression : ");
				String expression=sc.next();
				int l=expression.length();
				int top2=-1;
				int [] exp = new int [l];
				for(int i=0;i<l ; i++) {
					top2++;
					char num=expression.charAt(i);
					if (Character.isDigit(num)){
						exp[top2] = num - '0';

					}else {
						int a=exp[--top2];
						int b=exp[--top2];
						if(num=='+') 
							exp[top2]=b+a;
						else if (num=='-')
							exp[top2]=b-a;
						else if (num=='*')
							exp[top2]=b*a;
						else if(num=='/')
							exp[top2]=b/a;
					}
				}
				System.out.print("\n Result is : "+exp[0]);
				System.out.println("\n ---------------------------");
				
	}

}
