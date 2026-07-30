class Solution {
    public static boolean isAnagram(String s, String t) {
         if (s.length()==0 || t.length()==0 || (s.length()!=t.length())) {
            return false;
        }
        HashMap<Character,Integer> letter=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if (letter.containsKey(c)) {
                int count=letter.get(c);
                // if (c=='l') {
                //     System.out.println(count+" and "+i);
                // }
                letter.put(c, count+1);
            }
            else
            letter.put(c, 1);
        }
        // for(char c:letter.keySet()){
        //     System.out.println(c+"-> "+letter.get(c));
        // }
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if (letter.containsKey(c) && letter.get(c)!=0) {
                letter.put(c, letter.get(c)-1);
            }
            else
                return false;
        }
        return true;
    }
}
