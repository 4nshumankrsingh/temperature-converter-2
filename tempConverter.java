import java.util.Scanner;
public class tempConverter {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double temp;
        double newTemp;
        String unit;
        
        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Convert to Celcius or Fahrenheit? (C/F): ");
        unit = scanner.nextLine().toUpperCase();

        newTemp = (unit.equals("F")) ? (temp * 9 / 5) + 32 : (temp - 32) * 5 / 9;
        System.out.printf("%.2f°%s", newTemp, unit);

       scanner.close();
        
    }
}