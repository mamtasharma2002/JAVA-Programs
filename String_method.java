class String_method {
	public static void main(String[]args) {
		String name = "Babita";
		// System.out.println(name);
		int value = name.length();
		System.out.println(value);

		String lstring = name.toLowerCase();
		System.out.println(lstring);

		String Ustring = name.toUpperCase();
		System.out.println(Ustring);

		String nonTrimmedString = "    Babita    ";
		System.out.println(nonTrimmedString.trim());

		String TrimmedString = "Babita";
		System.out.println(TrimmedString);

		System.out.println(name.substring(2));
		System.out.println(name.substring(0, 6));



	}
}