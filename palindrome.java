import java.util.Scanner;

class palindrome {
    public void pallindrome(int n) {
        int temp = n;
        int rev = 0, rem;
        while (n > 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        if (rev == temp) {
            System.out.println("It is a pallindrome number");
        } else {
            System.out.println("It is a not pallindrome number");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        palindrome obj = new palindrome();
        obj.pallindrome(n);
        scan.close();
    }
}
