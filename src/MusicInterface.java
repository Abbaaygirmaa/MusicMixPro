import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.*;

public interface MusicInterface extends Remote{
public void playAudio()throws RemoteException;
public void run();

    public void playAudio(String string);
}

