import java.util.*;

public class Answer2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println("Welcome to the Download Time Estimator\n");
        Scanner scanner = new Scanner(System.in);

        String ans = "";
        int fileSize, downloadSpeed;

        do {
            System.out.print("Enter file size (MB): ");
            fileSize = scanner.nextInt();

            System.out.print("Enter download speed (MB/sec): ");
            downloadSpeed = scanner.nextInt();

            int seconds = fileSize / downloadSpeed;

            int hours = seconds / 3600;
            int minutes = (seconds % 3600) / 60;
            seconds = (seconds % 3600) % 60;

            System.out.println(String.format("This download will take approximately %s hours %s minutes %s seconds",
                    hours, minutes, seconds));
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
        } while (true);

        scanner.close();
    }

}
