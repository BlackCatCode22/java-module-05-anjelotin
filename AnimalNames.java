import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AnimalNames {
    public static void main(String[] args) {
        ArrayList<String> hyenaNameList = new ArrayList<>();
        ArrayList<String> lionNameList = new ArrayList<>();
        ArrayList<String> bearNameList = new ArrayList<>();
        ArrayList<String> tigerNameList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\BE218\\testing\\animalNames.txt"))) {
            String line;
            String currentCategory = "";

            while ((line = br.readLine()) != null) {
                line = line.trim(); // Remove leading/trailing whitespace

                if (line.isEmpty()) {
                    continue; // Skip empty lines
                }

                // Check for category names
                if (line.endsWith("Names:")) {
                    currentCategory = line.replace(" Names:", "").trim(); // Set the current category
                } else {
                    // Add names to the appropriate list based on the current category
                    switch (currentCategory.toLowerCase()) {
                        case "hyena":
                            hyenaNameList.add(line);
                            break;
                        case "lion":
                            lionNameList.add(line);
                            break;
                        case "bear":
                            bearNameList.add(line);
                            break;
                        case "tiger":
                            tigerNameList.add(line);
                            break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle any IOException
        }

        // Print the lists to verify
        System.out.println("Hyena Names: " + hyenaNameList);
        System.out.println("Lion Names: " + lionNameList);
        System.out.println("Bear Names: " + bearNameList);
        System.out.println("Tiger Names: " + tigerNameList);
    }
}
