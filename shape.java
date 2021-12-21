class line{
    public void draw()
    {
        System.out.println("draw the line");
    }
}
class circle extends line{
    public void draw()
    {
        System.out.println("draw the circle");
    }
}
class rectangle extends line{
    public void draw()
    {
        System.out.print("draw the rectangle");
    }
}
public class shape {
    public static void main(String[] args) {
        line l1;

        line c1 = new circle();
        rectangle r1 = new rectangle();
        l1 = c1;
        l1.draw();
        l1 = r1;
        l1.draw();


    }
}
    

