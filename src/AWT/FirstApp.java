package AWT;

import java.awt.*;

public class FirstApp {
    public static void main(String[] args) {

        Frame f = new Frame ("My First App");
        f.setLayout ( new FlowLayout () );

        Button b = new Button ("OK");
        Label l = new Label ("NAME");
        TextField tf = new TextField(20);

        f.add ( l );
        f.add(tf);
        f.add ( b );

        f.setSize ( 300,300 );
        f.setVisible ( true );

    }

}
