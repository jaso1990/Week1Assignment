
import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.awt.Color;
import java.util.Scanner;

public class BarChart3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Pen p = new StandardPen(new SketchPadWindow(640, 480));
        PenBar pb1 = new PenBar();
        PenBar pb2 = new PenBar();
        PenBar pb3 = new PenBar();
        PenBar pb4 = new PenBar();
        System.out.print("Enter width of Bar 1: ");
        pb1.width = s.nextInt();
        System.out.print("Enter width of Bar 2: ");
        pb2.width = s.nextInt();
        System.out.print("Enter width of Bar 3: ");
        pb3.width = s.nextInt();
        System.out.print("Enter width of Bar 4: ");
        pb4.width = s.nextInt();
        makeBar(p, pb1, -400, 150, pb1.width, Color.blue);
        makeBar(p, pb2, -400, 50, pb2.width, Color.red);
        makeBar(p, pb3, -400, -50, pb3.width, Color.darkGray);
        makeBar(p, pb4, -400, -150, pb4.width, Color.black);

    }

    public static void makeBar(Pen p, PenBar pb, int x, int y, int w, Color c) {
        pb.x = x;
        pb.y = y;
        pb.width = w;
        pb.barCol = c;
        pb.draw(p);

    }

}
