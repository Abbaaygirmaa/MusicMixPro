
import java.rmi.*;

public class MyServer{
    public static void main(String args[]){
    try{
        MusicInterface stub=new MusicRemote();
        Naming.rebind("rmi://localhost:52260/DJ",stub);

        } catch(Exception e){System.out.println(e);}
     }
}
