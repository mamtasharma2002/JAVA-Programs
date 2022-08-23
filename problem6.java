class Student{
    private int rollno;
    private String name;
    private int classs;
    Student(int rollno,String name,int classs)
    {
        this.rollno = rollno;
        this.name = name;
        this.classs = classs;
    }
    Student(Student c)
    {
      this.classs = c.classs;
      this.name = c.name;
      this.rollno = c.rollno;
    }
    void printData()
    {
        System.out.println("Name of student:"+this.name);
        System.out.println("Roll No. of student:"+this.rollno);
        System.out.println("Class of student:"+this.classs);
    }
}
public class problem6 {
    public static void main(String[] args) {
        Student s1 = new Student(22,"Mamta",12);
        Student s2 = new Student(s1);
        s1.printData();
        s2.printData();
    }
}
