import java.util.Scanner;

class armstrong2 {
    public static void armstrong(int n) {
        int temp = n;
        int num = 0;
        int rem;
        while (temp != 0) {
            rem = temp % 10;
            num = num + (rem * rem * rem);
            temp = temp / 10;
        }
        if (num == n) {
            System.out.println("The number is an armstrong number");
        } else {
            System.out.println("The number is not an armstrong number");

        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        armstrong(n);
        scan.close();
    }
}
