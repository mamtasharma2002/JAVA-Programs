interface a{
    public void name();
}
interface b{
    public void sound();
}
class multipleinheritance implements a, b{
    public void name(){
        System.out.println("i am mamta");
    }
    public void sound(){
        System.out.println("she sounds good");
    }
}
public class text {
    public static void main(String[] args) {
        multipleinheritance m1 = new multipleinheritance();
        m1.name();
        m1.sound();
    }
}
