class College1{
    public void coldis(){
        System.out.println("College1 class.");
    }
    static class Student1{
        void showMsg(){
            System.out.println("Student1 Class.");
        }
    }
}

public class StaticClass {
    public static void main(String[] args) {
        College1 c1 = new College1();
        c1.coldis();
        College1.Student1 cs = new College1.Student1();
        cs.showMsg();
    }
}
