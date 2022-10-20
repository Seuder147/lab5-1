public class Circle extends Shape{
    private double x;
    private double y;
    private double r;

    public Circle(double x, double y,double r,  DrawingAPI drawingAPI) {
        super(drawingAPI);

        type = "Circle";
        this.r = r;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawingAPI.drawCircle(x, y, r);
    }
}
