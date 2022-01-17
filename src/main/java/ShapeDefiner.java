public class ShapeDefiner {
    public String shapeName (Shape shape) {
        return shape.getName();
    }
}

class ShapeDefinerTest {
    public static void main(String[] args) {
        ShapeDefiner definer = new ShapeDefiner();

        System.out.println(definer.shapeName(new Quad()));
        System.out.println(definer.shapeName(new Circle()));

    }
}
