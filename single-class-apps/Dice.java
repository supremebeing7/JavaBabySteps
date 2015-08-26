import java.util.Random;

public class Dice
{
  public static void main(String[] args)
  {
    Random r = new Random();
    int die1 = 1 + r.nextInt(6);
    int die2 = 1 + r.nextInt(6);

    System.out.println("HERE COMES THE DICE!\n");
    System.out.println("Roll #1: " + die1);
    System.out.println("Roll #2: " + die2);
    System.out.println("Total: " + (die1 + die2));
  }
}
