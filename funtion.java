class function {
	public static void main(String[] args) {
		int i = -25, j;
		long l = -1000, k;
		double d = -12.34, e;

		j = abs(i);
		k = abs(l);
		e = abs(d);
		System.out.println("j = " + j + "k = " + k + "e =" + e);
	}
	static int abs(int ii) {
		return (ii > 0 ? ii : ii * -1);
	}
	static long abs (int ll) {
		return (ll > 0 ? ll : ll * -1);
	}
	static double abs (int dd) {
		return (dd > 0 ? dd : dd * -1);
	}

}