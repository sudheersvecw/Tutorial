public class Square extends Shape {
    private final double a; // sides
    double area;
    double perimeter;
    public Square() {
        this(1);
    }
    public Square(double a) {
        this.a = a;
      
    }


    public double area() {
       area= a*a;
    }

    public double perimeter() {
       
        perimeter= 4*a;
    }
}

