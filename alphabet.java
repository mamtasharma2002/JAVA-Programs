class alphabet {
	public static void main(String[] args) {
		char c;
		for (c = 'A'; c  <= 'Z'; c++) {
			System.out.print(c + " ");
			System.out.print((char)(c + 32) + " ");
		}
	}
}