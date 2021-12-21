class publisher{
    public void print()
    {
        System.out.println("There are 100 pages in book");
    }
    public void print(int a)
    {
        System.out.println("There are "+a+" pages in book");
    }
    public void show()
    {
        System.out.println("This is publisher");
    }
}
class book extends publisher{
    public void show()
    {
        System.out.println("This is book");
    }
}
public class olandor {
    public static void main(String[] args) {
        book b = new book();
        b.show();
    }
}