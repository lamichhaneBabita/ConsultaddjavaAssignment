package task07;

import java.util.*;

public class SortedHashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> hmap = new HashMap<>();
        hmap.put("A", 10);
        hmap.put("C", 20);
        hmap.put("E", 16);
        hmap.put("G", 27);
        hmap.put("B", 80);
        hmap.put("D", 25);
        System.out.println("Sorted By Key: ");
        Map<String, Integer> hm = sortedHashmapByKey(hmap);
        for (Map.Entry<String, Integer> m : hm.entrySet()) {
            System.out.println("Key = " + m.getKey() + " value = " + m.getValue());
        }
        System.out.println("==============================");
        System.out.println("Sorted By Value: ");
        Map<String, Integer> hm1 = sortedHashMapByValue(hmap);
        for (Map.Entry<String, Integer> m : hm1.entrySet()) {
            System.out.println("Key = " + m.getKey() + " value = " + m.getValue());
        }
    }

    public static HashMap<String, Integer> sortedHashMapByValue(HashMap<String, Integer> hmaps) {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(hmaps.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o1.getValue().compareTo(o2.getValue()));
            }
        });
        HashMap<String, Integer> hmapTemp = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> me : list) {
            hmapTemp.put(me.getKey(), me.getValue());
        }
        return hmapTemp;
    }

    public static HashMap<String, Integer> sortedHashmapByKey(HashMap<String, Integer> hmap) {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(hmap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        HashMap<String, Integer> hashMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> me : list) {
            hashMap.put(me.getKey(), me.getValue());
        }
        return hashMap;
    }
}
