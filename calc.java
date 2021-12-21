class object
{
   int num1;
   int num2;
   int result;

   public void perform()
   {
       result = num1+num2;
   }
}
public class calc{
         public static void main(String[] args)
    {
          object cal = new object();
          cal.num1 = 4;
          cal.num2 = 4;

          cal.perform();

          System.out.println(cal.result);
    }
}
