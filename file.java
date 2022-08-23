import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.*;
public class file {
    public static void main(String[] args) throws Exception {
        FileWriter f1 = new FileWriter("aa.txt",true);
        BufferedWriter b1 = new BufferedWriter(f1);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name");
        String str = sc.nextLine();
        
        System.out.println("enter the college");
        String str1 = sc.nextLine();

        System.out.println("enter the course");
        String str2 = sc.nextLine();

        System.out.println("enter student rollno");
        int rollno = sc.nextInt();

        b1.write("Name:"+str + "\n");
        b1.write("Course:"+str2 + "\n");
        b1.write("college:"+str1+ "\n");
        b1.write("rollno:"+rollno+"\n");
        b1.close();
        sc.close();


    }
}
