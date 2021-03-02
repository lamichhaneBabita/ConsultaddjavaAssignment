package task07;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class CountOccurrencesOfChars {
    public static void main(String[] args) {
        String str = "Babita";
        countOccurrencesOfEachChars(str);

    }
    public static void countOccurrencesOfEachChars(String str){
        Map<Character, Integer>maps = new HashMap<>();
        str = str.toLowerCase();
        char[]ch = str.toCharArray();


        for(int i=0; i<ch.length; i++){
            if(maps.containsKey(ch[i])){
                maps.put(ch[i], maps.get(ch[i])+1);
            }
            else {
                maps.put(ch[i],1);
            }
        }
        for(Map.Entry entry: maps.entrySet()){
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }
    }

}
