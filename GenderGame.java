import javax.swing.*;

public class GenderGame
{
  public static void main( String[] args )
  {
    String gender = JOptionPane.showInputDialog("What is your gender (M or F): ");
    String first_name = JOptionPane.showInputDialog("First name: ");
    String last_name = JOptionPane.showInputDialog("Last name: ");
    String input = JOptionPane.showInputDialog("Age: ");
    int age = Integer.parseInt(input);

    String salutation = "";

    if (gender.equals("M"))
    {
      if (age >= 20)
      {
        salutation = "Mr.";
      }
      else
      {
        salutation = first_name;
      }
    }
    if (gender.equals("F"))
    {
      if (age >= 20)
      {
        String marital_status = JOptionPane.showInputDialog("Are you married, " + first_name + " (y or n)? ");
        if (marital_status.equals("y"))
        {
          salutation = "Mrs.";
        }
        else
        {
          salutation = "Ms.";
        }
      }
      else
        salutation = first_name;
    }
    System.out.println("Then I shall call you " + salutation + " " + last_name + ".");


  }
}
