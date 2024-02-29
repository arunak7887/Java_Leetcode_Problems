import java.util.*;
class Binary_Octal_Radix{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String num;
		System.out.println("Enter A Number");
		num=sc.next();

		if(num.matches("[01]+")){
			System.out.println("Binary Radi=2");
		}else if(num.matches("[0-7]+")){
				System.out.println("Octal Radix=8");
			}

		else if(num.matches("[0-9]+")){
			System.out.println("Decimal Radix=10");


		}else if (num.matches("[0-9A-F]+")) {
			System.out.println("Hexa Radix=16");			
		}else{
			System.out.println("It Is Not number");
		}
		

	}
}