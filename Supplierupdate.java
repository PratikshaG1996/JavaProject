import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
public class Supplierupdate  extends JFrame implements ActionListener
{
JLabel l1,l2,l3,l4,l5;
JButton B1,B2;
JTextField T1,T2,T3,T4;
JComboBox c;

public   Supplierupdate  ()
{
setTitle("Supplier Update");
setSize(800,800);

setLayout(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
getContentPane().setLayout(null);
//getContentPane().setBackground(Color.white);

l5=new JLabel("Supplier  Register");
l5.setBounds(600,10,250,50);
l5.setForeground(Color.black);
l5.setFont( new Font("Algerian",Font.BOLD,20));
l5.setVisible(true);
getContentPane().add(l5);


l1=new JLabel(" Supplier Name");
l1.setBounds(500,40,250,50);
l1.setForeground(Color.black);
l1.setFont( new Font("Algerian",Font.BOLD,20));
l1.setVisible(true);
getContentPane().add(l1);


T1=new JTextField();
T1.setBounds(700, 50, 200, 25);
T1.setEditable(true);
T1.setVisible(true);
T1.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,16));
T1.setForeground(Color.red);
getContentPane().add(T1);
setVisible(true);	


l2=new JLabel("Address");
l2.setBounds(500,70,250,50);
l2.setForeground(Color.black);
l2.setFont( new Font("Algerian",Font.BOLD,20));
l2.setVisible(true);
getContentPane().add(l2);

T2=new JTextField();
T2.setBounds(700, 80, 200, 25);
T2.setEditable(true);
T2.setVisible(true);
T2.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,16));
T2.setForeground(Color.red);
getContentPane().add(T2);
setVisible(true);	


l3=new JLabel(" Mobile No");
l3.setBounds(500,100,250,50);
l3.setForeground(Color.black);
l3.setFont( new Font("Algerian",Font.BOLD,20));
l3.setVisible(true);
getContentPane().add(l3);

T3=new JTextField();
T3.setBounds(700, 110, 200, 25);
T3.setEditable(true);
T3.setVisible(true);
T3.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,16));
T3.setForeground(Color.red);
getContentPane().add(T3);
setVisible(true);	


l4=new JLabel("GSTIN No");
l4.setBounds(500,130,250,50);
l4.setForeground(Color.black);
l4.setFont( new Font("Algerian",Font.BOLD,20));
l4.setVisible(true);
getContentPane().add(l4);

T4=new JTextField();
T4.setBounds(700, 140, 200, 25);
T4.setEditable(true);
T4.setVisible(true);
T4.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,16));
T4.setForeground(Color.red);
getContentPane().add(T4);
setVisible(true);	


 B1= new JButton("Update");
B1.setBounds(600,240,80,30);
B1.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,16));
getContentPane().add(B1);

 B2= new JButton("Exit");
B2.setBounds(800,240,80,30);
B2.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,16));
getContentPane().add(B2);

B1.addActionListener(this);
B2.addActionListener(this);
}

public void actionPerformed(ActionEvent e)
{
	
		if(e.getSource()==B1)
{
try
{
Class.forName("org.postgresql.Driver");

Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:1998/medical","postgres","sucheta");

PreparedStatement pst=con.prepareStatement("update supplier set supplier_name=?,supplier_add=?,supplier_mbno=?, supplier_gstin=? where supplier_name=?");


pst.setString(1,T1.getText());
pst.setString(2,T2.getText());
pst.setString(3,T3.getText());
pst.setString(4,T4.getText());
pst.setString(5,T1.getText());

int n=pst.executeUpdate();

if(n>0)
JOptionPane.showMessageDialog(Supplierupdate.this,"Record Update Successfully !");
else
JOptionPane.showMessageDialog(Supplierupdate.this,"Record Not Update Successfully !");
}
catch(Exception ex)
{
JOptionPane.showMessageDialog(Supplierupdate.this,"Error !"+ex);
}
	}
	if(e.getSource()==B2)
	{
		this.setVisible(false);
		new mainpage();
	}
}
public static void main(String args[])
{
new Supplierupdate  ();
}
}