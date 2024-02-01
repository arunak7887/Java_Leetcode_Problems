//sort the array by using Array Class sort() Method ?

import java.util.Arrays;
public class Array_Class_Sort {
	public static void main(String[] args) {
		int arr[]= {34,12,41,52,31,18,22};
		System.out.println("Arrays Elements Before Sorting");
		for(int i:arr) {
			System.out.println(i+ " ");
		}
		Arrays.sort(arr);
		System.out.println("\n"+"Array after sorting ascending Array");
		for(int i:arr) {
			System.out.println(i+" ");
		}
	}
}
