
public class functioncallproject {
    public static void main(String [] args)
    {
        System.out.println("i am in main");
        italy();
        System.out.println("i am finally back to main");
    }
    static void italy()
    {
        System.out.println("i am in italy");
        brazil();
        System.out.println("i am finally back to italy");
    }
    static void brazil()
    {
        System.out.println("i am in brazil");
        argentina();
    }
    static void argentina()
    {
        System.out.println("i am in argentina");
    }
}
