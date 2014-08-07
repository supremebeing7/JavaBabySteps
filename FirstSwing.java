import javax.swing.*;

public class FirstSwing
{
  public static void main( String[] args )
  {
    String name = JOptionPane.showInputDialog("What is your name?");
    String input = JOptionPane.showInputDialog("How old are you?");
    int age = Integer.parseInt(input);

    System.out.println("Hello, " + name + ".");
    System.out.println("Next year, you will be " + (age + 1) + " years old.");

    System.exit(0);
  }
}
