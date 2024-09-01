package ArrayListPrograms;

import java.util.ArrayList;
import java.util.List;

public class countryWithoutUsingGeneric {

	public static void main(String[] args) {
		List word=new ArrayList();
		List country=new ArrayList<>();

		 country.add("INDIA");
         country.add("USA");
     List state=new ArrayList<>();
        state.add("TRIPURA");
        state.add("TEXAS");
List district=new ArrayList();
district.add("SOUTH TRIPURA");
district.add("HUSTON");
word.add(country);
word.add(state);
word.add(district);
System.out.println(word);
	}

}
