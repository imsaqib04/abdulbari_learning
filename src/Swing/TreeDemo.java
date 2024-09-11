package Swing;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
//import java.swing.tree.*;
import java.io.*;
import java.util.StringTokenizer;


    class MyFrame1 extends JFrame {

        JTree tree;
        JLabel label;

        public MyFrame1() {

            super ( "tree Demo" );
            DefaultMutableTreeNode root = new DefaultMutableTreeNode ( "C:\\Users\\saqib\\java");
            File f = new File ("C:\\Users\\saqib\\java" );

            for (File x : f.listFiles ()){

                root.add(new DefaultMutableTreeNode (x.getName ()));

            }

            tree = new JTree(root);
            label = new JLabel ("No Files Selected");

            add(tree,BorderLayout.CENTER);
            add(label,BorderLayout.SOUTH);


        }
    }



    public class TreeDemo {
        public static void main(String[] args) {

            MyFrame1 F = new MyFrame1 ();
            F.setSize ( 400,400 );
            F.setVisible ( true );
            F.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE );


        }

    }


