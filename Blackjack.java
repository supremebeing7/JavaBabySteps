import java.util.Random;
import java.util.Scanner;

public class Blackjack
{
    public static void main(String[] args) throws Exception
    {
        Random r = new Random();
        int player_card1 = 2+ r.nextInt(10);
        int player_card2 = 2+ r.nextInt(10);
        int player_card3 = 0;
        int player_total = player_card1 + player_card2;
        int dealer_card1 = 2+ r.nextInt(10);
        int dealer_card2 = 2+ r.nextInt(10);
        int dealer_card3 = 0;
        int dealer_total = dealer_card1 + dealer_card2;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("BLACKJACK\n");

        System.out.println("You drew " + player_card1 + " and " + player_card2 + ".");
        System.out.println("Your total is " + player_total + ".\n");
        Thread.sleep(800);

        System.out.println("The dealer has " + dealer_card1 + " and a hidden card.\n");
        Thread.sleep(400);
        String input = "";

        while (player_total < 21 && input != "S")
        {
            System.out.print("(H)it or (S)tay? ");
            input = keyboard.next();
            if (input.equals("H"))
            {
                player_card3 = 2+ r.nextInt(10);
                player_total += player_card3;
                Thread.sleep(400);
                System.out.println("You draw a " + player_card3 + ".");
                Thread.sleep(400);
                System.out.println("Your total is now " + player_total + ".");
            }
            else if (input.equals("S"))
                break;
            else
                System.out.println("Not an option");
        }

        if (player_total > 21)
            System.out.println("You bust!");
        else
        {
            System.out.println("\nDealer's hidden card is " + dealer_card2 + ".");
            Thread.sleep(1000);
            System.out.println("Dealer's total is " + dealer_total + ".");

            while (dealer_total < 21 && dealer_total < player_total)
            {
                dealer_card3 = 2+ r.nextInt(10);
                dealer_total += dealer_card3;
                Thread.sleep(400);
                System.out.println("Dealer hits and draws " + dealer_card3 + ".");
                Thread.sleep(400);
                System.out.println("Dealer's total is now " + dealer_total + ".");
                Thread.sleep(1000);
            }

            if (dealer_total > 21)
                System.out.println("Dealer bust! You win!");
            else if (player_total == 21 && player_total == dealer_total)
            {
                if (dealer_card3 == 0 && player_card3 != 0)
                    System.out.println("Dealer Blackjack, you lose!");
                else if (dealer_card3 != 0 && player_card3 == 0)
                    System.out.println("Great Blackjack, you win!");
                else
                    System.out.println("Tie bet, all wagers returned");
            }
            else if (player_total > dealer_total)
                System.out.println("YOU WIN!");
            else
                System.out.println("You Lose...");
        }
    }
}
