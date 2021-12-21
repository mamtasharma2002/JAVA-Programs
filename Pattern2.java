import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        int row, i, j, k;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        row = sc.nextInt();
        for (i = 1; i <= row; i++){
            for (j = row; j >= i; j--){
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
