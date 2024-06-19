package Circle1;

class Circle
{
    public double radius;

    public double area()
    {
        return Math.PI * radius *radius;
    }

    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double circumference()
    {
        return perimeter();
    }
}

class Cylinder extends Circle
{
    public double height;

    public double volume()
    {
        return area()*height;
    }

}

