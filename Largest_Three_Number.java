//Find the largest three distinct elements in an array
import java.util.*;

public class Largest_Three_Number{
 public static void main(String[] args) {
 	int[] v={11,65,193,36,209,664,32};
 	Arrays.sort(v);
 	int x=v.length;
 	System.out.println("First ="+v[x-1]);
 	System.out.println("Second="+v[x-2]);
 	System.out.println("Third="+v[x-3]);
 }
}