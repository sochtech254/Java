package Part2.ch18stringHandling;

// Override toString() for Box class.
class Box
{
    double length;
    double width;
    double depth;

    Box(double l, double w, double d)
    {
        length = l;
        width = w;
        depth = d;
    }

    public String toString() {
        return "Dimensions are " + length + " by " + width + " by " + depth;
    }
}
class toStringDemo
{
    public static void main(String[] args)
    {
        Box b = new Box(12, 10, 14);
        String s = "Box b: " + b;    // concatenate Box object

        System.out.println(b);    // convert Box to string
        System.out.println(s);
    }
}
