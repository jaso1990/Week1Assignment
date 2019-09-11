
import java.awt.Color;
import TurtleGraphics.Pen;

public class PenBar {
    int x, y, width;
    Color barCol;
    
    public void draw(Pen p){
        p.up();
        p.move(x, y);
        p.down();
        p.setWidth(50);
        p.setColor(barCol);
        p.setDirection(0);
        p.move(width);
        p.up();
        p.move(35);
        p.drawString("Value: " + width);
        
        
                
        
    }
    
    
}
