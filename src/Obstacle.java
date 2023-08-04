import java.awt.Graphics;
import java.awt.Color;

public class Obstacle {
    
    RandomInteger Xrand = new RandomInteger(0, Pong.WINDOW_WIDTH);
    RandomInteger Yrand = new RandomInteger(0, Pong.WINDOW_HEIGHT);
    private int x, y;
    private Color color;
    
    public Obstacle(Color color) {
        this.x = Xrand.Generate();
        this.y = Yrand.Generate();
        this.color = color;
    }
          
    public void paint(Graphics g){
        g.setColor(color);
        g.fillRect(x, y, 10, 20);
    }
}
