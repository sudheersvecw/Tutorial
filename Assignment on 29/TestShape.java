
public class TestShape {
    public static void main(String[] args) {

        // Rectangle test
        double width = 5, length = 7;
        Shape rectangle = new Rectangle(width, length);
        System.out.println("Rectangle width: " + width + " and length: " + length
                + "\nResulting area: " + rectangle.area()
                + "\nResulting perimeter: " + rectangle.perimeter() + "\n");

        // Circle test
        double radius = 5;
        Shape circle = new Circle(radius);
        System.out.println("Circle radius: " + radius
            + "\nResulting Area: " + circle.area()
            + "\nResulting Perimeter: " + circle.perimeter() + "\n");

        // Square test
        double a = 5;
        Shape square = new Square(a);
        System.out.println("Square sides lengths: " + a 
                + "\nResulting Area: " + square.area()
                + "\nResulting Perimeter: " + square.perimeter() +"\n");
    }
}