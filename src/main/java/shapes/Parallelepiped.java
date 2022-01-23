package shapes;

import java.awt.*;
import java.awt.geom.Path2D;

public class Parallelepiped extends Shape {
    private static final String NAME = "Parallelepiped";
    private final int x;
    private final int y;
    private final int side;

    public Parallelepiped(int x, int y, int side) {
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
        setSize(800, 800);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawPolygon(new int[] {x+4*side/3, x+side, x, x+side/3, x+4*side/3, x+4*side/3, x+side, x+side, x, x, x+side, x+4*side/3}, new int[] {y, y+side/3, y+side/3, y, y, y+side, y+4*side/3, y+side/3, y+side/3, y+4*side/3, y+4*side/3, y+side}, 12);
    }
}
