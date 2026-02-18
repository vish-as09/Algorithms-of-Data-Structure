
public class insertionSort {

	public static void main(String[] args) {
		int []a= {7,3,5,2,9,6};
		int key;
		for(int j=1;j<a.length;j++) {
			key=a[j];
			int i=j-1;
			while(i>=0 && a[i]>key) {
				a[i+1]=a[i];
				i--;
			}
			a[i+1]=key;
		}
		for(int j=0;j<a.length;j++) 
			System.out.print(a[j]+" ");
	}

}
