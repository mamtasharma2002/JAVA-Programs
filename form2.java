import javax.swing.*;

class SwingFrame extends JFrame{
	JLabel lbl_name, lbl_roll, lbl_gen, lbl_crs, lbl_add, lbl_sem, lbl_dept, lbl_sub, lbl_reg;
	JTextField jtf_name, jtf_roll;
	ButtonGroup bg;
	JRadioButton jrb_male, jrb_fmale;
	JTextArea jta_add;
	JComboBox jcb_crs;
    JComboBox jcb_sem;
    JComboBox jcb_dept;
	JCheckBox jcb_jav, jcb_cpl, jcb_py, jcb_c;
	JButton btn_save, btn_exit;
	SwingFrame(){
        lbl_reg = new JLabel("REGISTRATION FORM");
		lbl_name = new JLabel("Name");
		lbl_roll = new JLabel("Roll No.");
		lbl_gen = new JLabel("Gender");
		lbl_crs = new JLabel("Course");
		lbl_add = new JLabel("Address");
		lbl_sem = new JLabel("Semester");
		lbl_dept = new JLabel("Dept");
		lbl_sub = new JLabel("Subjects");

		jtf_name = new JTextField();
		jtf_roll = new JTextField();
		bg = new ButtonGroup();
		jrb_male = new JRadioButton("Male",true);
		jrb_fmale = new JRadioButton("Female",false);
		bg.add(jrb_male);
		bg.add(jrb_fmale);
		jta_add = new JTextArea();
		String crs[] = {"BCA","MCA","BBA","MBA"};
		jcb_crs = new JComboBox(crs);

        String sem[] = {"1","2","3","4"};
        jcb_sem = new JComboBox(sem);
        
        String dept[] = {"Computer Science","Pharmacy","Agriculture","law"};
        jcb_dept = new JComboBox<>(dept);

		
		jcb_jav = new JCheckBox("Java",true);
		jcb_cpl = new JCheckBox("C++",false);
		jcb_py = new JCheckBox("Python",false);
		jcb_c = new JCheckBox("C",false);
		btn_save = new JButton("Save");
		btn_exit = new JButton("Exit");	

		setLayout(null);

		lbl_name.setBounds(500,150,100,20);
		lbl_roll.setBounds(500,180,100,20);
		lbl_gen.setBounds(500,210,100,20);
		lbl_add.setBounds(500,240,100,20);
		lbl_crs.setBounds(500,300,100,20);
		lbl_sem.setBounds(500,330,100,20);
		lbl_dept.setBounds(500,360,100,20);
		lbl_sub.setBounds(500,390,100,20);
        lbl_reg.setBounds(650,100,200,20);



		jtf_name.setBounds(600,150,100,20);
		jtf_roll.setBounds(600,180,100,20);
		jrb_male.setBounds(590,210,60,20);
		jrb_fmale.setBounds(650,210,70,20);
		jta_add.setBounds(600,240,100,50);
		jcb_crs.setBounds(600,300,100,20);
        jcb_sem.setBounds(600,330,100,20);
        jcb_dept.setBounds(600,360,100,20);
		jcb_jav.setBounds(600,390,60,20);
		jcb_py.setBounds(660,390,70,20);
		jcb_c.setBounds(600,410,60,20);
		jcb_cpl.setBounds(660,410,60,20);
		btn_save.setBounds(535,440,65,20);
		btn_exit.setBounds(610,440,60,20);

		setSize(1920,1080);
		setVisible(true);
		add(lbl_name);
		add(lbl_roll);
		add(lbl_gen);
		add(lbl_add);
        add(jcb_sem);
        add(jcb_dept);
		add(lbl_crs);
		add(lbl_sem);
		add(lbl_dept);
		add(lbl_sub);
        add(lbl_reg);

		add(jtf_name);
		add(jtf_roll);
		add(jrb_male);
		add(jrb_fmale);
		add(jta_add);
		add(jcb_crs);
		add(jcb_jav);
		add(jcb_py);
		add(jcb_cpl);
		add(jcb_c);
		add(btn_save);
		add(btn_exit);

	}
}
class form2{
	public static void main(String[] args){
		SwingFrame jf = new SwingFrame();
	}
}