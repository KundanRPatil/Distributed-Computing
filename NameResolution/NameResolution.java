import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class NameResolution{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n Enter the website url (Like google.com) to resolve its name to address");
        String name = br.readLine();
        try{
            InetAddress ip = InetAddress.getByName(name);
            System.out.println("\n IP Address: "+ip.getHostAddress());
        }catch(UnknownHostException e){
            System.out.println("\n\n No such Host is present...");
            System.out.println("\n Try Again");
        }
    }
}
