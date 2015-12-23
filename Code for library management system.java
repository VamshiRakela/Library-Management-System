# Library-Management-System
This project helps in storing the information regarding the books distribution
 //Dt:23/12/2015
 //Author: Vamshi Rakela
 
 import java.awt.*;
import java.awt.event.*;
class mainform implements ActionListener 
{
	Frame f1,f2,f3,f5,f6,f7,f8;
	Panel p1,p2,p3,p5,p6,p7,p8;
	Button b1,b2,b3,b4,b6,b7,b8,b9,b10,b11;
	Label lb1,lb2,lb3,lb4,lb5,lb6,lab1,lab2,ln,ln1;
	TextField txt1,txt2,txt3,txt4,txt5,txt6;
	String StudentName[]=new String[100];
	String StudentRollNo[]=new String[100];
	int BookNo[]=new int[100];
	int count=0;
	int value=0;
	String s1=new String("");
	String s2=new String("");
	int addbook=0;
	mainform()
	{
		f1=new Frame();
		p1=new Panel();
		b1=new Button("Start");
		lb1=new Label("JAVA BASED LIBRARY MANAGEMENT SYSTEM BY ");
		Font f=new Font("Consolas",Font.ITALIC,32);
		lb1.setFont(f);
		lb1.setForeground(Color.blue);
		p1.add(lb1);
		p1.add(b1);
		f1.add(p1);
		f1.setTitle("Library Management System");
		f1.setSize(300,300);
		f1.setVisible(true);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			f1.setVisible(false);
			f2=new Frame();
			p2=new Panel();
			b2=new Button("Borrow");
			b9=new Button("Return");
			p2.add(b2);
			p2.add(b9);
			f2.add(p2);
			f2.setTitle("Library Management System");
			f2.setSize(400,500);
			f2.setVisible(true);
			b2.addActionListener(this);
			b9.addActionListener(this);
			
		}
		if(ae.getSource()==b2)
		{
			f2.setVisible(false);
			f1.setVisible(false);
			f3=new Frame();
			p3=new Panel();
			b3=new Button("Check");
			lb3=new Label("Student Name");
			lb4=new Label("Student RollNo");
			lb5=new Label("Book No");
			lb6=new Label("To see details of book available click Check");
			txt1=new TextField(20);
			txt2=new TextField(20);
			txt3=new TextField(20);
			b4=new Button("Back");
			b6=new Button("Proceed");
			p3.add(lb3);
			p3.add(txt1);
			p3.add(lb4);
			p3.add(txt2);
			p3.add(lb5);
			p3.add(txt3);
			p3.add(lb6);
			p3.add(b4);
			p3.add(b3);
			p3.add(b6);
			f3.add(p3);
			f3.setTitle("Library Management System");
			f3.setSize(400,500);
			f3.setVisible(true);
			b4.addActionListener(this);
			b3.addActionListener(this);
			b6.addActionListener(this);
		}
		if(ae.getSource()==b3)
		{
			storagecons();
	

		}

