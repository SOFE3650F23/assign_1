import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

public class FileReader {

    public static List<String> readFile(String filePath) throws IOException {
        return Files.readAllLines(Paths.get(filePath));
    }

    public static Double PriceReader(String path, String name) {
        String filePath = path;
        Double price;

        try {
            List<String> lines = readFile(filePath);
            Boolean found = false;
            for (String line : lines) {
                if(found){
                    try{
                        price = Double.parseDouble(line);
                        return price;
                    } catch(NumberFormatException e){
                        System.err.println("Error converting double");
                        return -1.0;
                    }
                }

                if(line.equalsIgnoreCase(name)){
                    found = true;
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        return -1.0;
    }
}
