import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
public class Form extends JFrame implements ActionListener{
    JLabel reg, roll, name, add, course, sem, dept, sub, gen;
    JTextField t_roll, t_name, t_add ;
    JButton b_sav,b_exi;

    Form(){
        reg = new JLabel("Registration form");
        roll = new JLabel("Roll No");
        name = new JLabel("Name");
        add = new JLabel("Address");
        course = new JLabel("Course");
        sem = new JLabel("sem");
        dept = new JLabel("department");
        sub = new JLabel("subject");
        gen = new JLabel("Gender");

        t_roll = new JTextField(20);
        t_name = new JTextField(20);
        t_add = new JTextField(20);

        b_sav = new JButton("SAVE");
        b_exi= new JButton("EXIT");

        JFrame jf = new JFrame();
        /*jf.setBackground(Color.BLUE);*/
        jf.setLayout(null);
        reg.setSize(100, 20);
        reg.setLocation(550, 20);
        jf.add(reg);

        roll.setSize(100,20);
        roll.setLocation(20, 50);
        jf.add(roll);

        name.setSize(100,20);
        name.setLocation(20, 90);
        jf.add(name);

        gen.setSize(100, 20);
        gen.setLocation(20, 130);
        jf.add(gen);
        JLabel l1 = new JLabel("MALE");
        JLabel l2 = new JLabel("FEMALE");
        l1.setSize(100, 20);
        l1.setLocation(170, 130);
        jf.add(l1);
         
       /* reg.setFont(new Font("TimesRoman", Font., 44));*/
        l2.setSize(100, 20);
        l2.setLocation(220, 130);
        jf.add(l2);
        ButtonGroup bg = new ButtonGroup();
        JRadioButton jb_1 = new JRadioButton("male");
        JRadioButton jb_2 = new JRadioButton("female");
        bg.add(jb_1);
        bg.add(jb_2);
        jb_1.setSize(20, 20);
        jb_1.setLocation(150,130);
        jb_2.setSize(20, 20);
        jb_2.setLocation(200,130);
        
        jb_1.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // TODO Auto-generated method stub
                
            }
        }); 
        b_sav.addActionListener(new ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent e) {
                try{
                FileOutputStream fout=new FileOutputStream("result.txt");  
                String rollNo =t_roll.getText();
                String name = t_name.getText();
                String address =t_add.getText();
                String result = "Name : "+ name +" Roll No. : " + rollNo +" Address : " + address +"\n";
                fout.write(result.getBytes());
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        });
        jf.add(jb_1);
        jf.add(jb_2);


        add.setSize(100,20);
        add.setLocation(20, 170);
        jf.add(add);

        String course_1[] = {"BCA","BBA","MCA","MBA"};
        JComboBox jc1 = new JComboBox(course_1);
        jc1.setSize(100,20);
        jc1.setLocation(150, 200);
        jf.add(jc1);
        course.setSize(100,20);
        course.setLocation(20, 210);
        jf.add(course);


        String semester[] ={"1","2","3","4"};
        JComboBox jc2= new JComboBox(semester);
        jc2.setSize(100,20);
        jc2.setLocation(150, 250);
        jf.add(jc2);
        sem.setSize(100,20);
        sem.setLocation(20,250);
        jf.add(sem);
        

        String course_3[] = {"computer-science","pharmacy","Agriculture","Nursing"};
        JComboBox jc3 = new JComboBox(course_3);
        jc3.setSize(100,20);
        jc3.setLocation(150, 290);
        jf.add(jc3);
        dept.setSize(100,20);
        dept.setLocation(20, 290);
        jf.add(dept);
        
        sub.setSize(100, 20);
        sub.setLocation(20,340);
        jf.add(sub);
        JCheckBox jb1 = new JCheckBox("c++");
        JCheckBox jb2 = new JCheckBox("java");
        JCheckBox jb3 = new JCheckBox("python");
        JCheckBox jb4 = new JCheckBox("c#");
        jb1.setSize(100,20);
        jb1.setLocation(20,370);
        jf.add(jb1);
        jb2.setSize(100,20);
        jb2.setLocation(170, 370);
        jf.add(jb2);
        jb3.setSize(100,20);
        jb3.setLocation(280, 370);
        jf.add(jb3);
        jb4.setSize(100,20);
        jb4.setLocation(390, 370);
        jf.add(jb4);



        t_roll.setSize(100, 20);
        t_roll.setLocation(150, 50);
        jf.add(t_roll);
        
        t_add.setSize(100, 20);
        t_add.setLocation(150, 170);
        jf.add(t_add);

        t_name.setSize(100, 20);
        t_name.setLocation(150, 90);
        jf.add(t_name);

        b_sav.setSize(100, 20);
        b_sav.setLocation(150, 500);
        jf.add(b_sav);

        b_exi.setSize(100, 20);
        b_exi.setLocation(300,500);
        jf.add(b_exi);

        jf.setSize(1200, 800);
        jf.setVisible(true);
    }
    public static void main(String[] args) {
        Form obj = new Form();
    }

    public void actionPerformed(java.awt.event.ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
}
