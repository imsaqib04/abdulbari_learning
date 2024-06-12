package Math_operations;

class RunTime {
    public static void main(String[] args) {

        Math_operations.Circle c1 = new Math_operations.Circle();
        Math_operations.Circle c2 = new Math_operations.Circle();
        c1.radius = 5;
        c2.radius = 10;
        System.out.println(c1.area());
        System.out.println(c2.area());
        System.out.println(c1.circumference());
        System.out.println(c2.circumference());

        System.out.println("\n");

        Math_operations.Rectangle r1 = new Math_operations.Rectangle();
        r1.length = 5;
        r1.breadth = 5;
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
        System.out.println(r1.isSquare());
    }
}