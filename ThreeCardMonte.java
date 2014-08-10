import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte
{
  public static void main(String[] args)
  {
    Random r = new Random();
    int monte = 1 + r.nextInt(3);

    Scanner keyboard = new Scanner(System.in);

    System.out.println("\n\n\nYou slide up to Fast Eddie's card table and plop down your cash.");
    System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
    System.out.println("He lays down three cards.\n");

    System.out.println("Which one is the ace?\n");

    System.out.println("  ##  ##  ##");
    System.out.println("  ##  ##  ##");
    System.out.println("  1   2   3");

    System.out.print("\n> ");
    int input = keyboard.nextInt();

    if (input == monte)
      System.out.println("\nYou chose wisely\n");
    else
      System.out.println("\nYou chose poorly, the correct choice was " + monte + "\n");

    if (monte == 1)
    {
      System.out.println("  AA  ##  ##");
      System.out.println("  AA  ##  ##");
    }
    else if (monte == 2)
    {
      System.out.println("  ##  AA  ##");
      System.out.println("  ##  AA  ##");
    }
    else if (monte == 3)
    {
      System.out.println("  ##  ##  AA");
      System.out.println("  ##  ##  AA");
    }
    else
    {
      System.out.println("ERRRRRRRROOOOOORRRRRRRRRRRRRRRRRR");
    }
    System.out.println("  1   2   3\n");
  }
}
