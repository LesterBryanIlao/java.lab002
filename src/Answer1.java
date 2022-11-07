import java.util.Scanner;

public class Answer1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Welcome to the Invoice Total Calculator\n");

        Scanner scanner = new Scanner(System.in);

        int index = 1;
        String ans = "";
        float invoiceSum = 0, discountSum = 0;

        do {
            System.out.print("Enter subtotal: ");
            int subTotal = scanner.nextInt();

            System.out.print("Discount percent: ");
            float discountPercent = scanner.nextFloat();

            float discountAmount = discountPercent * 100;
            System.out.println(String.format("Discount amount: %s", discountAmount));
            discountSum += discountAmount;

            float invoiceTotal = (1 - discountPercent) * subTotal;
            System.out.println(String.format("Invoice total: %s", invoiceTotal));
            invoiceSum += invoiceTotal;

            System.out.print("\nCountinue? (y/n): ");
            ans = scanner.next().toLowerCase();

            if (ans.equalsIgnoreCase("n"))
                continue;

            if (ans.equalsIgnoreCase("n"))
                break;

            if (!ans.equalsIgnoreCase("n") || !ans.equalsIgnoreCase("y")) {
                System.out.println("Invalid input.");
                break;
            }

            index++;
        } while (true);

        System.out.println(String.format("Number of invoices: %s", index));
        System.out.println(String.format("Average invoice: %s", invoiceSum / index));
        System.out.println(String.format("Average discount: %s", discountSum / index));

        scanner.close();
    }
}
