//Write to Generate squares of each numbers from 1 to 10 by using recursion
public class Generate_Squares_1_To_10_Using_Recursion {
	public static void main(String args[]) {
		printNum(1);
	}
	public static void printNum(int n) {
		if(n<=10) {
			System.out.println(n*n+" ");
			printNum(n+1);
		}
	}
}
