abstract class A {
	abstract void callme();

	void callmetoo() {
		System.out.println("this is a concreate method");

	}
}

class B extends A {
	void callme() {
		System.out.println("implementation of callme");
	}
}

class AbstractDemo {
	public static void main(String[] args) {
		B b = new B();

		b.callme();
		b.callmetoo();
	}
}