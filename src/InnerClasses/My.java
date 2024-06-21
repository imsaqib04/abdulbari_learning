package InnerClasses;

abstract class My {
    abstract public void Show();
}


class outer {

    public void Display() {

        My m = new My () {
            public void Show() {
                System.out.println ( "HELLO" );
            }
        };
        m.Show ();
    }
}


//    public class InnerClasses {
//
//        public static void main(String[] args) {
//            outer o = new outer ();
//            o.Display ();
//        }
//    }
//}
