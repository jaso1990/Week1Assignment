import hsa.Console;
import java.awt.Color;
public class Wagon {

    public static void main(String[] args) {
        Console c = new Console();
        c.setColor(Color.cyan);
        c.fillRect(-10, -10, 2000, 400); //sky
        c.setColor(Color.green);
        c.fillRect(-1, 350, 2000, 200); //grass
        c.setColor(Color.red);
        c.fillRect(200, 220, 200,100); //wagon
        c.setColor(Color.white);
        c.fillRect(250,220,100,100);    
        c.setColor(Color.black);
        c.fillOval(225,300,50,50); //wheel 1
        c.fillOval(330,300,50,50); //wheel 2
        c.drawLine(100,150,200,220); //handle
        c.setColor(Color.yellow);
        c.fillOval(500,50,75,75);  //sun
        c.setColor(Color.red);
        c.fillMapleLeaf(275, 250, 50, 50);
        c.setColor(Color.black);
        c.fillOval(520,70,10,10); //face
        c.fillOval(540,70,10,10);
        c.drawLine(520,100,550,100);
        
    }
    
}
