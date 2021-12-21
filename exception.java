import java.util.*;
public class exception {
  public static void main (String [] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        try{
        int num = Integer.parseInt(sc.next());
        }catch(Exception e){
            System.out.println("program hits an error");
        }finally{
            sc.close();
        }

    }

}

