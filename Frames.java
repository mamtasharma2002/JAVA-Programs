import java.awt.*;
import java.awt.event.*;
import java.lang.Override;

import javax.swing.Action;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.applet.*;
public class Frames extends Applet implements ActionListener {

    Label lb_1,lb_2,lb_ans;
    TextField txt_1,txt_2,txt_ans;
    Button btn_add,btn_sub,btn_mul,btn_div;
    private Component TextField;


    public void init(){
     lb_1 = new Label("Num 1");
     lb_2 = new Label("Num 2");
     lb_ans = new Label("ans");
     txt_1 = new TextField("20");
     txt_2 = new TextField("20");
     btn_add = new Button("ADD");
     btn_sub = new Button("SUBTRACT");
     btn_mul = new Button("MULTIPLY");
     btn_div = new button("DIVIDE");

     FlowLayout f1 = new FlowLayout();
     setLayout(f1);
     add(Label lb_1);
     add(TextField txt_1);
     add(lb_2);
     add()
    }
}