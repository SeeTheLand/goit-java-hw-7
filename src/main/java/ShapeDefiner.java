import shapes.*;

public class ShapeDefiner {
    public String shapeName(Shape shape) {
        return shape.getName();
    }
}

class ShapeDefinerTest {
    public static void main(String[] args) {
        ShapeDefiner definer = new ShapeDefiner();

        Shape testshape = new Parallelepiped(20, 100, 300);
        testshape.draw();
    }
}
