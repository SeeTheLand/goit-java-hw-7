package shapes;

import java.awt.*;

public class Triangle extends Shape {
    private static final String NAME = "Triangle";
    private final int x;
    private final int y;
    private final int side;

    public Triangle(int x, int y, int side) {
        this.x = x;
        this.y = y;
        this.side = side;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void draw() {
        setTitle("Drawing a " + NAME);
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawPolygon(new int[] {x, x+side/2, x+side}, new int[] {y, y-side, y}, 3);
    }

}
