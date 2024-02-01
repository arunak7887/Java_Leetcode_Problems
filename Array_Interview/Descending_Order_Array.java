//Sort in Descending Order By Using Loop

public class Descending_Order_Array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {34,12,41,52,31,18,22};
		System.out.println("Array Elements Before Sorting");
		for(int i:a) {
			System.out.println(i);
		}
		int temp=0;
		System.out.println();
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Arrays Elements After in reverse Order");
		for(int i:a) {
			System.out.println(i+" ");
		}
	}
}
