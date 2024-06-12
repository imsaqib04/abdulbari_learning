package Math_operations;

        class Cylinder1 extends Circle1 {
            public double height1;
            public double volume1;

            public Cylinder1(double height1, double volume1, double radius1) {
                this.radius1 = radius1;
                this.height1 = height1;
                this.volume1 = volume1;
            }

            public double volume1() {
                return this.area1() * height1;
            }

            public static void main(String[] args) {
                Cylinder1 c1 = new Cylinder1(4, 3, 6);
                System.out.println(c1.volume1());
                Circle1 c2 = new Circle1(5);
                System.out.println(c2.area1());
            }
        }