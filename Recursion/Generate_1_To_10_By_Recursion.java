//write java program generate numbers from 1 to 10 by using recursion

Code:
public class Generate_1_To_10_By_Recursion {
	public static void main(String[] args) {
		printNumber(1);
	}
	public static void printNumber(int n) {
		if(n<=10) {
			System.out.println(n+" ");
			printNumber(n+1);
		}
	}
}

OutPut:

1
2
3
4
5
6
7
8
9
10
