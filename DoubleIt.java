import java.io.Console;

public class DoubleIt {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Give me a number and I'll double it:");
    String numberString = myConsole.readLine();
    System.out.println("Your number is " + numberString);
    Integer number = Integer.parseInt(numberString);
    System.out.println("Your number doubled is " + (number*2));
  }
}