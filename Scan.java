import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        String name, course;
        char gen;
        int sem, age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter gender: ");
        gen = sc.next().charAt(0);
        System.out.print("Enter Course: ");
        sc.nextLine();
        course = sc.nextLine();
        System.out.print("Enter semester: ");
        sem = sc.nextInt();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        sc.close();

        System.out.println(name + " - " + age + " - " + gen + " - " + course + " - " + sem);
    }
}
