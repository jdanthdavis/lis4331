public class ArrayDemo
{
    public static void main (String args [])
    {
        System.out.println("Program creates an array with the following numbers, \n"
                            + "and performs the operations below using user-defined methods.");
        System.out.println();

        int[] numbers = {12, 15, 34, 67, 4, 9, 10, 7, 13, 50};
        int limit = 12;
        display(numbers);
        displayReverse(numbers);
        displaySum(numbers);
        displayHigherThanAverage(numbers);
    }

    public static void display(int[] numbers)
    {
        System.out.println("Numbers in the array are ");
        for(int i = 0; i < numbers.length; ++ i)
            System.out.print(numbers[i] + " ");
    }

    public static void displayReverse(int[] numbers)
    {
        System.out.println("\nNumbers in reverse order are ");
        for(int i = numbers.length -1; i >= 0; --i)
            System.out.print(numbers[i] + " ");
    }

    public static void displaySum(int[] numbers)
    {
        int total = 0;
        for(int i = 0; i < numbers.length; i++)
        {
            total += numbers[i];
        }
        System.out.println("\nSum of all nunmbers is " + total);
    }

    public static void displayHigherThanAverage(int[] numbers)
    {
        int sum = 0;
        double average;

        for(int i = 0; i < numbers.length; ++i)
            sum += numbers[i];
        average = sum * 1.0 / numbers.length;

        System.out.println("Average is " + average);
        for(int i = 0; i < numbers.length; i++)
            if(numbers[i] > average)
            System.out.print(numbers[i] + " ");
            System.out.println("are greater than the average");
    }
}