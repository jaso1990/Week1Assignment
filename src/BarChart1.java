
import hsa.Console;
import java.awt.Color;

public class BarChart1 {

    public static void main(String[] args) {
        Console c = new Console();
        int h, y;
        c.setColor(Color.RED);
        for (int i = 1; i < 5; i++) {
            c.print("Enter height of Bar " + i + ": ");
            h = c.readInt();
            y = 500-h;
            c.fillRect(i *100, y, 50, h);
            c.drawString("Value: " + h, 100 * i, y-20);
        }
        
    }

}
