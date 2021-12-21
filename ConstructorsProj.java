class construct{
    int a;
    String name;

    construct(){
        a=10;
        name = "Kartik";
    }
    public void display(){
        System.out.println(a);
        System.out.println(name);
    }
}

public class ConstructorsProj {
    public static void main(String[] args) {
        construct obj = new construct();
        obj.display();
    }
}
