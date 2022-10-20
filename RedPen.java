public class RedPen implements DrawingAPI{
    @Override
    public void drawCircle( double x, double y, double r) {
        System.out.printf("Drawing circle: color = red, x = %.2f, y = %.2f, r = %.2f\n",x, y, r);
    }

    @Override
    public void drawSquare(double a, double x, double y) {
        System.out.printf("Drawing square: color = red, a = %.2f, x = %.2f, y = %.2f\n", a, x, y);
    }

    @Override
    public void drawRectangle(double a, double b, double x, double y) {
        System.out.printf("Drawing rectangle: color = red, a = %.2f, b = %.2f, x = %.2f, y = %.2f\n", a, b, x, y);
    }
}
