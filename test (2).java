class test {
	public static void main(String [] args) {
		int num1 ;
		int num2 ;
		int sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number:" );
		num1 = sc.nextInt();
		System.out.println("enter the second number:" );
		num2 = sc.nextInt();

		sum = num1 + num2;
		System.out.println("sum:" + sum);
	}
}