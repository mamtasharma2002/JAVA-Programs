class Example{
    private int i;

    public void Setdata(int ii)
    {
        i = ii;
        this.i = ii;
    }
public void ShowData()
{
  System.out.println(i);
  System.out.println(this.i);  
}
}
public class thisrefrence {
    public static void main(String[] args) {
        Example e1;
        e1 = new Example();
        e1.Setdata(10);
        e1.ShowData();
    }
}
