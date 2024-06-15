import java.awt.*;

class LabelDemo extends Frame

{

Label one = new Label("One"); Label two = new Label("Two"); Label three = new Label("Three"); public LabelDemo(String s)

{

super(s);

setLayout(new FlowLayout()); add(one);

add(two);

add(three);

}

public static void main(String args[])

{

LabelDemo l=new LabelDemo("Demonstration of labels"); l.setSize(300, 250);

l.setVisible(true);

}

}
