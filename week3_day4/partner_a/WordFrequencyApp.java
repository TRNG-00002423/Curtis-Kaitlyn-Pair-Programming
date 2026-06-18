package week3_day4.partner_a;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * Partner A — word counts + sorted unique words.
 * See ../../README.md
 */
public class WordFrequencyApp {

    static final String SAMPLE = """
            Java collections maps sets queues lambdas
            Java maps and sets and more Java
            """;
    static final int N = 3;

    public static void main(String[] args) {
        Map<String, Integer> counts = new HashMap<>();
        // : tokenize SAMPLE, populate counts (lower-case tokens)
        for (String token : SAMPLE.split("[ \n\t]")) {
            token = token.toLowerCase();
            token = token.replaceAll("[^a-zA-Z ]", "");
            if (token.isEmpty()) {
                continue;
            }

            if (counts.containsKey(token)) {
                counts.put(token, counts.get(token) + 1);
            } else {
                counts.put(token, 1);

            }
        }

        TreeSet<String> vocabulary = new TreeSet<String>(counts.keySet());
        System.out.println("Vocabulary");
        System.out.println(vocabulary.toString());

        System.out.println("\nCounts");
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }

        List<Map.Entry<String, Integer>> sortedList = counts.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).collect(Collectors.toList());
        System.out.println("\nTop N words (N=" + N + ")");
        for (int i = 0; i < N; i++) {
            System.out.println(sortedList.get(i));
        }

        System.out.println("\nDictionary ends");
        System.out.println("First dictionary entry: " + vocabulary.pollFirst());
        System.out.println("Last dictionary entry: " + vocabulary.pollLast());
    }
}