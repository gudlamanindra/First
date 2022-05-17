package StepDefinition;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Set;

public class HashMaps {

	public static void main(String[] args) {
	m1();
		m2();
		StringDuplicatesCharactersString1();
		m3();
	}

	public static void m1() {
		String str[] = { "Raju", "Ramana", "Ramana", "Hareesh", "Pradeep", "sai", "sai", "Krishna" };
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String s : str) {

			if (map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
			} else {
				map.put(s, 1);
			}
			System.out.println(s + ">>>" + map.get(s));
		}
		System.out.println();
		for (Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + "---" + e.getValue());
		}
	}

	public static void m2() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(23, "Nani");
		map.put(25, "Sai");
		map.put(54, "Kishore");
		map.put(89, "Ganesh");
		Iterator<Integer> it = map.keySet().iterator();
		System.out.println("Before Sorting");
		while (it.hasNext()) {
			int key = (int) it.next();
			System.out.println("Roll no: " + key + " name: " + map.get(key));
		}
		System.out.println("\n");
		System.out.println("After Sorting");
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(map);
		Iterator<Integer> itr = tm.keySet().iterator();
		while (itr.hasNext()) {
			int key = (int) itr.next();
			System.out.println("Roll no: " + key + " name: " + map.get(key));
		}
	}

	public static void m3() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(5, "A");
		map.put(11, "C");
		map.put(6, "k");
		map.put(8, "R");
		map.put(9, "W");
		map.put(4, "Q");
		System.out.println("Before sorting:");
		Set set = map.entrySet();
        Iterator iterator=set.iterator();
        while(iterator.hasNext()) {
        	Map.Entry me=(Map.Entry)iterator.next();
        	System.out.println(me.getKey()+": ");
        	System.out.println(me.getValue());
        }
        Map<Integer,String> m = new TreeMap<Integer, String>(map);
        System.out.println("After sorting");
        Set set2 = map.entrySet();
        Iterator iterator2=set2.iterator();
        while(iterator2.hasNext()) {
        	Map.Entry<Integer,String> me2=(Map.Entry) iterator2.next();
        	System.out.println(me2.getKey()+": ");
        	System.out.println(me2.getValue());
        }
	}

	public static void StringDuplicatesCharactersString1() {
		String str = "Hello";
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		for (Character ch : set) {
			System.out.print(ch);
		}
	}
}