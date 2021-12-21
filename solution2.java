/*class alphabet {
	public static void main(String[] args) {
		char c;
		for (c = 'A'; c  <= 'Z'; c++) {
			System.out.print(c + " ");
			System.out.print((char)(c + 32) + " ");
		}
	}
}*/
class solution2 {
	int clg_id;
	void get_val() {
		System.out.print("In outer class");
	}
	class student {
		int stu_id;
		void display() {
			System.out.println("In inner class");
		}
	}
	static class student2 {
		int stu_id;
		void display() {
			System.out.println("In inner class");
		}
	}
	public static void main(String[] args) {
		// for non static class
		solution2 s2 = new solution2();
		solution2.student cs = s2.new student();
		cs.display();
		// for static class
		solution2.student2 static_cs = new solution2.student2();
		static_cs.display();
	}
}
