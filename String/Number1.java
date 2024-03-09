class Number1{
	public static void main(String[] args) {
		int n = 10;
		int f1 = 0;
		int f2 = 1;
		int sum=5;

        for (int i = 1; i <= n; i++){

           System.out.println(sum + " ");

           int sum = f1 + f2;

            f1 = f2;

            f2 = sum;

            sum += f1;

        }
	}
}