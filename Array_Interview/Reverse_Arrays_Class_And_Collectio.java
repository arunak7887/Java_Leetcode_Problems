//reverse order by using Arrays class and collection
import java.util.*;
public class Arrays_Class_And_Collection {

	public static void main(String[] args) {
		Integer a[] ={34,12,41,52,31,18,22};
		System.out.println("Arrays Emelents Before Sorting");
		for(int i:a) {
			System.out.println(i+" ");
		}
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("\nArray Elements after sorting in reverse order");
		for(int i:a) {
			System.out.println(i+" ");
		}
		

	}

}
