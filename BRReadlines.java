// import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadlines {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines to text");
        System.out.println("Enter 'STOP' to quit");
        do{
            str = br.readLine();
            System.out.println(str);

        }
        while(!str.equals("STOP"));
    }
}
