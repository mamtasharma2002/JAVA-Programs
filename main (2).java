class student {
	String name;
	int age;
	int rollno;
	public student() {
		name = "mamta";
		age  = 20;
		rollno  = 24;
	}
	public student(String name) {
		this.name = name;
		age  = 20;
		rollno  = 24;
	}
	public student(String name, int age, int rollno) {
		this.name = name;
		this.age  = age;
		this.rollno  = rollno;
	}
}
class main {
	public static void main(String[] args) {
		student s = new student();
		System.out.println(s.name + " " + s.age + " " + s.rollno + " ");
		student s1 = new student("Riya");
		System.out.println(s1.name + " " + s1.age + " " + s1.rollno + " ");
		student s2 = new student("Aayush", 21, 1);
		System.out.println(s2.name + " +" + s2.age + " " + s2.rollno + " ");
	}
}