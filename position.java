import java.util.Scanner;

class position {
	public static void main(String[] args) {
		String s;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String:");
		s = sc.nextLine(); // mamta
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
				sum += s.charAt(i) - 'a' + 1;
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
				sum += s.charAt(i) - 'A' + 1;
		}
		sc.close();
		System.out.println("The sum of Character are: " + sum);
	}

}
