public class Exceptions {
    public static void main(String[] args) {
        int a, b, c, d, e, f;
        try{
            a = Integer.parseInt(args [0]);
            b = Integer.parseInt(args [1]);
            c = a + b;
            d = a -b;
            e = a * b;
            f = a / b;
            System.out.println(c);
            System.out.println(d);
            System.out.println(e);
            System.out.println(f);
        }catch(ArrayIndexOutOfBoundsException ab){
            System.out.println("Enter two values through CLA.");
        }catch(NumberFormatException nm){
            System.out.println("Enter number of integer format.");;
        }catch(ArithmeticException ae){
            System.out.println("Divide By zero error");
        }catch(Exception exc){
            System.out.println(exc);
        }
    }
}
