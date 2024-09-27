import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a phrase to count: ");
        String quote = input.nextLine();
        quote = quote.replaceAll("[^a-zA-Z0-9]", "");

        HashMap<Character, Integer> characterCount = new HashMap<>();

        for(char character: quote.toLowerCase().toCharArray()) {
            if(!characterCount.containsKey(character)) {
                characterCount.put(character, 1);
            } else {
                characterCount.put(character, characterCount.get(character) + 1);
            }
        }
        for (Map.Entry<Character, Integer> character: characterCount.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }

    }
}
