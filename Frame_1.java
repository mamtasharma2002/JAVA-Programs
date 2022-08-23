import java.awt.*;
import java.awt.event.*;

public class Frame_1 extends Frame implements ActionListener{
 Frame frm_1;
 Label lb_1,Lb_2,Lb_3;
 TextField txt_fld;
 Button btn;

 Frame_1(){
     frm_1 = new Frame("firs program");
     lb_1 = new Label("enter message");
     Lb_2 = new Label("message content");
     Lb_3 = new Label("");
     txt_fld = new TextField("30");
     btn = new Button("click");
     btn.addActionListener(this);


    FlowLayout f1 = new FlowLayout();
    frm_1.setSize(300,300);
    frm_1.setLayout(f1);
    frm_1.setVisible(true);
    frm_1.add(lb_1);
    frm_1.add(txt_fld);
    frm_1.add(Lb_2);
    frm_1.add(Lb_3);
    frm_1.add(btn);

    }
   
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn){
            String str = txt_fld.getText();
            Lb_2.setText(str);
        }
        
    }
    public static void main(String[] args) {
        Frame_1 frame = new Frame_1();
                
    }
    
}
