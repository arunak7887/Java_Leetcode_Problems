import java.util.*;

class Young_Not_Young{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age :");
		int age=sc.nextInt();		
		if(age>18){
			System.out.println("person is young");
		}else{
			System.out.println("person is not young");
		}
	}
}