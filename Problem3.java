//Design a class student carrying method to accept roll no, name, course, and marks in Five subjects. 
//It performs the operation to calculate result of the student on the following criteria:
//If student is having more than 75% marks, then result should be displayed as "First with Honors".
//If student is scoring marks between 60 to 75%, then we used to display "First".
//else "Satisfactory" should be displayed while calculating the result.

import java.util.Scanner;

class Student2{
    String name, course;
    int r_no, mark1, mark2, mark3, mark4, mark5;
    float avg;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Course: ");
        course = sc.nextLine();
        System.out.print("Enter Roll No.: ");
        r_no = sc.nextInt();
        System.out.print("Enter Marks of First subject: ");
        mark1 = sc.nextInt();
        System.out.print("Enter Marks of Second subject: ");
        mark2 = sc.nextInt();
        System.out.print("Enter Marks of Third subject: ");
        mark3 = sc.nextInt();
        System.out.print("Enter Marks of Fourth subject: ");
        mark4 = sc.nextInt();
        System.out.print("Enter Marks of Fifth subject: ");
        mark5 = sc.nextInt();
        sc.close();
    }

    public void calculate(){
        avg = (mark1 + mark2 + mark3 + mark4 + mark5 )/5;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Roll No.: " + r_no);
        System.out.println("Course: " + course);
        System.out.println("Marks on subjects: " + mark1 + "  " + mark2 + "  " + mark3 + "  " + mark4 + "  " + mark5);
        System.out.println("Average: " + avg);

        if (avg > 75){
            System.out.println("First with Honors.");
        }else if (avg <= 75 && avg > 60){
            System.out.println("First.");
        }else {
            System.out.println("Satisfactory.");
        }
    }
}

public class Problem3{
    public static void main(String[] args) {
        Student2 object = new Student2();
        object.input();
        object.calculate();
        object.display();
    }
}
