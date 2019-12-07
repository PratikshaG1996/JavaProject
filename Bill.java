import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
public class Bill extends JFrame implements ActionListener
{
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
JButton B1,B2,B3;
JTextField T1,T2,T3,T4,T5,T6,T11,T12;
JTextArea t1,t2,t3,t4,t5;
static int a=0;
public  Bill  ()
{
setTitle("Bill");
setSize(800,800);

setLayout(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
getContentPane().setLayout(null);
//getContentPane().setBackground(Color.white);

l1=new JLabel(" Bill No");
l1.setBounds(200,40,250,50);
l1.setForeground(Color.black);
l1.setFont( new Font("Algerian",Font.BOLD,20));
l1.setVisible(true);
getContentPane().add(l1);

T1=new JTextField();
T1.setBounds(300, 50, 150, 25);
T1.setEditable(true);
T1.setVisible(true);
T1.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,16));
T1.setForeground(Color.red);
getContentPane().add(T1);
setVisible(true);	


l2=new JLabel("Date");
l2.setBounds(500,50,250,25);
l2.setForeground(Color.black);
l2.setFont( new Font("Algerian",Font.BOLD,20));
l2.setVisible(true);
getContentPane().add(l2);

T2=new JTextField();
T2.setBounds(580, 50, 150, 25);
T2.setEditable(true);
T2.setVisible(true);
T2.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,16));
T2.setForeground(Color.red);
getContentPane().add(T2);
setVisible(true);	


l3=new JLabel("Customer Id");
l3.setBounds(180,80,250,25);
l3.setForeground(Color.black);
l3.setFont( new Font("Algerian",Font.BOLD,20));
l3.setVisible(true);
getContentPane().add(l3);

T3=new JTextField();
T3.setBounds(370, 80, 150, 25);
T3.setEditable(true);
T3.setVisible(true);
T3.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,16));
T3.setForeground(Color.red);
getContentPane().add(T3);
setVisible(true);	


l4=new JLabel("Medicine Name");
l4.setBounds(150,110,250,50);
l4.setForeground(Color.black);
l4.setFont( new Font("Algerian",Font.BOLD,20));
l4.setVisible(true);
getContentPane().add(l4);

T4=new JTextField();
T4.setBounds(320, 120, 100, 25);
T4.setEditable(true);
T4.setVisible(true);
T4.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,16));
T4.setForeground(Color.red);
getContentPane().add(T4);
setVisible(true);	


l5=new JLabel("Quantity");
l5.setBounds(430,120,250,25);
l5.setForeground(Color.black);
l5.setFont( new Font("Algerian",Font.BOLD,20));
l5.setVisible(true);
getContentPane().add(l5);

T5=new JTextField();
T5.setBounds(550, 120, 100, 25);
T5.setEditable(true);
T5.setVisible(true);
T5.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,16));
T5.setForeground(Color.red);
getContentPane().add(T5);
setVisible(true);	


l6=new JLabel("Price");
l6.setBounds(680,120,250,25);
l6.setForeground(Color.black);
l6.setFont( new Font("Algerian",Font.BOLD,20));
l6.setVisible(true);
getContentPane().add(l6);

T6=new JTextField();
T6.setBounds(750, 120, 100, 25);
T6.setEditable(true);
T6.setVisible(true);
T6.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,16));
T6.setForeground(Color.red);
getContentPane().add(T6);
setVisible(true);	

l7=new JLabel("Name");
l7.setBounds(180,150,250,50);
l7.setForeground(Color.black);
l7.setFont( new Font("Algerian",Font.BOLD,20));
l7.setVisible(true);
getContentPane().add(l7);

l8=new JLabel("Quantity");
l8.setBounds(360,150,250,50);
l8.setForeground(Color.black);
l8.setFont( new Font("Algerian",Font.BOLD,20));
l8.setVisible(true);
getContentPane().add(l8);


l9=new JLabel("Rate");
l9.setBounds(540,150,250,50);
l9.setForeground(Color.black);
l9.setFont( new Font("Algerian",Font.BOLD,20));
l9.setVisible(true);
getContentPane().add(l9);

l10=new JLabel("Amount");
l10.setBounds(720,150,250,50);
l10.setForeground(Color.black);
l10.setFont( new Font("Algerian",Font.BOLD,20));
l10.setVisible(true);
getContentPane().add(l10);

