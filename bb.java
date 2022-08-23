import java.util.Scanner;
class calculate{
	private int result;
	public calculate(int a,int b)
	{
		System.out.println("1.Add \n2.Sub \n3.Multiply \n4.Divide \n5.exit");
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		if(n==1)
			result = a+b;
		else if(n==2)
			result = a-b;
		else if(n==3)
			result = a*b;
		else if(n==4)
			result = a/b;
		else
			System.exit(0);
	}
	public void printResult(){
		System.out.println(result);
	}
}
class bb{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a =scan.nextInt();
		int b =scan.nextInt();
		calculate c = new calculate(a,b);
		c.printResult();
	}
}