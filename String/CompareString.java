import java.util.Arrays;
import java.util.Scanner;
public class CompareString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String  str1=sc.next();
		String  str2=sc.next();
		char[] c1=str1.toCharArray();
		char[] c2=str2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		int count=0;
		if(c1.length==c2.length) {
		for(int i=0;i<c1.length;i++) {
			
			if(c1[i]==c2[i]) {
				count++;	
			}	
		}
		}else {
			System.out.println("Two Strings are Not equal");
			
			
		}
		if(count==c1.length) {
			System.out.println("Two Strings are equal");
		}else {
			System.out.println("Two Strings are Not equal");
		}
		

	}

}
