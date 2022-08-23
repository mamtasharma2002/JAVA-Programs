/*import java.util.Scanner;
class Rectangle{
    int l;
    int b;
    Rectangle(int l,int b)
    {
        this.l = l;
        this.b = b; 
    }
    public int area(){
        return l*b;
    }

}
public class problem5 {
    public static void main(String[] args) {
    int l,b;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the length of rectange:");
    l =scan.nextInt();
    System.out.println("Enter the breadth of the rectangle:");   
    b = scan.nextInt();
    Rectangle r = new Rectangle(l,b);
    System.out.println("The area of the rectangle is: "+r.area());
}
}*/
import java.util.Scanner;

class rectangle{
    int l;
    int b;
    rectangle(int l,int b){
        this.l = l;
        this.b = b;
    }
    public int area(){
        return l*b;
    }
}
public class problem5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l,b;
        System.out.println("enter the value of length");
        l = sc.nextInt();
        System.out.println("enter the value of breath");
        b = sc.nextInt();
        rectangle r = new rectangle(l,b);
        System.out.println("The area of rectangle is :" +r.area() );
        
    }
}





