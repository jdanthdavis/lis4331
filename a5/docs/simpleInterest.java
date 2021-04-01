import java.text.NumberFormat;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class simpleInterest {
    
    public static void main(String argsp[])
    {
        System.out.println("Program swaps to integers.");
        System.out.println();

        double princ = 0.0;
        int time = 0;
        double amount = 0;
        double rate = 0.0;
        Scanner input = new Scanner(System.in);

        System.out.print("Current principal: $ ");
        while (!input.hasNextDouble())
        {
            System.out.println("Not a valid number!\n");
            input.next();
            System.out.println("Please try again. Enter principal: $ ");
        }
        princ = input.nextDouble();

        System.out.print("\nInterest rate (per year): ");
        while (!input.hasNextDouble())
        {
            System.out.println("Not valid integer!\n");
            input.next();
            System.out.println("Please try again. Enter interest rate: ");
        }
        rate = input.nextDouble();
        rate = rate / 100;

        System.out.print("\nTotal time in years: ");
        while (!input.hasNextDouble())
        {
            System.out.println("Not valid integer!\n");
            input.next();
            System.out.println("Please try again. Enter third number: ");
        }
        time = input.nextInt();

        amount = princ * (1 + rate * time);
        rate = rate * 100;

        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
            System.out.println("\nYou will have saved " + nf.format(amount) +
                                " in " + time + " years, at an interest rate of " + rate + "%");
}
}   