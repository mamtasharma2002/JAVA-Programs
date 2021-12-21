import java.util.Scanner;
class answer{
    int num1, num2;
    int ans;

    public void getval(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        num1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        num2 = sc.nextInt();
        sc.close();
    }
    public void solve(){
        ans = num1 + num2;
    }
    public void displ(){
        System.out.println(num1 + " + " + num2 + " = " + ans);
    }
}

public class SumOfTwo {
    public static void main(String[] args) {
        answer obj = new answer();
        obj.getval();
        obj.solve();
        obj.displ();
    }
}
