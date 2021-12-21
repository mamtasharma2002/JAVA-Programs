import java.util.Scanner;

class armstrong {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int temp = n; 
        int num2=0, rem;
        while (n>0) {
            rem = n%10;
            num2 = num2+(int)Math.pow(rem, 3);
            n=n/10;
        }
        if (num2 == temp) {
            System.out.println("It is a armstrong number");
        } else {
            System.out.println("It is a not armstrong number");
        }
        scan.close();
    }
}
