
import java.util.Scanner;

public class Momentum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double kg, vel, mom;
        System.out.print("Enter the object's mass in kg: ");
        kg = s.nextDouble();
        System.out.print("Enter the object's velocity: ");
        vel = s.nextDouble();
        mom = kg * vel;
        System.out.format("The object's momentum is %.2f\n", mom);
    }

}
