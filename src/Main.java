// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to yuhao's tip calculator!");
        System.out.print("How many people are in your group: ");
        int people = scan.nextInt();
        System.out.print("What is the tip percentage(0-100): ");
        int tip = scan.nextInt();
        double number = 0;
        TipCalculator TipCalculator = new TipCalculator(people, tip);
        while (number != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            number = scan.nextDouble();
            TipCalculator.addMeal(number);
        }
        TipCalculator.addMeal(1);
        System.out.println("total bill before tip: $"+Math.round(TipCalculator.getTotalBillBeforeTip()*100)/100.0);
        System.out.println("Tip percentage: "+tip);
        System.out.println("Tip amount: $"+Math.round(TipCalculator.tipAmount()*100)/100.0);
        System.out.println("total bill with tip: $"+Math.round(TipCalculator.totalbill()*100)/100.0);
        System.out.println("cost per person before tip: $"+Math.round(TipCalculator.perPersonCostBeforeTip()*100)/100.0);
        System.out.println("tip per person: $"+Math.round(TipCalculator.perPersonTipAmount()*100)/100.0);
        System.out.println("total cost per person: $"+ Math.round(TipCalculator.perPersonTotalCost()*100)/100.0);

        }
}


