import java.util.Scanner;

interface Shape4{
    public void Color();
    public void Area();
    public void Volume();
}
class Rectangle implements Shape4{
    public void Show(){
        System.out.println("\t\t==========RECTANGLE==========");
    }
    public void Color(){
        System.out.println("The color of Rectangle is Red.");
    }
    public void Area(){
        System.out.println("The area of Rectangle is calculated using: l * b");
    }
    public void Volume(){
        System.out.println("Volume of Rectangle can't be found.\n");
    }
}
class Circle implements Shape4{
    public void Show(){
        System.out.println("\t\t==========CIRCLE==========");
    }
    public void Color(){
        System.out.println("The color of Circle is Crimson.");
    }
    public void Area(){
        System.out.println("The area of Circle is calculated using: pi * r * r");
    }
    public void Volume(){
        System.out.println("Volume of Circle can't be found.\n");
    }
}
class Square implements Shape4{
    public void Show(){
        System.out.println("\t\t==========SQUARE==========");
    }
    public void Color(){
        System.out.println("The color of Square is Magenta.");
    }
    public void Area(){
        System.out.println("The area of Square is calculated using: a * a");
    }
    public void Volume(){
        System.out.println("Volume of Square can't be found.\n");
    }
}
public class problem4 {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle();
        Circle obj2 = new Circle();
        Square obj3 = new Square();
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Rectangle.");
        System.out.println("2. Circle.");
        System.out.println("3. Square.");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.close();
        switch (choice) {
            case 1:
                obj1.Show();
                obj1.Area();
                obj1.Color();
                obj1.Volume();
                break;
            case 2:
                obj2.Show();
                obj2.Area();
                obj2.Color();
                obj2.Volume();
                break;
            case 3:
                obj3.Show();
                obj3.Area();
                obj3.Color();
                obj3.Volume();
        
            default:
                System.out.println("Invalid Input.");
                break;
        }
   }
}
