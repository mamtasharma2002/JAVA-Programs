import java.util.Scanner;

class Shailuda{
    public static void main(String[] args) {
        int a, b, c, d, e, sum, per;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in 5 subjects.");
        System.out.println("Enter marks in English: ");
        a = sc.nextInt();
        System.out.println("Enter marks in Hindi: ");
        b = sc.nextInt();
        System.out.println("Enter marks in Physics: ");
        c = sc.nextInt();
        System.out.println("Enter marks in Chemistry: ");
        d = sc.nextInt();
        System.out.println("Enter marks in Maths: ");
        e = sc.nextInt();
        sum = a + b + c + d+ e;
        per = sum /5;
        System.out.println("Percentage: " + per);
        sc.close();
    }
}