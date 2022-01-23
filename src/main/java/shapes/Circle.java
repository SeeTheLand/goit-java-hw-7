package shapes;

import java.awt.*;

public class Circle extends Shape {
    private static final String NAME = "Circle";
    private final int x;
    private final int y;
    private final int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
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
        g2d.drawOval(x, y, radius, radius);
    }
}
