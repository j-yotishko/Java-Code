import java.awt.*;
public class awt_test extends Frame
{
	 awt_test()
	 {
		 setTitle("f");
		 setSize(2000,2000);
		 setLayout(null);
		 setVisible(true);
		 Font f1=new Font("Klavika",Font.BOLD,25);
		 Font f2=new Font("Klavika",Font.BOLD,30);
		 Font f3=new Font("Klavika",Font.BOLD,15);
		 Font f4=new Font("Klavika",Font.BOLD,13);
		 Font f=new Font("Klavika",Font.BOLD,10);
		 Label l1=new Label("Email or Phone");
			l1.setBounds(910,22,200,35);
			l1.setForeground(Color.white);
			l1.setBackground(Color.decode("#4267B2"));
			l1.setFont(f);
			add(l1);
			
			TextField t=new TextField(20);
			t.setBounds(910,59,160,20);
			t.setBackground(Color.white);
			add(t);
			
			Label l2=new Label("Password");
			l2.setBounds(1150,22,200,35);
			l2.setForeground(Color.white);
			l2.setBackground(Color.decode("#4267B2"));
			l2.setFont(f);
			add(l2);
			TextField t1=new TextField(20);
			t1.setBounds(1150,59,160,20);
			t1.setBackground(Color.white);
			add(t1);

			Button b1=new Button("Forgot password?");
			b1.setBounds(1150, 68, 160, 35);
			b1.setForeground(Color.white);
			b1.setBackground(Color.decode("#4267B2"));
			b1.setFont(f);
			add(b1);
			Button b=new Button("Log In");
			b.setBounds(1400, 50, 100, 30);
			b.setForeground(Color.white);
			b.setBackground(Color.decode("#4267B2"));
			b.setFont(f);
			add(b);
		
			Label l3=new Label("facebook",Label.LEFT);
			l3.setBounds(150,50,200,35);
			l3.setForeground(Color.white);
			l3.setBackground(Color.decode("#4267B2"));
			l3.setFont(f2);
			add(l3);
			
			Label l=new Label();
			l.setBounds(10,25,2000,80);
			l.setForeground(Color.white);
			l.setBackground(Color.decode("#4267B2"));
			l.setFont(f1);
			add(l);
			
			TextField t2=new TextField(20);
			t2.setBounds(670,290,190,30);
			t2.setBackground(Color.white);
			t2.setText("Name");
			add(t2);
		
			TextField t3=new TextField(20);
			t3.setBounds(880,290,150,30);
			t3.setBackground(Color.white);
			t3.setText("Surname");
			add(t3);
		
			TextField t4=new TextField(20);
			t4.setBounds(670,330,370,30);
			t4.setBackground(Color.white);
			t4.setText("Mobile number or Email Address");
			add(t4);
			TextField t5=new TextField(20);
			t5.setBounds(670,380,370,30);
			t5.setBackground(Color.white);
			t5.setText("New Password");
			add(t5);
			Label l10=new Label("Birthday");
			l10.setBounds(670,420,120,30);
			l10.setForeground(Color.decode("#4267B2"));
			l10.setFont(f4);
			add(l10);
			Choice c=new Choice();
			c.addItem("18");
			c.addItem("12");
			c.addItem("13");
			c.addItem("14");
			c.addItem("15");
			c.setBounds(670, 450, 85, 25);
			add(c);
			Choice c1=new Choice();
			c1.addItem("December");
			c1.addItem("January");
			c1.addItem("February");
			c1.addItem("March");
			c1.addItem("April");
			c1.setBounds(770, 450, 85, 25);
			add(c1);
			Choice c2=new Choice();
			c2.addItem("2020");
			c2.addItem("2016");
			c2.addItem("2017");
			c2.addItem("2018");
			c2.addItem("2019");
			c2.setBounds(870, 450, 85, 25);
			add(c2);
			Label l11=new Label("Gender");
			l11.setBounds(670,500,120,30);
			l11.setForeground(Color.decode("#4267B2"));
			l11.setFont(f4);
			add(l11);
		   CheckboxGroup cg=new CheckboxGroup();
		   Checkbox ch1=new Checkbox("Male",cg,false);
		   Checkbox ch2=new Checkbox("Female",cg,false);
		   Checkbox ch3=new Checkbox("Custom",cg,false);
		   ch1.setBackground(Color.white);
		   ch1.setBounds(670, 550, 50, 50);
		   add(ch1);
		   ch2.setBackground(Color.white);
		   ch2.setBounds(770, 550, 60, 50);
		   add(ch2);
		   ch3.setBackground(Color.white);
		   ch3.setBounds(870, 550, 70, 50);
	       add(ch3);
		   
		Label l5=new Label("Create a new account",Label.CENTER);
		l5.setText("Create a new account");
		l5.setBounds(550,150,500,70);
		l5.setForeground(Color.decode("#4267B2"));
		l5.setFont(f2);
		add(l5);
	 
		Label l6=new Label("It's quick and easy",Label.CENTER);
		l6.setText("It's quick and easy");
		l6.setBounds(480,200,500,70);
		l6.setForeground(Color.decode("#4267B2"));
		l6.setFont(f3);
		add(l6);
	 
		Label l7=new Label("By clicking 'Signup' you agree to our Terms.Data Policy",Label.CENTER);
		l7.setText("By clicking 'Signup' you agree to our Terms.Data Policy");
		l7.setBounds(600,650,500,20);
		l7.setForeground(Color.decode("#4267B2"));
		l7.setFont(f4);
		add(l7);
	 
		
		Label l8=new Label("and Cookie Policy. You can also recieve SMS notifications",Label.CENTER);
		l8.setText("and Cookie Policy. You can also recieve SMS notifications");
		l8.setBounds(600,670,500,20);
		l8.setForeground(Color.decode("#4267B2"));
		l8.setFont(f4);
		add(l8);
	 
		Label l9=new Label("and withdraw them at any time.",Label.CENTER);
		l9.setText("and withdraw them at any time.");
		l9.setBounds(600,690,500,20);
		l9.setForeground(Color.decode("#4267B2"));
		l9.setFont(f4);
		add(l9);
		Button b2=new Button("Sign Up");
		b2.setBounds(670, 750, 100, 30);
		b2.setForeground(Color.white);
		b2.setBackground(Color.green);
		b2.setFont(f);
		add(b2);
	    
		
	 }
	
	 
	 
	 
	 
	 
	 public static void main(String[] args) {
		 awt_test ob=new awt_test();	
	}

}
