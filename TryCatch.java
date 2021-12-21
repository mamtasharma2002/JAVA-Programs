public class TryCatch {
    public static void main(String[] args) {
        int i = 28;
        int j = 0;
        try{
            int l = i/j;
            System.out.println(l);
        }catch(Exception e){
            System.out.println("Error is present here.");
            System.out.println(e);
        }
        System.out.println("Program Completed.");
    }
}
