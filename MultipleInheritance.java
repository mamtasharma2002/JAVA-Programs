interface a {
    public void name();
}

interface b {
    public void sound();
}

class Test34 implements a, b {
    public void name() {
        System.out.println("Mamta");
    }

    public void sound() {
        System.out.println("Bark.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Test34 obj = new Test34();
        obj.name();
        ;
        obj.sound();
    }
}
