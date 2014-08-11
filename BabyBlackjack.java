import java.util.Random;

public class BabyBlackjack
{
  public static void main(String[] args)
  {
    Random r = new Random();
    int player_card1 = 1+ r.nextInt(10);
    int player_card2 = 1+ r.nextInt(10);
    int player_total = player_card1 + player_card2;
    int dealer_card1 = 1+ r.nextInt(10);
    int dealer_card2 = 1+ r.nextInt(10);
    int dealer_total = dealer_card1 + dealer_card2;

    System.out.println("Baby Blackjack!\n");

    System.out.print("You drew " + player_card1);
    try {
        Thread.sleep(1400);
    } catch(InterruptedException ex) {
        Thread.currentThread().interrupt();
    }
    System.out.print(" and " + player_card2 + ".\n");
    try {
        Thread.sleep(1000);
    } catch(InterruptedException ex) {
        Thread.currentThread().interrupt();
    }
    System.out.println("Your total is " + player_total + ".");
    try {
        Thread.sleep(1000);
    } catch(InterruptedException ex) {
        Thread.currentThread().interrupt();
    }

    System.out.print("The dealer has " + dealer_card1 + " and ");
    try {
        Thread.sleep(1400);
    } catch(InterruptedException ex) {
        Thread.currentThread().interrupt();
    }
    System.out.print(".");
    try {
        Thread.sleep(1400);
    } catch(InterruptedException ex) {
        Thread.currentThread().interrupt();
    }
    System.out.print(".");
    try {
        Thread.sleep(1400);
    } catch(InterruptedException ex) {
        Thread.currentThread().interrupt();
    }
    System.out.print(". ");
    try {
        Thread.sleep(1400);
    } catch(InterruptedException ex) {
        Thread.currentThread().interrupt();
    }
    System.out.print(dealer_card2 + ".\n");
    try {
        Thread.sleep(1000);
    } catch(InterruptedException ex) {
        Thread.currentThread().interrupt();
    }
    System.out.println("Dealer's total is " + dealer_total + ".");

    if (player_total > dealer_total)
      System.out.println("YOU WIN!");
    else
      System.out.println("You Lose...");
  }
}
