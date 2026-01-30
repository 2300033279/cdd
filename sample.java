import java.util.Scanner;

public class TemperatureCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        int temp = sc.nextInt();

        if (temp < 0) {
            System.out.println("Freezing weather");
        } else if (temp < 20) {
            System.out.println("Cold weather");
        } else if (temp < 30) {
            System.out.println("Normal weather");
        } else {
            System.out.println("Hot weather");
        }

        sc.close();
    }
}
