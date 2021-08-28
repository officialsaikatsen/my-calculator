package calculator;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*Saikat Sen*/
public class calculator {JFrame f;JPanel p;JTextArea ta;JButton b0;JButton b1;JButton b2;JButton b3;JButton b4;JButton b5;JButton b6;
JButton b7;JButton b8;JButton b9;JButton plus;JButton minus;JButton div;JButton mul;JButton point;JButton eq;JPanel p1;JPanel p2;
calculator(){f=new JFrame("MY CALCULATOR");p=new JPanel();p1=new JPanel();p2=new JPanel(); ta=new JTextArea(4,8);
b0=new JButton("0");b1=new JButton("1");b2=new JButton("2");b3=new JButton("3");b4=new JButton("4");b5=new JButton("5");b6=new JButton("6");
b7=new JButton("7");b8=new JButton("8");b9=new JButton("9");
plus=new JButton("+");
minus=new JButton("-");
div=new JButton("/");
mul=new JButton("*");
eq=new JButton("=");
point=new JButton(".");
b4=new JButton("4");
GridLayout gl1=new GridLayout(4,3);
GridLayout gl2=new GridLayout(4,1);
BorderLayout bl=new BorderLayout(5,5);
p.setLayout(bl);
f.setSize(400,600);
f.setVisible(true);
p1.setLayout(gl1);
p2.setLayout(gl2);
p1.add(b0);
p1.add(b1);
p1.add(b2);
p1.add(b3);
p1.add(b4);
p1.add(b5);
p1.add(b6);
p1.add(b7);
p1.add(b8);
p1.add(b9);
p1.add(point);
p1.add(eq);
p.add(ta,BorderLayout.NORTH);
p.add(BorderLayout.CENTER,p1);
Color bg=null;
Border border=null;
p.setBackground(bg.YELLOW);
p2.add(plus);
p2.add(minus);
p2.add(div);
p2.add(mul);
b0.setBackground(bg.orange);
b1.setBackground(bg.pink);
b2.setBackground(bg.green);
b3.setBackground(bg.white);
b4.setBackground(bg.yellow);
b5.setBackground(bg.white);
b6.setBackground(bg.yellow);
b7.setBackground(bg.green);
b8.setBackground(bg.orange);
b9.setBackground(bg.pink);
plus.setBackground(bg.pink);
minus.setBackground(bg.green);
div.setBackground(bg.LIGHT_GRAY);
mul.setBackground(bg.orange);
point.setBackground(bg.orange);
eq.setBackground(bg.white);
ta.setBackground(bg.LIGHT_GRAY);
p.add(p2,BorderLayout.EAST);
calceng cal=new calceng(this);
b0.addActionListener(cal);
b1.addActionListener(cal);
b2.addActionListener(cal);
b3.addActionListener(cal);
b4.addActionListener(cal);
b5.addActionListener(cal);
b6.addActionListener(cal);
b7.addActionListener(cal);
b8.addActionListener(cal);
b9.addActionListener(cal);
plus.addActionListener(cal);
minus.addActionListener(cal);
eq.addActionListener(cal);
point.addActionListener(cal);
div.addActionListener(cal);
mul.addActionListener(cal);
f.setContentPane(p);}
	public static void main(String[] args) {new calculator();
}}
class calceng implements ActionListener{calculator parent;char sa=' ';double cr=0;
calceng(calculator parent){this.parent=parent;}	
	public void actionPerformed(ActionEvent e) {JButton click=(JButton)e.getSource();double dv=0;
	String tf=parent.ta.getText();
	if(!"".equals(tf)) { dv=Double.parseDouble(tf);}
	Object src=e.getSource();
	if(src==parent.plus) {sa='+';
	cr=dv;
	parent.ta.setText("");}
	else if(src==parent.minus) {sa='-';cr=dv;parent.ta.setText("");}else if(src==parent.mul) {sa='*';cr=dv;parent.ta.setText("");}
	else if(src==parent.div) {sa='/';cr=dv;parent.ta.setText("");}
	else if(src==parent.eq) {if(sa=='+') {cr+=dv;parent.ta.setText(""+cr);}else if(sa=='-') {cr-=dv;parent.ta.setText(""+cr);}
	else if(sa=='/') {cr/=dv;parent.ta.setText(""+cr);}else if(sa=='*') {cr*=dv;parent.ta.setText(""+cr);}}
	else {String cl=click.getText();
	parent.ta.setText(tf+cl);
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

		
	


