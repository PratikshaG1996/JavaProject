import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
public class Customerreg extends JFrame implements ActionListener
{
JLabel l1,l2,l3,l4,l5;
JButton B1,B2;
JTextField T1,T2,T3;
String id="1";

public void getid()
{
try
{
Class.forName("org.postgresql.Driver");

Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:1998/medical","postgres","sucheta");

PreparedStatement pst=con.prepareStatement("select max(customer_id)+1 from Customer");

ResultSet rs=pst.executeQuery();

if(rs.next())
{
if(rs.getString(1).equals(null))
id="1";
else
id=rs.getString(1);
}
pst.close();
con.close();

}
catch(Exception ex)
{
JOptionPane.showMessageDialog(Customerreg.this,"Error !"+ex);
}

}



public   Customerreg()
{
setTitle("Customer Registration");
setSize(800,800);

setLayout(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
getContentPane().setLayout(null);
//getContentPane().setBackground(Color.white);

l4=new JLabel("Customer Registration");
l4.setBounds(600,10,250,50);
l4.setForeground(Color.black);
l4.setFont( new Font("Algerian",Font.BOLD,20));
l4.setVisible(true);
getContentPane().add(l4);


l1=new JLabel(" Customer Name");
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


l3=new JLabel("Mobile No");
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



B1= new JButton("save");
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
getid();

Class.forName("org.postgresql.Driver");

Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:1998/medical","postgres","sucheta");

PreparedStatement pst=con.prepareStatement("insert into customer (customer_id,customer_name,customer_add,customer_mbno) values(?,?,?,?)");

pst.setInt(1,Integer.parseInt(id));
pst.setString(2,T1.getText());
pst.setString(3,T2.getText());
pst.setString(4,T3.getText());

int n=pst.executeUpdate();

if(n>0)
JOptionPane.showMessageDialog(Customerreg.this,"Record Inserted Successfully !");
else
JOptionPane.showMessageDialog(Customerreg.this,"Record Not Inserted Successfully !");
}
catch(Exception ex)
{
JOptionPane.showMessageDialog(Customerreg.this,"Error !"+ex);
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
new Customerreg();
}
}