import java.util.Scanner;

public class ShippingCalculator {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner( System.in );;
    System.out.println("How much does it weigh?");
    double weight = keyboard.nextDouble();
    System.out.println("How many miles does it travel?");
    double distance = keyboard.nextDouble();
    System.out.println("What is the price modifier?");
    double modifier = keyboard.nextDouble();
    double total = ( weight / 10 ) + ( distance / 5 ) * modifier;
    System.out.println("Your total is: $" + total);
  }
}