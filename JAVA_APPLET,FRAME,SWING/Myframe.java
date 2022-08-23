import javax.swing.JFrame;
import java.awt.Frame;
import java.awt.Image;
import javax.swing.ImageIcon;


public class Myframe extends Main  {
    Myframe(){
      
        // jframe = a gui window to add components 
        this.setSize(420,420);//set the x and y dimendion of the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
        this.setResizable(false);//prevent frame from being resized
        this.setTitle("Its GUI programming");//sets the title of the frame
        this.setVisible(true);//makes frame visible

        ImageIcon i1 = new ImageIcon("logo.jfif");//create an image icon
        this.setIconImage(i1.getImage());//change icon of frame
        this.getContentPane().setBackground(new java.awt.Color(123,6,0));//change colour of background
        
    }

    private Frame getContentPane() {
        return null;
    }

    private void setIconImage(Image image) {
    }

    private void setVisible(boolean b) {
    }

    private void setResizable(boolean b) {
    }

    private void setTitle(String string) {
    }

    private void setDefaultCloseOperation(int exitOnClose) {
    }

    private void setSize(int i, int j) {
    }

  

}
