class Shape{
    public void area(){
        System.out.println("Area of shape.");
    }
}

class Sphere extends Shape{
    public void volume(){
        System.out.println("Volume of Sphere.");
    }
}

class SingleInheritance{
    public static void main(String[] args) {
        Sphere s1 = new Sphere();
        s1.volume();
        s1.area();
    }
}