		if(ae.getSource()==b4)
		{
			f1.setVisible(false);
			f3.setVisible(false);
			/*f2=new Frame();
			p2=new Panel();
			b2=new Button("Borrow");
			b3=new Button("Return");
			p2.add(b2);
			p2.add(b3);
			f2.add(p2);
			f2.setTitle("Library Management System");
			f2.setSize(400,500);*/
			f2.setVisible(true);
	//		b2.addActionListener(this);
			
		}
		if(ae.getSource()==b5)
		{
			/* f2.setVisible(false);
			f1.setVisible(false);
			f3=new Frame();
			p3=new Panel();
			b3=new Button("Check");
			lb3=new Label("Student Name");
			lb4=new Label("Student RollNo");
			lb5=new Label("Book No");
			lb6=new Label("To see details of book available click Check");
			txt1=new TextField(20);
			txt2=new TextField(20);
			txt3=new TextField(20);
			b4=new Button("Back");
			b6
			=new Button("Proceed");
			p3.add(lb3);
			p3.add(txt1);
			p3.add(lb4);
			p3.add(txt2);
			p3.add(lb5);
			p3.add(txt3);
			p3.add(lb6);
			p3.add(b4);
			p3.add(b3);
			p3.add(b5);
			f3.add(p3);
			f3.setTitle("Library Management System");
			f3.setSize(400,500); */
			f3.setVisible(true);
			f4.setVisible(false);
	//		b4.addActionListener(this);
	// b4.addActionListener(this);
		}
		if(ae.getSource()==b6)
		{
			s1=txt3.getText();
			value=Integer.parseInt(s1);
			if(value>=1234 && value <=1238)
			{
				StudentName[count]=txt1.getText();
				StudentRollNo[count]=txt2.getText();
				BookNo[count]=value;
				if(BookNo[count]==1234)
				{
					p4.remove(l4);
					p4.remove(l5);
					p4.remove(l6);
				}
				if(BookNo[count]==1235)
				{
					p4.remove(l7);
					p4.remove(l8);
					p4.remove(l9);
				}
				if(BookNo[count]==1236)
				{
					p4.remove(l10);
					p4.remove(l11);
					p4.remove(l12);
					f4.add(p4);
				}
				if(BookNo[count]==1237)
				{
					p4.remove(l13);
					p4.remove(l14);
					p4.remove(l15);
					f4.add(p4);
				}
				if(BookNo[count]==1238)
				{
					p4.remove(l16);
					p4.remove(l17);
					p4.remove(l18);
					f4.add(p4);
				}
				f6=new Frame();
				p6=new Panel();
				lab2=new Label("Thank You");
				b8=new Button("Back");
				p6.add(lab2);
				p6.add(b8);
				f6.add(p6);
				f6.setTitle("Library Management System");
				f6.setSize(400,500);
				f6.setVisible(true);
				System.out.println("Book Lending Information");
				System.out.println("Student	 Author   BookNo");
				System.out.print(StudentName[count]+"	");
				System.out.print(StudentRollNo[count]+"	");
				System.out.println(BookNo[count]+"	");
				count++;
				b8.addActionListener(this);
			}
			else
			{
				f5=new Frame();
				p5=new Panel();
				lab1=new Label("Check Book Availability");
				b7=new Button("Back");
				p5.add(lab1);
				p5.add(b7);
				f5.add(p5);
				f5.setTitle("Library Management System");
				f5.setSize(400,500);
				f5.setVisible(true);
				b7.addActionListener(this);
			}
		}
		if(ae.getSource()==b7)
		{
			f5.setVisible(false);
		}
		if(ae.getSource()==b8)
		{
			f6.setVisible(false);
		}
		if(ae.getSource()==b9)
		{
			f2.setVisible(true);
			f7=new Frame();
			p7=new Panel();
			txt4=new TextField(20);
			txt5=new TextField(20);
			txt6=new TextField(20);
			b10=new Button("Submit");
			p7.add(lb3);
			p7.add(txt4);
			p7.add(lb4);
			p7.add(txt5);
			p7.add(lb5);
			p7.add(txt6);
			p7.add(b10);
			f7.add(p7);
			f7.setTitle("Library Management System");
			f7.setSize(400,500);
			f7.setVisible(true);
			b10.addActionListener(this);
		}
		if(ae.getSource()==b10)
		{
			f8=new Frame();
			p8=new Panel();
			ln1=new Label("Thank You");
			b11=new Button("Okay");
			p8.add(ln1);
			p8.add(b11);
			f8.add(p8);
			f7.setVisible(false);
			f8.setTitle("Library Management System");
			f8.setSize(400,500);
			f8.setVisible(true);
			b11.addActionListener(this);
		}



		if(ae.getSource()==b11)
		{
			f8.setVisible(false);
			f2.setVisible(true);
			s2=txt6.getText();
			ln=new Label(s2);
			p4.add(ln);
			try
			{
				addbook=Integer.parseInt(s2);
			}
			catch (Exception e)
			{
				System.out.println("Invalid Input");
			}
			
				if(addbook==1234)
				{
					p4.add(l4);
					p4.add(l5);
					p4.add(l6);
					f4.add(p4);
				}
				if(addbook==1235)
				{
					p4.add(l7);
					p4.add(l8);
					p4.add(l9);
					f4.add(p4);
				}
				if(addbook==1236)
				{
					p4.add(l10);
					p4.add(l11);
					p4.add(l12);
					f4.add(p4);
				}
				if(addbook==1237)
				{
					p4.add(l13);
					p4.add(l14);
					p4.add(l15);
					f4.add(p4);
				}
				if(BookNo[count]==1238)
				{
					p4.add(l16);
					p4.add(l17);
					p4.add(l18);
					f4.add(p4);
				}
		}


	}


	Frame f4;
	Panel p4;
	Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18;
	Button b5;
	public void storagecons()
	{
		f4=new Frame();
		p4=new Panel();
		l1=new Label("Book No");
		l2=new Label("Book Name");
		l3=new Label("Author");
		l4=new Label("1234");
		l5=new Label("C Language");
		l6=new Label("Herbert Schildt");
		l7=new Label("1235");
		l8=new Label("C++ Language");
		l9=new Label("Yeshwant");
		l10=new Label("1236");
		l11=new Label("Java Reference");
		l12=new Label("Hebr");
		l13=new Label("1237");
		l14=new Label("C Lang 2");
		l15=new Label("Yesh");
		l16=new Label("1238");
		l17=new Label("c++ lan 2");
		l18=new Label("abc author");
		b5=new Button("Back");
		p4.add(l1);
		p4.add(l2);
		p4.add(l3);
		p4.add(l4);
		p4.add(l5);
		p4.add(l6);
		p4.add(l7);
		p4.add(l8);
		p4.add(l9);
		p4.add(l10);
		p4.add(l11);
		p4.add(l12);
		p4.add(l13);
		p4.add(l14);
		p4.add(l15);
		p4.add(l16);
		p4.add(l17);
		p4.add(l18);
		p4.add(b5);
		f4.add(p4);
		f4.setTitle("Library Management System");
		f4.setSize(400,500);
		f4.setVisible(true);
		b5.addActionListener(this);
	}	
}

public class libpromod
{
	public static void main(String[] args) 
	{
	new mainform();
	}
}

