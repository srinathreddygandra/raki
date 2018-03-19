import java.awt.*;
class Student
{  Student( )
	{ Frame f=new Frame("Student");
	             f.setSize(450,400);
	f.setBackground(Color.YELLOW);
	f.setVisible(true);
	f.setLayout(new GridLayout(2,2));

	Panel p1=new Panel();
	p1.setLayout(new FlowLayout());
	p1.add(new Label("Sno :"));
	TextField txtsno=new TextField(10);
	p1.add(txtsno);
    f.add(p1);

	Panel p2=new Panel( );
	p2.setLayout(new GridLayout(6,1));
	CheckboxGroup cbg=
		new CheckboxGroup();
	Checkbox cm=new Checkbox("Male",true,cbg);
	Checkbox cf=new Checkbox("Female",false,cbg);
	p2.add(cm);
	p2.add(cf);
    f.add(p2);

   f.add(new Panel());

   Panel p4=new Panel( );
   p4.setLayout(new FlowLayout());
   p4.add(new Label("City"));

   Choice c=new Choice( );
   c.add("Hyd"); c.add("Kadapa");
   c.add("Vizag"); c.add("Kmm");
   p4.add(c);
   f.add(p4);
	}
   public static void main(String args[])
	{ Student s=new Student( ); {throws IOException
	}
	}
}