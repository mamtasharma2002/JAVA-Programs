public class ThrowException{
    public static int age;
    public static void main(String[] args) {
        age = 30;
        if(age <= 0){
            throw new ArithmeticException("Error");
        }else{
            System.out.println(age);
        }
    }
}