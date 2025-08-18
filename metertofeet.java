import java.util.Scanner;

public class MeterToFeet {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Enter meters: ");
        float a = num.nextFloat();

        float b = a * 3.28084f;

        System.out.println(a + " meters = " + b + " feet");

        num.close();
    }
}
