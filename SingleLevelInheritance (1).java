class Shape2{
    public void area(){
        System.out.println("Area of class Shape.");
    }
}

class  Volume extends Shape2{
    public void Volume2(){
        System.out.println("Volume of the class Volume.");
    }
}

public class SingleLevelInheritance {
    public static void main(String[] args) {
        Volume obj = new Volume();
        obj.Volume2();
        obj.area();
    }
}
