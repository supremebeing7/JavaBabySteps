import java.util.Scanner;

public class TriangleTracker
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    int side1;
    int side2;
    int side3;

    System.out.println("Enter three positive integers in ascending order and we will tell you if they make a right triangle.");

    do
    {
      System.out.print("Side 1: ");
      side1 = keyboard.nextInt();
      if (side1 < 0)
        System.out.println("No negative numbers please");
    } while (side1 < 0);
    do
    {
      System.out.print("Side 2: ");
      side2 = keyboard.nextInt();
      if (side2 < side1)
        System.out.println("Side 2 (" + side2 + ") must be equal to or larger than side 1 (" + side1 + ")");
    } while (side2 < side1);
    do
    {
      System.out.print("Side 3: ");
      side3 = keyboard.nextInt();
      if (side3 < side2)
        System.out.println("Side 3 (" + side3 + ") must be equal to or larger than side 2 (" + side2 + ")");
    } while (side3 < side2);

    if (side1*side1 + side2*side2 == side3*side3)
      System.out.println("Heyo! " + side1 + ", " + side2 + ", and " + side3 + " make a right triangle.");
    else
      System.out.println("Ugh... " + side1 + ", " + side2 + ", and " + side3 + " do NOT make a right triangle.");
  }
}
