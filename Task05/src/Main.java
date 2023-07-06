import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args){
        String allLines = "";
        try {
            File file = new File("D:\\Java_advanced(IBS)\\Task05\\src\\file.txt");
            Scanner text = new Scanner(file);

            while (text.hasNextLine()) {
                allLines += text.nextLine() + " ";
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        List<String> words = Arrays.asList(allLines.split(" "));

        Collections.sort(words);
        System.out.println(words);

        Map<String, Integer> countWords = new HashMap<>();
        for (String word: words) {
            if (countWords.containsKey(word)) {
                countWords.put(word, countWords.get(word) + 1);
            } else {
                countWords.put(word, 1);
            }
        }
        System.out.println(countWords);

        Integer max = Collections.max(countWords.values());
        for(Map.Entry<String,Integer> pair:countWords.entrySet()) {
            if(pair.getValue().equals(max))
                System.out.println(pair);
        }
    }
}
