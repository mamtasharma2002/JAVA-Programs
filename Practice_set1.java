import java.util.Scanner;

public class Practice_set1 {
	public static void main(String[] args) {
		float total = 0;
		System.out.println("WEllcome to the CBSE %");
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the total marks:");
		int total_marks = input.nextInt();

		System.out.println("The marks of subject 1:");
		float s1 = input.nextFloat();
		total = total + s1;

		System.out.println("The marks of subject 2:");
		float s2 = input.nextFloat();
		total = total + s2;

		System.out.println("The marks of subject 3:");
		float s3 = input.nextFloat();
		total = total + s3;

		System.out.println("The marks of subject 4:");
		float s4 = input.nextFloat();
		total = total + s4;

		System.out.println("The marks of subject 5:");
		float s5 = input.nextFloat();
		total = total + s5;
		input.close();
		float grandtotal = total * 100 / (total_marks * 5);
		System.out.println("Total Percentage =" + grandtotal + "Percentage");
		System.out.println("Made by Babita");
	}

}