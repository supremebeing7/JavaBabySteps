import java.util.Random;
import java.util.Scanner;

public class Blackjack
{
    public static void main(String[] args) throws Exception
    {
        Random r = new Random();


        int player_card1 = 2+ r.nextInt(10);
        int player_card2 = 2+ r.nextInt(10);
        int player_total = player_card1 + player_card2;
        int player_card3 = 0;

        int dealer_card1 = 2+ r.nextInt(10);
        int dealer_card2 = 2+ r.nextInt(10);
        int dealer_total = dealer_card1 + dealer_card2;
        int dealer_card3 = 0;

        // To add suits and face cards
        String[] suits = {" of Diamonds", " of Hearts", " of Clubs", " of Spades"};
        String[] faces = {"Jack", "Queen", "King"};
        String pcard1 = "";
        String pcard2 = "";
        String pcard3 = "";
        String dcard1 = "";
        String dcard2 = "";
        String dcard3 = "";

        // Should refactor this out into separate function
        if (player_card1 == 11)
            pcard1 = "Ace" + suits[r.nextInt(4)];
        else if (player_card1 == 10)
            pcard1 = faces[r.nextInt(3)] + suits[r.nextInt(4)];
        else
            pcard1 = Integer.toString(player_card1) + suits[r.nextInt(4)];

        if (player_card2 == 11)
            pcard2 = "Ace" + suits[r.nextInt(4)];
        else if (player_card2 == 10)
            pcard2 = faces[r.nextInt(3)] + suits[r.nextInt(4)];
        else
            pcard2 = Integer.toString(player_card2) + suits[r.nextInt(4)];

        if (dealer_card1 == 11)
            dcard1 = "A" + suits[r.nextInt(4)];
        else if (dealer_card1 == 10)
            dcard1 = faces[r.nextInt(3)] + suits[r.nextInt(4)];
        else
            dcard1 = Integer.toString(dealer_card1) + suits[r.nextInt(4)];

        if (dealer_card2 == 11)
            dcard2 = "A" + suits[r.nextInt(4)];
        else if (dealer_card2 == 10)
            dcard2 = faces[r.nextInt(3)] + suits[r.nextInt(4)];
        else
            dcard2 = Integer.toString(dealer_card2) + suits[r.nextInt(4)];


        Scanner keyboard = new Scanner(System.in);

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("BLACKJACK\n");

        System.out.println("You drew " + pcard1 + " and " + pcard2 + ".");
        System.out.println("Your total is " + player_total + ".\n");
        Thread.sleep(800);

        System.out.println("The dealer has " + dcard1 + " and a hidden card.\n");
        Thread.sleep(400);
        String input = "";

        while (player_total < 21 && input != "S")
        {
            System.out.print("(H)it or (S)tay? ");
            input = keyboard.next();
            if (input.equals("H") || input.equals("h"))
            {
                player_card3 = 2+ r.nextInt(10);
                player_total += player_card3;

                if (player_card3 == 11)
                    pcard3 = "Ace" + suits[r.nextInt(4)];
                else if (player_card3 == 10)
                    pcard3 = faces[r.nextInt(3)] + suits[r.nextInt(4)];
                else
                    pcard3 = Integer.toString(player_card3) + suits[r.nextInt(4)];

                Thread.sleep(400);
                System.out.println("You draw a " + pcard3 + ".");
                Thread.sleep(400);
                System.out.println("Your total is now " + player_total + ".");
            }
            else if (input.equals("S") || input.equals("s"))
                break;
            else
                System.out.println("Not an option");
        }

        if (player_total > 21)
            System.out.println("You bust! Dealer wins");
        else
        {
            System.out.println("\nDealer's hidden card is " + dcard2 + ".");
            Thread.sleep(1000);
            System.out.println("Dealer's total is " + dealer_total + ".");

            while (dealer_total < 21 && dealer_total < player_total)
            {
                dealer_card3 = 2+ r.nextInt(10);
                dealer_total += dealer_card3;

                if (dealer_card3 == 11)
                    dcard3 = "Ace" + suits[r.nextInt(4)];
                else if (dealer_card3 == 10)
                    dcard3 = faces[r.nextInt(3)] + suits[r.nextInt(4)];
                else
                    dcard3 = Integer.toString(dealer_card3) + suits[r.nextInt(4)];

                Thread.sleep(400);
                System.out.println("Dealer hits and draws " + dcard3 + ".");
                Thread.sleep(400);
                System.out.println("Dealer's total is now " + dealer_total + ".");
                Thread.sleep(1000);
            }

            if (dealer_total > 21)
                System.out.println("Dealer bust! You win!");
            else if (player_total == 21 && dealer_total == 21)
            {
                if (dealer_card3 == 0 && player_card3 != 0)
                    System.out.println("Dealer got a Blackjack, you lose!");
                else if (dealer_card3 != 0 && player_card3 == 0)
                    System.out.println("You got a Blackjack, you win!");
                else
                    System.out.println("Tie - all bets returned");
            }
            else if (player_total > dealer_total)
                System.out.println("YOU WIN!");
            else if (player_total == dealer_total)
                System.out.println("Tie - all bets returned");
            else
                System.out.println("You Lose...");
        }
    }
}
