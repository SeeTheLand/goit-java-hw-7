package shapes;

import java.awt.*;

public class Quad extends Shape {
    private static final String NAME = "Quad";
    private final int x;
    private final int y;
    private final int side;

    public Quad(int x, int y, int side) {
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
        g2d.drawPolygon(new int[] {x, x+side, x+side, x}, new int[] {y, y, y+side, y+side}, 4);
    }
}
