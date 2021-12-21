import java.io.*;
import java.net.*;
 class WhoIs
 {
public static void main(String[] args) throws Exception{
        String serverName = System.getProperty("WHOIS_SERVER","whois.internic.net");
        InetAddress server = InetAddress.getByName(serverName);
        Socket sc = new Socket(server, 43);

        InputStream in = new BufferedInputStream(sc.getInputStream());
        Writer os = new OutputStreamWriter(sc.getOutputStream(),"8859_1");
        os.write(args[0]);
        os.flush();
        int c;
        while((c = in.read())!= -1){
            System.out.print((char)c);
        }
        sc.close();
    }
 }