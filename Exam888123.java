package NewExam;

import java.util.HashMap;
import java.util.Iterator;

public class Exam888123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map1 = new HashMap<>();
		map1.put("Java Ram", 51);
		map1.put("Tara man", 54);
		map1.put("Jagat kumar", 35);
		map1.put("Krishna Prasad", 28);

		// Retrieve Key and value
		String key = "Tara man";
		Integer value = map1.get(key);

		System.out.println("Key " + key + " Value " + value);
		System.out.println("______---->>>>____");
		// Iterator using

		Iterator<String> word = map1.keySet().iterator();

		while (word.hasNext()) {
			String key2 = word.next();
			System.out.println("Key:" + key2 + " Value:" + map1.get(key2));
		}
		System.out.println("______---->>>>____");
		System.out.println(map1.size());

	}

}
