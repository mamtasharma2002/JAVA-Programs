// import predefined class scanner from java.util package
import java.util.Scanner;
public class input{
	public static void main(String[] args)
	{
		// creating object of scanner class
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age:");
// use nextInt function of Scanner Class
		int age = sc.nextInt();
		System.out.println("Your age is " + age);
		// more functions in scanner class
		// nextLine() string
		// nextChar character
		//nextFloat float
		
	}
}