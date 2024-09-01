package ArrayListPrograms;

import java.util.ArrayList;
import java.util.List;

public class countryUsingGeneric{

    public static void main(String[] args) {
        // Define the lists with generics
        List<List<List<String>>> word = new ArrayList<>();
        List<List<String>> country = new ArrayList<>();
        List<String> state1 = new ArrayList<>();
        List<String> state2 = new ArrayList<>();

        // Add districts to states
        state1.add("SOUTH TRIPURA");
        state1.add("NORTH TRIPURA");
        state2.add("HUSTON");
        state2.add("DALLAS");

        // Add states to countries
        List<String> india = new ArrayList<>();
        india.add("TRIPURA");
        india.add("DELHI");

        List<String> usa = new ArrayList<>();
        usa.add("TEXAS");
        usa.add("CALIFORNIA");

        country.add(india);
        country.add(usa);

        // Add country to word
        word.add(country);

        // Print the word list
        System.out.println(word);
    }
}
