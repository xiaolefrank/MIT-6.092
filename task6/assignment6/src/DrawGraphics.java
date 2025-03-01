import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    // Bouncer movingSprite;

    // private ArrayList<Bouncer> Bouncers = new ArrayList<Bouncer>();
    // private ArrayList<StraightMover> StraightMovers = new
    // ArrayList<StraightMover>();

    private ArrayList<Mover> movers = new ArrayList<Mover>();

    /** Initializes this class for drawing. */
    public DrawGraphics() {

        Bouncer Bouncer1;
        Rectangle box1 = new Rectangle(15, 20, Color.RED);
        Bouncer1 = new Bouncer(100, 170, box1);
        Bouncer1.setMovementVector(3, 1);
        movers.add(Bouncer1);

        Bouncer Bouncer2;
        Bouncer2 = new Bouncer(200, 130, new Rectangle(20, 15, Color.yellow));
        Bouncer2.setMovementVector(-2, 3);
        movers.add(Bouncer2);

        StraightMover StraightMover1;
        StraightMover1 = new StraightMover(150, 150, new Line(50, 70, Color.black));
        StraightMover1.setMovementVector(-3, -3);
        movers.add(StraightMover1);

        StraightMover StraightMover2;
        StraightMover2 = new StraightMover(200, 200, new Line(0, 100, Color.blue));
        StraightMover2.setMovementVector(0, -2);
        movers.add(StraightMover2);
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        // movingSprite.draw(surface);
        // for (Bouncer Bouncer : Bouncers) {
        // Bouncer.draw(surface);
        // }
        // for (StraightMover StraightMover : StraightMovers) {
        // StraightMover.draw(surface);
        // }
        for (Mover mover : movers) {
            mover.draw(surface);
        }
    }
}
