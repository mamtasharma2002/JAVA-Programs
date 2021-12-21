//interface and abstract class
interface father {
	public void fun();
	public void fun2();
}
interface mother {
	public void fun3();
	public void fun4();
}
class child implements father, mother {
	public void fun() {
		System.out.println("i am in a fun");
	}
	public void fun2() {
		System.out.println("i am in a fun2");
	}
	public void fun3() {
		System.out.println("i an in a fun3");
	}
	public void fun4() {
		System.out.println("i am in a fun4");
	}
}
abstract class abstractclass {
	public int a;
	abstract void fun();
}
class inherited extends abstractclass {
	void fun() {
		System.out.println("i am in a fun");
	}
}
public class program2 {
	public static void main(String [] args) {
		child c = new child();
		c.fun();
		c.fun4();
	}
}