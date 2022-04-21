
import java.rmi.*;
import java.rmi.server.*;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.JOptionPane;
import java.io.File;

public class MusicRemote extends
        UnicastRemoteObject implements MusicInterface {

    MusicRemote() throws RemoteException {
        super();
    }

    @Override
    public void playAudio() {
       try {
            JFXPanel j=new JFXPanel();
            String urip=new File("sd.m4a").toURI().toString();
            new MediaPlayer(new Media(urip)).play();    
            JFXPanel a=new JFXPanel();
            
            String uripi;
           uripi = new File("kk.mp4").toURI().toString();
            new MediaPlayer(new Media(urip)).play();    
        } catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex);
        }
        
        
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void playAudio(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
