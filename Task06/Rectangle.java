package Task06;

public class Rectangle {
    private double length;
    private double breadth;

    public Rectangle() {
        this.length = 0.0;
        this.breadth = 0.0;
    }

    public Rectangle(double l, double b) {
        this.length = l;
        this.breadth = b;
    }

    public Rectangle(double x) {
        length = x;
        breadth = x;
    }

    public double area() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(2.3, 2.2);
        Rectangle rectangle3 = new Rectangle(2.2);
        System.out.println(rectangle1.area());
        System.out.println(rectangle2.area());
        System.out.println(rectangle3.area());
    }


}
