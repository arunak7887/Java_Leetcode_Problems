Sort The Array in increasing order ?

public class SortArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[7];
		a[0]=12;
		a[1]=42;
		a[2]=31;
		a[3]=56;
		a[4]=10;
		a[5]=55;
		int temp=0;
		System.out.println("Array Elements Before Sorting");
		for(int i:a) {
			System.out.println(i);
		}
		System.out.println();
		for(int j=0;j<a.length;j++) {
			for(int k=j+1;k<a.length;k++) {
				if(a[j]>a[k]) {
					temp=a[j];
					a[j]=a[k];
					a[k]=temp;
				}
			}
		}
		System.out.println("Array Elements after Sorting");
		for(int z:a) {
			System.out.println(z+" ");
		}
	}
}
