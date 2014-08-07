import java.util.Scanner;

public class WhatIf
{
  public static void main( String[] args )
  {
    Scanner keyboard = new Scanner( System.in );

    int people = 20;
    int dogs = 15;
    int cats;

    System.out.print( "how many cats? ");
    cats = keyboard.nextInt();

    if (people < cats)
    {
      System.out.println( "too many cats, I hates them");
    }
    else
    {
      System.out.println( "Good riddance, kitties");
    }
    people += 15;

    if (people > cats)
    {
      System.out.println( "we made more people, and now we're the champions");
    }
    else
    {
      System.out.println( "still not enough people!");
    }
  }
}
