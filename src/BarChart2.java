
import hsa.Console;
import java.awt.Color;

public class BarChart2 {

    public static void main(String[] args) {
        Console c = new Console();
        Bar b1 = new Bar();
        Bar b2 = new Bar();
        Bar b3 = new Bar();
        Bar b4 = new Bar();
        b1.xloc = 100;
        c.print("Enter the height of Bar 1: ");
        b1.height = c.readInt();
        b1.col = Color.red;
        b2.xloc = 200;
        c.print("Enter the height of Bar 2: ");
        b2.height = c.readInt();
        b2.col = Color.blue;
        b3.xloc = 300;
        c.print("Enter the height of Bar 3: ");
        b3.height = c.readInt();
        b3.col = Color.black;
        b4.xloc = 400;
        c.print("Enter the height of Bar 4: ");
        b4.height = c.readInt();
        b4.col = Color.green;

        //draw the bars
        b1.draw(c); //draw with the console
        b2.draw(c);
        b3.draw(c); //draw with the console
        b4.draw(c);
    }

}
