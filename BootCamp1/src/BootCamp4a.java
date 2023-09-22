//find the duplicates of words and their no of occurances
import java.util.HashMap;

public class BootCamp4a {

	public static void main(String[] args) {
		String inputString = "This is a sample string. This string contains duplicate words like sample and this.";

        HashMap<String, Integer> wordCountMap = new HashMap<>();
        String[] words = inputString.toLowerCase().split("\\s+");
        System.out.println(words);
        
        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }
        
        System.out.println(wordCountMap);
       

        System.out.println("Duplicate Words and their Occurrences:");
        for (String word : wordCountMap.keySet()) {
            if (wordCountMap.get(word) > 1) {
                System.out.println(word + ": " + wordCountMap.get(word));
            }
        }
        //System.out.println(wordCountMap.keySet());
	}

}
