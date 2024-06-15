import java.awt.*; import java.awt.event.*;

class CheckboxDemo extends Frame implements ItemListener

{

String msg = " ";

Checkbox c1 = new Checkbox("C", null,true); Checkbox c2 = new Checkbox("C++"); Checkbox c3 = new Checkbox("Java"); Checkbox c4 = new Checkbox("PHP");

Label l=new Label(msg); 
public CheckboxDemo(Strings)

{

super(s);

setLayout(new FlowLayout()); add(c1);

add(c2);

add(c3);

add(c4);

add(l);

c1.addItemListener(this);

c2.addItemListener(this);

c3.addItemListener(this);

c4.addItemListener(this);

}

public void itemStateChanged(ItemEvent ie)

{

msg="You have selected"; if(c1.getState()) msg=msg+" C"; if(c2.getState()) msg=msg+" C++"; if(c3.getState()) msg=msg+" Java"; if(c4.getState()) msg=msg+" PHP"; l.setText(msg);
}
138


public static void main(String args[])

{

CheckboxDemo b=new CheckboxDemo ("Demonstration of Checkbox"); b.setSize(350, 250);

b.setVisible(true);

}

}
