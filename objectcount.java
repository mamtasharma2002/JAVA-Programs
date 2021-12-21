class emp {
	public static int n = 0;

	public emp() {
		n++;
	}
}

class objectcount {
	public static void main(String[] args) {
		emp e1 = new emp();
		emp e2 = new emp();
		emp e3 = new emp();
		emp e4 = new emp();
		System.out.println("The number of objects are: " + emp.n);
	}
}