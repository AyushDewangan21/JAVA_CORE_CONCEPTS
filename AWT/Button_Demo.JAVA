import java.awt.*; import java.awt.event.*;

class ButtonDemo extends Frame implements ActionListener

{

String msg = " ";

Button yes= new Button("Yes"); Button no= new Button("No");

Button maybe= new Button("Undecided"); Label l=new Label(msg);

public ButtonDemo(String s)
135


{

super(s);

setLayout(new FlowLayout()); add(yes);

add(no);

add(maybe);add(l);

yes.addActionListener(this);

no.addActionListener(this);

maybe.addActionListener(this);

}

public void actionPerformed(ActionEvent ae)

{

String str = ae.getActionCommand(); if(str.equals("Yes"))

{

msg = "You pressed Yes.";

}

else if(str.equals("No"))

{

msg = "You pressed No.";

}

else

{

msg = "You pressed Undecided.";

}

l.setText(msg);

}

public static void main(String args[])

{

ButtonDemo b=new ButtonDemo("Demonstration of Buttons"); b.setSize(600, 250);

b.setVisible(true);

}

}
