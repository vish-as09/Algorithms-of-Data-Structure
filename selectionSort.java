
public class selectionSort {

	public static void main(String[] args) {
		int []a = {33,21,56,9,11,18,7};
		for(int i=0 ; i<a.length-1 ; i++) {
			int min=i;
			for(int j=i+1; j<a.length ; j++) {
				if(a[j]<a[min])
					min=j;
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
			
		}
		for(int i=0 ; i<a.length ; i++)
			System.out.print(a[i]+" ");

	}
	
}
