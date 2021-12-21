class solution2{
    int num1; 
    int num2;
    int ans;

    public void get_value(){
        num1 = 23;
        num2 = 45;
    }
    public void calculate_value(){
        ans = num1 + num2;
    }
    public void display_value(){
        System.out.println(ans);
    }
}
public class test {
    public static void main(String[] args) {
        solution2 object = new solution2();
        object.get_value();
        object.calculate_value();
        object.display_value();
    }
}

// public class Test{
//     public static void main(String[] args) {
//         String str = "Good ";
//         str = str + "Morning.";

//         System.out.println(str);
//     }
// }