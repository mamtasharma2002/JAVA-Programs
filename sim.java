class A {
	int i, j;

	void showij() {
		System.out.println("i and j : " + i + " " + j);
	}
}

class B extends A {
	int k;

	void showk() {
		System.out.println("k : " + k);
	}
		void sum()	{
			System.out.println("i+j+k:" + (i + j + k));
		}
}
class simpleinheritance {
	public static void main(String[] args) {
		A superOb = new A();
		B subOb = new B();

		superOb.i = 10;
		superOb.j = 20;

		System.out.println("contents of superOb");
		superOb.showij();
		System.out.println();

		subOb.i = 5;
		subOb.j = 6;
		subOb.k = 7;
		System.out.println("contents of subOb");
		subOb.showij();
		subOb.showk();
		System.out.println();

		System.out.println("sum of i,j and k in subOb:");
		subOb.sum();
	}
}
