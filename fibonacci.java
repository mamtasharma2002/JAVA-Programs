import java.util.Scanner;

public class fibonacci {
    //recursion 
    public static int fibonacci(int n)
    {
        if(n<=1) return n;
        return fibonacci(n - 1)+fibonacci(n - 2);
    }
    public static int fib(int n)
    {
        int res =1;
        for (int i = 1; i <=n; i++) {
            res = res+i;
        }
        return res;
    }
    public static void main(String[] args) {
        int n  = 100;
        System.out.println(fib(n));
    }
}
