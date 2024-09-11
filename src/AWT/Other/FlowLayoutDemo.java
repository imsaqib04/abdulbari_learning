package AWT.Other;

import java.awt.*;
import java.awt.event.*;


class MYFRame extends Frame implements ItemListener
{

    Button b1,b2,b3;
    TextField t1,t2,t3;

    Panel p1,p2,cp;

    Panel mainp;


    Checkbox c1,c2;
    CardLayout cl;

    public MYFRame(){

        super ("cardLayout Demo");

        CheckboxGroup cg = new CheckboxGroup ();

        c1 = new Checkbox ("ONE ",true,cg);
        c2 = new Checkbox ("TWO",false,cg);

        c1.addItemListener ( this );
        c2.addItemListener ( this );

        b1 = new Button ("One");
        b1 = new Button ("Two");
        b1 = new Button ("Three");

        t1 = new TextField (10);
        t2 = new TextField (10);
        t3 = new TextField (10);

        cp = new Panel ();
        cp.add ( c1 );
        cp.add ( c2 );

        p1=new Panel();
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);

        p2=new Panel();
        p2.add(t1);
        p2.add(t2);
        p2.add(t3);

        mainp=new Panel();
        cl=new CardLayout();
        mainp.setLayout(cl);

        mainp.add("ONE",p1);
        mainp.add("TWO",p2);

        add(cp,BorderLayout.NORTH);
        add(mainp,BorderLayout.CENTER);
    }


    @Override
    public void itemStateChanged(ItemEvent e) {

        if(c1.getState())
            cl.first(mainp);
        else
            cl.last(mainp);
    }
}


public class FlowLayoutDemo {
    public static void main(String[] args) {

        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);

    }
}
