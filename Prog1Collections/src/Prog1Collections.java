import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Prog1Collections {
	static HashMap<String, String> m1;

	public static void main(String[] args) {

		m1 = new HashMap<>();
		m1 = saveCountryCapitial("India", "Delhi");
		m1 = saveCountryCapitial("Japan", "Tokyo");
		System.out.println(m1);
		System.out.println(getCapitial("India"));
		System.out.println(getCountry("Tokyo"));
		System.out.println(getAllCountry(m1));

	}

	public static HashMap<String, String> saveCountryCapitial(String countryName, String countryCapital) {
		m1.put(countryName, countryCapital);
		return m1;
	}

	public static String getCapitial(String countryName) {
		return m1.get(countryName);
	}

	public static String getCountry(String countryCapital) {
		HashMap<String, String> res = iterateMap(m1);
		return res.get(countryCapital);
	}

	public static HashMap<String, String> iterateMap(HashMap<String, String> m1) {
		HashMap<String, String> m2 = new HashMap<>();
		for (Map.Entry<String, String> e : m1.entrySet()) {
			m2.put(e.getValue(), e.getKey());
		}
		return m2;
	}

	public static ArrayList<String> getAllCountry(HashMap<String, String> m1) {
		ArrayList<String> res = new ArrayList<>();
		for (Map.Entry<String, String> e : m1.entrySet()) {
			res.add(e.getKey());
		}
		return res;
	}

}
