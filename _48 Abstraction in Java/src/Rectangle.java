public class Rectangle extends Shape {

    double width;
    double length;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;

    }
    @Override
    double area() {
        return length * width;
    }
}
