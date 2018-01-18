// This program should ask the 'customer' if he wants his hair cut or washed or both. Then it calculates the cost and puts it out.

import java.util.Scanner;

class Barber{
  double pricecutting = 18.00;
  double pricewashing = 8.00;
  double pricecombined;
public static void main (String [] args) {
  System.out.println("would you like to get your hair cut?");
  Scanner scanner = new Scanner(System.in);
  if (scanner.next())                         // equalsIgnoreCase 
  System.out.println("would you like to get your hair washed?");
  System.out.println("Thanks for your visit!");
  }
}
