 class index{
    protected int count;
     
    public index()
    {
        count = 0;
    }
    public void display()
    {
        System.out.println("count = " + count);
    }
    public void increament()
    {
        count = count + 1;
    }
    
}
class index1 extends index
{
     public void decrement()
     {
         count = count-1;
     }
}
public class inheritance
{
    public static void main(String [] args) {
        index1 i;
        i = new index1();
        i.increament();
        i.display();
        i.decrement();
        i.display();
    }
}
