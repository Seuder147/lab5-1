public class  Demo{
    public static void main(String[] args) {
        Shape circle = new Circle(1, 2, 3, new GreenPen());
        Shape rectangle = new Rectangle(3, 6, 2, 3, new RedPen());
        Shape square = new Square(3, 1, 5, new GreenPen());

        circle.draw();
        rectangle.draw();
        square.draw();
    }
}