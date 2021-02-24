package collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MostHighestFrequencyofCharacter {
	
	
	public static void main(String[] args) {
		String str = "acbaccdddd";
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		char[] ch = str.toCharArray();
		
		for(char c: ch) {
			if(charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c)+1);
			}
			else {
				charCountMap.put(c, 1);
			}
		}
		
		Set set = charCountMap.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Entry mapEntry = (Entry) iterator.next();
			System.out.print(mapEntry.getKey() + " ");
			System.out.println(mapEntry.getValue());
			
			
		}
		Map<Character, Integer> map = sortByValues(charCountMap);
		System.out.println("After sorting");
		Set set2 = map.entrySet();
		Iterator iterator2 = set2.iterator();
		while(iterator2.hasNext()) {
			Entry me2 = (Entry) iterator2.next();
			System.out.print(me2.getKey() + " ");
			System.out.println(me2.getValue());
			
		}
		
		
		
	}
	private static HashMap sortByValues(HashMap map) {
		List list = new LinkedList(map.entrySet());
		Collections.sort(list, new Comparator(){
			public int compare(Object o1, Object o2) {
				return((Comparable)((Entry)(o1)).getValue())
.compareTo(((Entry)(o2)).getValue());
			}
		});
		
		HashMap sortedHasMap = new LinkedHashMap();
		for(Iterator it = list.iterator(); it.hasNext();) {
			Entry entry = (Entry) it.next();
			sortedHasMap.put(entry.getKey(), entry.getValue());
			}
		return sortedHasMap;
	}
	
	
	
	

}
