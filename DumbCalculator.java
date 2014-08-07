import java.util.Scanner;

public class DumbCalculator
{
  public static void main( String[] args )
  {
    Scanner keyboard = new Scanner( System.in );
    double first, second, third;

    System.out.print("Gimme a number: ");
    first = keyboard.nextDouble();
    System.out.print("And anotha number: ");
    second = keyboard.nextDouble();
    System.out.print("And a third number: ");
    third = keyboard.nextDouble();

    System.out.println("( " + first + " + " + second + " + " + third + " ) / 2 = " + ((first + second + third) / 2));
  }
}
