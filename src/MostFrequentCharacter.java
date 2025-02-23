import java.util.HashMap;
import java.util.Map;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        String str = "aabbcab";
        findMostFrequentChar(str);
    }

    public static void findMostFrequentChar(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Count occurrences of each character
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the most frequent character
        char mostFrequentChar = '\0';
        int maxCount = 0;
        String str1="";
        /*for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }*/


        for(Map.Entry<Character, Integer> entry: charCountMap.entrySet()){
            if(entry.getValue() == maxCount){
                mostFrequentChar = entry.getKey();
                maxCount = entry.getValue();

                if(str1.isEmpty()){
                    str1 = ""+mostFrequentChar;
                } else {
                    str1 += ","+mostFrequentChar;
                }

            } else if(entry.getValue() > maxCount) {
                mostFrequentChar = entry.getKey();
                maxCount = entry.getValue();
                str1 = ""+mostFrequentChar;
            }
        }

        //System.out.println("Most Repetitive Character: " + mostFrequentChar);
        System.out.println("Most Repetitive Character: " + str1);
        System.out.println("Count: " + maxCount);
    }
}
