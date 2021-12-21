//nesting of loops
class loop {
	public static void main(String[] args) {
		int r, c, sum;
		for (r = 1; r <= 3; r++) {
			for (c = 1; c <= 2; c++) {
				sum = r + c;
				System.out.println("r =" + r + "c =" + c + "sum =" + sum);
			}
		}
	}
}