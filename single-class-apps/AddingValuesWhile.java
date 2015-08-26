import java.util.Scanner;

public class AddingValuesWhile
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("I will add the numbers you give me");
    System.out.print("Number: ");
    int input = keyboard.nextInt();
    int total = input;

    while (input != 0)
    {
      System.out.println("The total so far is " + total);
      System.out.print("Number: ");
      input = keyboard.nextInt();
      total += input;
    }
    System.out.println("The final total is " + total);
  }
}
