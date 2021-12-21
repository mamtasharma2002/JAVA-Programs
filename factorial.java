import java.util.Scanner;
class factorial
{
    public static int fact(int num)
    {
        int i,fact = 1;
        for(i= 1;i<num;i++)
        {
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        sc.close();
        System.out.println("factorial is " + fact(num));
    }
}