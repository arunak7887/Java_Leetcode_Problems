class MaxNumber{
	public static void main(String[] args) {
	int num1=15;
	int num2=10;
	int num3=25;

    if(num1 > num2 && num1 > num3)
      largest = num1;
    else if (num2 > num3)
      largest = num2;
    else
      largest = num3;
 
    
    if(num1 < num2 && num1 < num3)
      smallest = num1;
    else if (num2  < num3)
      smallest = num2;
    else
      smallest = num3;
 
    int second = num1 + num2 + num3 -(largest+smallest);
    System.out.println("The largest number is "+largest);
    System.out.println("The Smllest number is "+smallest);

    System.out.println("The second largest number is "+second);
	}
}