package AWT;

import java.awt.*;

class myFrame extends Frame{

    Label l;
    TextField tf;
    Button b;

    public myFrame(){
        super("My App");

        setLayout ( new FlowLayout () );

        l  =new Label ("NAME");
        tf = new TextField (20);
        b = new Button("OK");

        add(l);
        add(tf);
        add(b);

    }
}

public class FirstAppDemo {
    public static void main(String[] args) {

        myFrame f = new myFrame ();
        f.setSize(400,400);
        f.setVisible ( true );

    }
}
