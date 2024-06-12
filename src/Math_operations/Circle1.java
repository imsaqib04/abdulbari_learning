package Math_operations;

        public class Circle1 {
            public double radius1;

            //constructor

            public Circle1(double radius1) {
                this.radius1 = radius1;
            }

            //constructor

            public Circle1() {
            }

            public double area1() {
                return Math.PI * radius1 * radius1;
            }

            public double perimeter() {
                return 2 * Math.PI * radius1;
            }
        }
