abstract class vehicle{
    public abstract void speed();
    public abstract void maintainance();
    public abstract void value();
}
class fourwheeler extends vehicle{
    public void speed(){
        System.out.println("in speed of four wheeler");
    }
    public void maintainance(){
        System.out.println("in maintainence of four wheeler");        
    }
    public void value()
    {
        System.out.println("The value of four wheeler");
    }
}
class twowheeler extends vehicle{
    public void speed(){
        System.out.println("in speed of two wheeler");
    }
    public void maintainance(){
        System.out.println("in maintainence of two wheeler");        
    }
    public void value()
    {
        System.out.println("The value of two wheeler");
    }
}
class airborne extends vehicle{
    public void speed(){
        System.out.println("the speed of airborne");
    }
    public void maintainance(){
        System.out.println("in maintainence of  airborne");        
    }
    public void value()
    {
        System.out.println("The value of airborne");
    }
}
public class sbstract {
    public static void main(String[] args) {
        vehicle maruti,bajaj,jumbo;

        maruti = new fourwheeler();
        bajaj = new twowheeler();
        jumbo = new airborne();

        maruti.speed();
        maruti.maintainance();
        maruti.value();
        
        bajaj.speed();
        bajaj.maintainance();
        bajaj.value();

        jumbo.speed();
        jumbo.maintainance();
        jumbo.value();

         
    }
}