t1=new JTextArea(20,20);
t1.setBounds(180,200,250,100);
t1.setForeground(Color.black);
t1.setFont( new Font("Algerian",Font.BOLD,20));
t1.setVisible(true);
getContentPane().add(t1);


t2=new JTextArea(10,10);
t2.setBounds(450,200,250,100);
t2.setForeground(Color.black);
t2.setFont( new Font("Algerian",Font.BOLD,20));
t2.setVisible(true);
getContentPane().add(t2);


t3=new JTextArea(10,10);
t3.setBounds(720,200,250,100);
t3.setForeground(Color.black);
t3.setFont( new Font("Algerian",Font.BOLD,20));
t3.setVisible(true);
getContentPane().add(t3);

t4=new JTextArea(10,10);
t4.setBounds(1000,200,250,100);
t4.setForeground(Color.black);
t4.setFont( new Font("Algerian",Font.BOLD,20));
t4.setVisible(true);
getContentPane().add(t4);

JLabel obj=new JLabel("total bill");
obj.setBounds(720,320,250,50);
obj.setForeground(Color.black);
obj.setFont( new Font("Algerian",Font.BOLD,20));
obj.setVisible(true);
getContentPane().add(obj);

t5=new JTextArea(10,10);
t5.setBounds(1000,320,250,50);
t5.setForeground(Color.black);
t5.setFont( new Font("Algerian",Font.BOLD,20));
t5.setVisible(true);
getContentPane().add(t5);


l11=new JLabel("Address");
l11.setBounds(550,80,250,25);
l11.setForeground(Color.black);
l11.setFont( new Font("Algerian",Font.BOLD,20));
l11.setVisible(true);
getContentPane().add(l11);

T11=new JTextField();
T11.setBounds(650, 80, 150, 25);
T11.setEditable(true);
T11.setVisible(true);
T11.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,16));
T11.setForeground(Color.red);
getContentPane().add(T11);
setVisible(true);	

l12=new JLabel("Mobile No");
l12.setBounds(820,80,250,25);
l12.setForeground(Color.black);
l12.setFont( new Font("Algerian",Font.BOLD,20));
l12.setVisible(true);
getContentPane().add(l12);

T12=new JTextField();
T12.setBounds(930, 80, 150, 25);
T12.setEditable(true);
T12.setVisible(true);
T12.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,16));
T12.setForeground(Color.red);
getContentPane().add(T12);
setVisible(true);


B1= new JButton("Save");
B1.setBounds(400,400,80,30);
B1.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,16));
getContentPane().add(B1);

 B2= new JButton("Exit");
B2.setBounds(600,400,80,30);
B2.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,16));
getContentPane().add(B2);


 B3= new JButton("Add");
B3.setBounds(960,150,80,30);
B3.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,16));
getContentPane().add(B3);

B1.addActionListener(this);
B2.addActionListener(this);
B3.addActionListener(this);

}

public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==B1)
	{
try
{
Class.forName("org.postgresql.Driver");

Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:1998/medical","postgres","sucheta");

PreparedStatement pst=con.prepareStatement("insert into Bill values(?,?,?,?)");
pst.setInt(1,Integer.parseInt(T1.getText()));
pst.setString(2,T2.getText());
pst.setInt(3,Integer.parseInt(T3.getText()));
pst.setInt(4,Integer.parseInt(t5.getText()));


int n=pst.executeUpdate();

if(n>0)
JOptionPane.showMessageDialog(Bill.this,"Record Inserted Successfully !");
else
JOptionPane.showMessageDialog(Bill.this,"Record Not Inserted Successfully !");
}
catch(Exception ex)
{
JOptionPane.showMessageDialog(Bill.this,"Error !"+ex);
}
	}
	if(e.getSource()==B2)
	{
		this.setVisible(false);
		new mainpage();
	}
if(e.getSource()==B3)
{
int q=Integer.parseInt(T5.getText());
int p=Integer.parseInt(T6.getText());
a=a+(p*q);
/*
if(t5.getText()=="")
{
t5.setText("0");
int tm=Integer.parseInt(t5.getText())+ a;
t5.setText(tm+"");
}
else
{
int tm=Integer.parseInt(t5.getText())+ a;
t5.setText(tm+"");

*/
t1.append("\n"+T4.getText());
t2.append("\n"+T5.getText());
t3.append("\n"+T6.getText());
t4.append("\n"+a+"");
t5.setText(a+"");
}
}
public static void main(String args[])
{
new  Bill ();
}
}