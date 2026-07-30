class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length()>s2.length()) {
            return false;
        }
        HashMap<Character,Integer> letters=new HashMap<>();
        HashMap<Character,Integer> winLetters=new HashMap<>();

        for(int i=0;i<s1.length();i++){
            // letters.putIfAbsent(s1.charAt(i), 0);
            // letters.put(s1.charAt(i), letters.get(s1.charAt(i))+1);
            letters.put(s1.charAt(i), letters.getOrDefault(s1.charAt(i), 0)+1);
        }

        int window=s1.length();

        for(int i=0;i<s2.length();i++){
            char add=s2.charAt(i);
            // winLetters.putIfAbsent(add, 0);
            // winLetters.put(add, winLetters.get(add)+1);
            winLetters.put(add, winLetters.getOrDefault(add, 0) + 1);


            if (i>=window) {
                char remove=s2.charAt(i-window);
                winLetters.put(remove, winLetters.get(remove)-1);
                if (winLetters.get(remove)==0) {
                    winLetters.remove(remove);
                }
            }
            if (letters.equals(winLetters)) {
                return true;
            }
        }
        return false;
    }
}
