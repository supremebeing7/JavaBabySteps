import java.util.Scanner;

public class GroceryList {
  public static void main(String[] args) {
    System.out.println("Here's what we're buying");
    String[] groceryList = {"soy sauce", "jerky", "toast"};
    for ( String groceryItem : groceryList ) {
      System.out.println(groceryItem);
    }

    Integer[] groceryPrices = {12,5,90};
    Integer total = 0;
    for (Integer price : groceryPrices) {
      total += price;
    }
    System.out.println("Our total is $" + total);
  }
}