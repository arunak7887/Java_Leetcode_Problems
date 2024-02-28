//Second largest element in an array
import java.util.*;
class Second_largest{
	public static void main(String[] args) {
		int arr[] = {12, 35, 1, 10, 34, 1};
		Arrays.sort(arr);
		int y=arr.length;
		System.out.println(arr[y-2]);
	}
}