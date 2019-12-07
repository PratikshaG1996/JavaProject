import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.util.*;
import java.util.List;

public class mainpage extends JFrame implements ActionListener
{
	
	JPanel p,component;
	JLabel l1,hn,hn1;
  
JButton cmdcustreg,cmdcustupdate,cmdmaterialupdate,cmdeventreg,cmdeventupdate,cmdmaterialreg,cmdeventorder,cmdtheamreg,cmdtheamupdate;

	 
	public mainpage()
	{
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		Container cont=new Container();
		getContentPane();
		setLayout(new BorderLayout());
	    setTitle("Main Frame");   
		
	  	  	
	//  Button
	
	  	cmdcustreg=new JButton("Customer Registration");
	  	cmdcustreg.setBounds(105,250,250,40);
	  	cmdcustreg.setVisible(true);
	  	cmdcustreg.setEnabled(true);
	  	cmdcustreg.addActionListener(this);
	  	cont.add(cmdcustreg);
		
		cmdcustupdate=new JButton("Supplier Registration");
	  	cmdcustupdate.setBounds(410,250,250,40);
	  	cmdcustupdate.setVisible(true);
	  	cmdcustupdate.setEnabled(true);
	  	cmdcustupdate.addActionListener(this);
	  	cont.add(cmdcustupdate);
	  	
	  	cmdeventreg=new JButton("Supplier Updation");
	  	cmdeventreg.setBounds(105,300,250,40);
	  	cmdeventreg.setVisible(true);
	  	cmdeventreg.setEnabled(true);
	  	cmdeventreg.addActionListener(this);
	  	cont.add(cmdeventreg);	
	  	
	  	cmdeventupdate=new JButton("Medicine Registration");
	  	cmdeventupdate.setBounds(410,300,250,40);
	  	cmdeventupdate.setVisible(true);
	  	cmdeventupdate.setEnabled(true);
	  	cmdeventupdate.addActionListener(this);
	  	cont.add(cmdeventupdate);
	  	
	  	cmdtheamreg=new JButton("Medicine Updation");
	  	cmdtheamreg.setBounds(105,350,250,40);
	  	cmdtheamreg.setVisible(true);
	  	cmdtheamreg.setEnabled(true);
	  	cmdtheamreg.addActionListener(this);
	  	cont.add(cmdtheamreg);
	  	
		cmdtheamupdate=new JButton("Bill");
	  	cmdtheamupdate.setBounds(410,350,250,40);
	  	cmdtheamupdate.setVisible(true);
	  	cmdtheamupdate.setEnabled(true);
	  	cmdtheamupdate.addActionListener(this);
	  	cont.add(cmdtheamupdate);
		/*
	  	cmdeventorder=new JButton("Event Order");
		cmdeventorder.setBounds(105,400,250,40);
		cmdeventorder.setVisible(true);
		cmdeventorder.setEnabled(true);
		cmdeventorder.addActionListener(this);
		cont.add(cmdeventorder);		
	  	
	  	cmdmaterialreg=new JButton("Material Registration");
	  	cmdmaterialreg.setBounds(410,400,250,40);
	  	cmdmaterialreg.setVisible(true);
	  	cmdmaterialreg.setEnabled(true);
	  	cmdmaterialreg.addActionListener(this);
	  	cont.add(cmdmaterialreg);	

		cmdmaterialupdate=new JButton("Material Update");
		cmdmaterialupdate.setBounds(310,450,250,40);
		cmdmaterialupdate.setVisible(true);
		cmdmaterialupdate.setEnabled(true);
		cmdmaterialupdate.addActionListener(this);
		cont.add(cmdmaterialupdate);		  	
	  	*/
	  
	  	
	    // Label
	    
	    hn = new JLabel("Medical Billing System");
		hn.setBounds(260,0,600,100);
		hn.setForeground(Color.red);
		hn.setFont(new Font("Times New Roman",Font.BOLD,30));		
		cont.add(hn);
		
		
	     
		l1 = new JLabel("Please Select Category:");
		l1.setBounds(45,160,600,100);
		l1.setForeground(Color.darkGray);
		l1.setFont(new Font("Georgia",Font.BOLD,18));		
		cont.add(l1);
		
		getContentPane().add(cont);
		setBounds(0,0,800,600);
		setResizable(false);
		setVisible(true);
		
	  
	  this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				enable(false);
				//Exit_Frame ef=new Exit_Frame();
      		
			}
		});

	}


    public void actionPerformed(ActionEvent ae) 
    {
        	if(ae.getSource()==cmdcustreg)
	{
	new Customerreg();
	}
	if(ae.getSource()==cmdcustupdate)
	{
	new Supplierreg();
	}
	if(ae.getSource()==cmdeventorder)
	{
	//new Doctorreg();
	}
	if(ae.getSource()==cmdeventreg)
	{
	new Supplierupdate();
	}
	if(ae.getSource()==cmdeventupdate)
	{
	new Medicinereg();
	}

	if(ae.getSource()==cmdmaterialreg)
	{
	//new Materialreg();
	}
	if(ae.getSource()==cmdeventorder)
	{
	//new Eventorder();
	}
	if(ae.getSource()==cmdtheamreg)
	{
	new Medicineupdate();
	}
	if(ae.getSource()==cmdtheamupdate)
	{
	new Bill();
	}	

    }

			
	public static void main(String args[])
	{
		new mainpage();
	}
 } 
 
