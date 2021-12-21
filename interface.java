interface Shape3{
    public void Area();
    public void Volume();
}

class Cuboid implements Shape3{
    public void Area(){
        System.out.println("Area of Cuboid.");
    }
    public void Volume(){
        System.out.println("Volume of Cuboid.");
    }
}

public class Interface {
    public static void main(String[] args) {
        Cuboid obj = new Cuboid();
        obj.Area();
    }
}
