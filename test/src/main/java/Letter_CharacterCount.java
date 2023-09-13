
import java.util.*;

public class Letter_CharacterCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your content:");
        String content = scanner.nextLine();
        scanner.close();

        StringTokenizer tokenizer = new StringTokenizer(content);

        Map<String, Integer> wordMap = new HashMap<>();

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        System.out.println(wordMap);

        Map<Character, Integer> letterMap = new HashMap<>();

        for (char c : content.toCharArray()) {

            if (Character.isLetter(c)) {
                letterMap.put(c, letterMap.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println(letterMap);
    }
}
