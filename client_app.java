import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class client_app {
    public static void main(String[] args) {
        try {
            Socket sc = new Socket("localhost", 3333 );
            DataOutputStream ds = new DataOutputStream(sc.getOutputStream());
            ds.writeUTF("Hello to all");
            ds.flush();
            ds.close();
            sc.close();
            ServerSocket SS =  new ServerSocket(3333);
            Socket SC = SS.accept();
            DataInputStream DIS  = new DataInputStream(SC.getInputStream());
            String str  = (String) DIS.readUTF();
            System.out.println(str);
            DIS.close();
            SC.close();
            SS.close();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
}
