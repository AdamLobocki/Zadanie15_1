import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        Rrader reader = new Rrader();
        Map<String, Countries> kraje = reader.readCountry("Countries.csv");
        System.out.println("Podaj kod kraju, o którym chcesz zobaczyć informacje:");
        String x = scanner.nextLine();
        System.out.println(x);
        System.out.println(kraje.get(x));

    }
}
