import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import java.lang.Math;
public class awt_test2 extends Frame implements ActionListener  {
	TextField tf1,tf2,tf3;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30;
	ImageIcon a;
	awt_test2()
	{
		 setTitle("Calculator");
		 setSize(335,540);
		 setLayout(null);
		 setVisible(true);
		 Image icon=Toolkit.getDefaultToolkit().getImage("C:\\Users\\91983\\Downloads\\icon.png");
		 setIconImage(icon);
		 Font f=new Font("Klavika",Font.BOLD,17);
		 Label l=new Label("Standard",Label.CENTER);
			l.setBounds(40,30,100,40);
			l.setFont(f);
			l.setBackground(Color.decode("#ecbcb4"));
			add(l);
			a=new ImageIcon("C:\\Users\\91983\\Downloads\\bg.jpg");
			setVisible(true);
			tf1=new TextField();
			tf1.setBounds(20, 70, 90, 20);
			add(tf1);
			tf2=new TextField();
			tf2.setBounds(230, 70, 90, 20);
			add(tf2);
			tf3=new TextField();
			tf3.setBounds(120, 100, 90, 20);
			add(tf3);
			b1=new Button("MC");
			 b1.setBackground(Color.white);
			b1.setBounds(10, 200, 55, 30);
		    add(b1);
		    b2=new Button("MR");
		    b2.setBackground(Color.white);
			b2.setBounds(65, 200, 55, 30);
		    add(b2);
		    b3=new Button("M+");
		    b3.setBackground(Color.white);
			b3.setBounds(120, 200, 55, 30);
		    add(b3);
		    b4=new Button("M-");
		    b4.setBackground(Color.white);
			b4.setBounds(175, 200, 55, 30);
		    add(b4);
		    b5=new Button("MS");
		    b5.setBackground(Color.white);
			b5.setBounds(230, 200, 55, 30);
		    add(b5);
		    b6=new Button("M");
		    b6.setBackground(Color.white);
			b6.setBounds(285, 200, 50, 30);
		    add(b6);
		    b7=new Button("%");
		    b7.setBackground(Color.white);
		    b7.setBounds(10,230,82,50);
		    add(b7);
		    b8=new Button("CE");
		    b8.setBackground(Color.white);
		    b8.setBounds(92,230,82,50);
		    add(b8);
		    b9=new Button("C");
		    b9.setBackground(Color.white);
		    b9.setBounds(174,230,82,50);
		    add(b9);
		    b10=new Button("<");
		    b10.setBackground(Color.white);
		    b10.setBounds(256,230,82,50);
		    add(b10);
		    b11=new Button("1/x");
		    b11.setBackground(Color.white);
		    b11.setBounds(10,280,82,50);
		    add(b11);
		    b12=new Button("x^2");
		    b12.setBackground(Color.white);
		    b12.setBounds(92,280,82,50);
		    add(b12);
		    b13=new Button("sqrt x");
		    b13.setBackground(Color.white);
		    b13.setBounds(174,280,82,50);
		    add(b13);
		    b14=new Button("/");
		    b14.setBackground(Color.white);
		    b14.setBounds(256,280,82,50);
		    add(b14);
		    b15=new Button("7");
		    b15.setBackground(Color.white);
		    b15.setBounds(10,330,82,50);
		    add(b15);
		    b16=new Button("8");
		    b16.setBackground(Color.white);
		    b16.setBounds(92,330,82,50);
		    add(b16);
		    b17=new Button("9");
		    b17.setBackground(Color.white);
		    b17.setBounds(174,330,82,50);
		    add(b17);
		    b18=new Button("*");
		    b18.setBackground(Color.white);
		    b18.setBounds(256,330,82,50);
		    add(b18);
		   
		    b19=new Button("6");
		    b19.setBackground(Color.white);
		    b19.setBounds(10,380,82,50);
		    add(b19);
		    
		    b20=new Button("5");
		    b20.setBackground(Color.white);
		    b20.setBounds(92,380,82,50);
		    add(b20);
		    
		    b21=new Button("4");
		    b21.setBackground(Color.white);
		    b21.setBounds(174,380,82,50);
		    add(b21);
		    
		    b22=new Button("-");
		    b22.setBackground(Color.white);
		    b22.setBounds(256,380,82,50);
		    add(b22);	
		    
		    b23=new Button("3");
		    b23.setBackground(Color.white);
		    b23.setBounds(10,430,82,50);
		    add(b23);
		    
		    b24=new Button("2");
		    b24.setBackground(Color.white);
		    b24.setBounds(92,430,82,50);
		    add(b24);
		    
		    b25=new Button("1");
		    b25.setBackground(Color.white);
		    b25.setBounds(174,430,82,50);
		    add(b25);
		    
		    b26=new Button("+");
		    b26.setBackground(Color.white);
		    b26.setBounds(256,430,82,50);
		    add(b26);
		    
		    b27=new Button("+/-");
		    b27.setBackground(Color.white);
		    b27.setBounds(10,480,82,50);
		    add(b27);
		    
		    b28=new Button("0");
		    b28.setBackground(Color.white);
		    b28.setBounds(92,480,82,50);
		    add(b28);
		    
		    b29=new Button(".");
		    b29.setBackground(Color.white);
		    b29.setBounds(174,480,82,50);
		    add(b29);
		    
		    b30=new Button("=");
		    b30.setBackground(Color.white);
		    b30.setBounds(256,480,82,50);
		    add(b30);
		    b7.addActionListener(this);
		    b8.addActionListener(this);
		    b9.addActionListener(this);
		    b10.addActionListener(this);
		    b11.addActionListener(this);
		    b12.addActionListener(this);
		    b13.addActionListener(this);
		    b14.addActionListener(this);
		    b15.addActionListener(this);
		    b16.addActionListener(this);
		    b17.addActionListener(this);
		    b18.addActionListener(this);
		    b19.addActionListener(this);
		    b20.addActionListener(this);
		    b21.addActionListener(this);
		    b22.addActionListener(this);
		    b23.addActionListener(this);
		    b24.addActionListener(this);
		    b25.addActionListener(this);
		    b26.addActionListener(this);
		    b28.addActionListener(this);
		    b29.addActionListener(this);
		    b30.addActionListener(this);
		    	
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawImage(a.getImage(),1,1,335,200,this);
	}
   public void actionPerformed(ActionEvent e)
   {   String s1=tf1.getText();
       String s2=tf2.getText();
       int a=Integer.parseInt(s1);
       int b=Integer.parseInt(s2);
	  double c=0;
	   if(e.getSource()==b7)
	   {
		   c=a/100;
	   }
	   else if(e.getSource()==b8)
	   {
		  c=0; 
	   }
	   else if(e.getSource()==b9)
	   {
		  c=0; 
	   }
	   else if(e.getSource()==b10)
	   {
		  char bc='\b';
		  System.out.print(s1+bc);
		  System.out.print('X');
	   }
	   else if(e.getSource()==b11)
	   {
		  c=1/a; 
	   }
	   else if(e.getSource()==b12)
	   {
		  c=a*a; 
	   }
	   else if(e.getSource()==b13)
	   {
		   double d=Double.valueOf(a);
		   c=Math.sqrt(a); 
	   }
	   else if(e.getSource()==b14)
	   {
		   c=a/b;
		  }
	   else if(e.getSource()==b18)
	   {
		  c=a*b;
	   }
	   else if(e.getSource()==b22)
	   {
		  c=a-b;
	   }
	   else if(e.getSource()==b26)
	   {
		 c=a+b; 
	   }
	String result=String.valueOf(c);
	tf3.setText(result);
   }
	public static void main(String[] args) {
		new awt_test2();

	}

}
