import javax.swing.*;

public class AlphabeticalOrder
{
  public static void main(String[] args)
  {
    String last_name = JOptionPane.showInputDialog("What is your last name?");
    if ("Carswell".compareTo(last_name) >= 0)
      System.out.println("You don't have to wait long");
    else if ("Jones".compareTo(last_name) >= 0)
      System.out.println("That's not bad");
    else if ("Smith".compareTo(last_name) >= 0)
      System.out.println("Looks like a bit of a wait");
    else if ("Young".compareTo(last_name) >= 0)
      System.out.println("It's gonna be awhile");
    else
      System.out.println("Hope you don't have plans to leave anytime soon!");
  }
}
