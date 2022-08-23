
\import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class serverapp {
    public static void main(String[] args) {
        try {
            ServerSocket ss =  new ServerSocket(3333);
            Socket sc = ss.accept();
            DataInputStream dis  = new DataInputStream(sc.getInputStream());
            String str  = (String) dis.readUTF();
            System.out.println(str);
            dis.close();
            sc.close();
            ss.close();
            Socket so = new Socket("localhost",3333);
            DataOutputStream sd = new DataOutputStream(so.getOutputStream());
            sd.writeUTF("How are you ");
            sd.flush();
            sd.close();
            so.close();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }

    
}
