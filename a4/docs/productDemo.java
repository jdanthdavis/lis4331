import java.util.Scanner;

class productDemo {

    public static void main(String [] args) {

        String cde = "";
        String dsc = "";
        double pce = 0;
        Scanner sc = new Scanner (System.in);

        System.out.println("\nBelow are default constructor values:");
        Product v1 = new Product();
        System.out.println("\nCode = " + v1.getCode());
        System.out.println("\nDescription = " + v1.getDesc());
        System.out.println("\nPrice = " + v1.getPrice());

        System.out.print("\nCode: ");
        cde = sc.nextLine();

        System.out.print("\nDescription: ");
        dsc = sc.nextLine();

        System.out.print("\nPrice: ");
        pce = sc.nextDouble();

        Product v2 = new Product(cde, dsc, pce);
        System.out.println("\nCode = " + v2.getCode());
        System.out.println("\nDescription = " + v2.getDesc());
        System.out.println("\nPrice = " + v2.getPrice());
        v2.print();
    }
}