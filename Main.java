import java.util.Scanner;
class calculator {
	public int add(int a, int b) {
		return a + b;
	}
	public int sub(int a, int b) {
		return a - b;
	}
	public int mul(int a, int b) {
		return a * b;
	}
	public int div(int a, int b) {
		return a / b;
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second number: ");
		int num2 = sc.nextInt();
		sc.close();
		calculator obj = new calculator();
		obj.add(num1, num2);
		obj.sub(num1, num2);
		obj.mul(num1, num2);
		obj.div(num1, num2);
	}
}