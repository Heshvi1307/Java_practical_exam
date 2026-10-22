import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();
        String keyword = sc.nextLine();

        String[] words = sentence.trim().split(" +");

        StringBuilder sb = new StringBuilder();

        int shortest = words[0].length();
        String shortestWord = words[0].toLowerCase();
        int keywordCount = 0;
        int vowels = 0;

        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();

            if (i > 0) {
                sb.append(" ");
            }

            sb.append(word);

            if (word.length() < shortest) {
                shortest = word.length();
                shortestWord = word;
            }

            if (word.equalsIgnoreCase(keyword)) {
                keywordCount++;
            }
        }

        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));

        for (int i = 0; i < sentence.length(); i++) {
            char ch = Character.toLowerCase(sentence.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                vowels++;
            }
        }

        System.out.println("Sentence: " + sb);
        System.out.println("Words: " + words.length);
        System.out.println("Shortest word: " + shortestWord);
        System.out.println("Keyword count: " + keywordCount);
        System.out.println("Vowels: " + vowels);

        sc.close();
    }
}