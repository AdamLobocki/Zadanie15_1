import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Rrader {


    Map<String, Countries> readCountry(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        Map<String, Countries> kraje = new HashMap<>();

        while(scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            String[] split = nextLine.split(";");
            kraje.put(split[0], new Countries(split[0], split[1], Long.valueOf(split[2])));
        }

        return kraje;
}



}
