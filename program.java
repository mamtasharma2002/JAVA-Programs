class program {
	public static void main(String[] args) {
		String name = args[0];
		int age = 0;
		int rollno = 0;
		try {
			age = Integer.parseInt(args[1]);
			rollno = Integer.parseInt(args[2]);
		} catch (Exception ex) {
			System.out.println(ex);
		} finally {
			System.out.println("The name is: " + name);
		}
		System.out.println("The age is: " + age);
		System.out.println("The age is: " + rollno);
	}
}