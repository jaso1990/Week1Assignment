
import java.util.Scanner;

public class PizzaCost {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int inch, top;
        double cost = 2.25; //initial cost (oven + labour)
        System.out.print("What size pizza would you like?: ");
        inch = s.nextInt();
        System.out.print("How many toppings would you like?: ");
        top = s.nextInt();
        cost += .50 * inch; //base ingredients
        cost += 0.75 * top; // toppings
        System.out.format("Your total cost is: $%.2f\n", cost); //8.25
        System.out.println("Thank you for your order");
        
        
    }

}
