import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
public class DrawGraphics {
    BouncingBox box;
    private ArrayList<BouncingBox> boxes;
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        // box = new BouncingBox(200, 50, Color.RED);
        // box.setMovementVector(4, 0);
        boxes = new ArrayList<BouncingBox>();
        BouncingBox box1 = new BouncingBox(35, 150, Color.RED);
        box1.setMovementVector(2, 3);
        boxes.add(box1);
        BouncingBox box2 = new BouncingBox(90, 65, Color.BLUE);
        box2.setMovementVector(2, -1);
        boxes.add(box2);
        BouncingBox box3 = new BouncingBox(200, 50, Color.ORANGE);
        box3.setMovementVector(-2, 3);
        boxes.add(box3);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        // surface.drawLine(50, 50, 250, 250);
        /*
         * //draw a blue rectangle
         * surface.setColor(Color.blue);
         * surface.fillRect(10,60,50,50);
         * surface.setColor(Color.black);
         * surface.drawRect(10,60,50,50);
         * //draw a yellow oval
         * surface.setColor(Color.yellow);
         * surface.fillOval(30,0,40,30);
         * surface.setColor(Color.black);
         * surface.drawOval(30,0,40,30);
         * //draw a green arc
         * surface.drawArc(43,43,113,113,-45,180);
         * surface.drawRect(43,43,113,113);
         * surface.setColor(Color.green);
         * surface.fillArc(43,43,113,113,-45,180);
         * //draw a polygon
         * int x[] ={50,60,80,90,80,60};
         * int y[] ={20,1,1,20,39,39};
         * for (int i=0;i<6;i++){
         * x[i]+=200;
         * y[i]+=260;
         * }
         * surface.setColor(Color.pink);
         * surface.fillPolygon(x,y,6);
         */
        for (BouncingBox box : boxes) {
            box.draw(surface);
        }
    }
}