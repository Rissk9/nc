class Solution {
    public boolean checkInclusion(String s1, String s2) {
         if (s1.length() > s2.length()) return false;

        HashMap<Character, Integer> count1 = new HashMap<>();
        HashMap<Character, Integer> count2 = new HashMap<>();

        // Step 1: Build frequency map for s1
        for (char c : s1.toCharArray()) {
            count1.put(c, count1.getOrDefault(c, 0) + 1);
        }

        int window = s1.length();

        // Step 2: Sliding window over s2
        for (int i = 0; i < s2.length(); i++) {

            // Add new character
            char right = s2.charAt(i);
            count2.put(right, count2.getOrDefault(right, 0) + 1);

            // Remove old character when window exceeds size
            if (i >= window) {
                char left = s2.charAt(i - window);
                count2.put(left, count2.get(left) - 1);

                if (count2.get(left) == 0)
                    count2.remove(left);
            }

            // Step 3: Compare maps
            if (count1.equals(count2))
                return true;
        }

        return false;
    }
}
