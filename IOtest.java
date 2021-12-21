import java.io.*;

public class IOtest {
    public static void main(String[] args) {
        try  {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Users\\sharm\\OneDrive\\Desktop\\bca java\\aa.txt"));
            dos.writeChars("Hi how are you");
            dos.close();
            // FileOutputStream fs = new FileOutputStream("C:\\Users\\sharm\\OneDrive\\Desktop\\bca java\\aa.txt");
            // fs.write("Hello".getBytes());
            // fs.close();
        } catch (IOException e) {
            // TODO Auto-generated catch bloczk
            e.printStackTrace();
        }
    }
}
