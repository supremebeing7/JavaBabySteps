import java.util.Scanner;

public class SpaceBoxing
{
  public static void main( String[] args)
  {
    Scanner keyboard = new Scanner( System.in );

    System.out.print( "Enter your current weight: " );
    double weight = keyboard.nextDouble();

    System.out.println( "\nI have information for the following planets:" );
    System.out.println( "   1. Venus   2. Mars    3. Jupiter" );
    System.out.println( "   4. Saturn  5. Uranus  6. Neptune" );

    System.out.print( "\nWhich planet are you visiting? " );
    int planet = keyboard.nextInt();

    if (planet >= 1 && planet <= 6)
    {
      double space_weight = 1;
      switch (planet) {
        case 1: space_weight = weight * 0.78;
                break;
        case 2: space_weight = weight * 0.39;
                break;
        case 3: space_weight = weight * 2.65;
                break;
        case 4: space_weight = weight * 1.17;
                break;
        case 5: space_weight = weight * 1.05;
                break;
        case 6: space_weight = weight * 1.23;
                break;
      }
      System.out.println( "\nYour weight would be " + space_weight + " on that planet." );
    }
    else
    {
      System.out.println( "\nInvalid planet selection" );
      main(args);
    }
  }
}
