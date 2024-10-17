package angelo.zoo.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Utilities {
    public static AnimalNameLists createAnimalNameLists(String filePath) {
        AnimalNameLists animalNameLists = new AnimalNameLists();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            String currentCategory = "";

            while ((line = br.readLine()) != null) {
                line = line.trim();

                if (line.isEmpty()) {
                    continue; // Skip empty lines
                }

                if (line.endsWith("Names:")) {
                    currentCategory = line.replace(" Names:", "").trim();
                } else {
                    switch (currentCategory.toLowerCase()) {
                        case "hyena":
                            animalNameLists.getHyenaNameList().add(line);
                            break;
                        case "lion":
                            animalNameLists.getLionNameList().add(line);
                            break;
                        case "bear":
                            animalNameLists.getBearNameList().add(line);
                            break;
                        case "tiger":
                            animalNameLists.getTigerNameList().add(line);
                            break;
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        return animalNameLists;
    }
}
