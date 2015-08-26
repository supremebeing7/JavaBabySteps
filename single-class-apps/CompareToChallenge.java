import java.util.Scanner;

public class CompareToChallenge
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Give me the first thing to compare: ");
    String first = keyboard.next();

    System.out.print("Give me the second thing to compare: ");
    String second = keyboard.next();

    int result = first.compareTo(second);
    System.out.println("Comparing \"" + first + "\" with \"" + second + "\" produces " + result);

    System.out.print("Press 'x' to exit or any key to go again: ");
    if (keyboard.next().equals("x"))
    {
      System.exit(0);
    }
    else
    {
      main(args);
    }
  }
}
