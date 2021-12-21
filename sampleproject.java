class sampleproject {
	static void printfab(int a, int n) {
		if (a == n)
			return;
		System.out.println(fab(a));
		printfab(++a, n);
	}

	static int fab(int n) {
		if (n == 0 || n == 1)
			return 1;
		else
			return fab(n - 1) + fab(n - 2);
	}

	public static void main(String[] args) {
		printfab(0, 25);
	}
}
