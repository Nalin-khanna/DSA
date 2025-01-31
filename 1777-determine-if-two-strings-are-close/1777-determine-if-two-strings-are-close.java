import java.util.*;

class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) return false; // Words must be of equal length

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        // Count frequencies for word1
        for (char x : word1.toCharArray()) {
            map1.put(x, map1.getOrDefault(x, 0) + 1);
        }

        // Count frequencies for word2
        for (char y : word2.toCharArray()) {
            map2.put(y, map2.getOrDefault(y, 0) + 1);
        }

        // Both words must have the same unique characters
        if (!map1.keySet().equals(map2.keySet())) return false;

        // Extract and compare frequency counts (sorted)
        List<Integer> freq1 = new ArrayList<>(map1.values());
        List<Integer> freq2 = new ArrayList<>(map2.values());

        Collections.sort(freq1);
        Collections.sort(freq2);

        return freq1.equals(freq2);
    }
}
