import java.awt.Graphics;

public abstract class AbstractMover implements Mover {
    protected int x;
    protected int y;
    protected int xDirection;
    protected int yDirection;
    protected Sprite sprite;

    public AbstractMover(int startX, int startY, Sprite sprite) {
        x = startX;
        y = startY;
        this.sprite = sprite;
    }

    @Override
    public void setMovementVector(int xIncrement, int yIncrement) {
        xDirection = xIncrement;
        yDirection = yIncrement;
    }

    @Override
    public void draw(Graphics graphics) {
        sprite.draw(graphics, x, y);
        move();
    }

    public abstract void move();
}
