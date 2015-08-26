import javax.swing.*;

public class CollatzSequence
{
  public static void main(String[] args)
  {
    String input = JOptionPane.showInputDialog("Starting number (must be positive integer)");
    int number = Integer.parseInt(input);
    int steps = 0;
    int largest = 0;

    while (number != 1)
    {
      if (number % 2 == 0)
        number /= 2;
      else
        number = number*3 + 1;
      if (steps % 6 == 0)
        System.out.print("\n");
      steps++;
      System.out.print(number + "\t");
      if (number > largest)
        largest = number;
    }
    System.out.println("\nTerminated after " + steps + " steps");
    System.out.println("Largest number encountered: " + largest);
  }
}
