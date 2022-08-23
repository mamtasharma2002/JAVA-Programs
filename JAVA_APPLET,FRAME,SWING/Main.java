import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComponent;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class Main {
    public static void main(String[] args) {
        /*jframe = a gui window to add components 
        JFrame j1 = new JFrame();//create a frame
        j1.setSize(420,420);//set the x and y dimendion of the frame
        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
        j1.setResizable(false);//prevent frame from being resized
        j1.setTitle("Its GUI programming");//sets the title of the frame
        j1.setVisible(true);//makes frame visible

        ImageIcon i1 = new ImageIcon("logo.jfif");//create an image icon
        j1.setIconImage(i1.getImage());//change icon of frame
        j1.getContentPane().setBackground(new java.awt.Color( j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application));//change colour of background
        j1.getContentPane().setBackground(new java.awt.Color( j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application));//change colour of background
        */

        // JLable = a gut display ares for a string of text, an image, or both
        ImageIcon ig = new ImageIcon("logo.jfif");
        JLabel jl = new JLabel();//create a lable
        jl.setText("hey, hello how are you ");//set text of lable
        jl.setIcon(ig);
        jl.setHorizontalTextPosition(JLabel.CENTER);//set text to the given positions
        jl.setVerticalTextPosition(JLabel.TOP);//set the text top,centre,bottom of imageicon
        jl.setForeground(new colour());


        JFrame j1 = new JFrame();//create a frame
        j1.setSize(420,420);//set the x and y dimendion of the frame
        j1.setVisible(true);//makes frame visible
        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
        j1.add(jl);

    }
}
