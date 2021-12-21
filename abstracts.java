// class containing both abstract and non abstract method is called abstract class
// we cannot make object of abstract class
// abstract methords are methods with no body
abstract class student {
    abstract public void print();

    public void show() {
        System.out.println("I am in abstract class");
    }
}

class stu extends student {
    public void print() {
        System.out.println("I am print from abstract class");
    }
}

class abstracts {
    public static void main(String[] args) {
        stu s = new stu();
        s.print();
        s.show();
    }
}