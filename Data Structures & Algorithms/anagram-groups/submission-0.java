class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      HashSet<String> words=new HashSet<>();
        for(int i=0;i<strs.length;i++){
            char temp[]=strs[i].toCharArray();
            Arrays.sort(temp);
            String t=new String(temp);
            if (!words.contains(new String(t))) {
                words.add(t);
            }
        }
        List<List<String>> groups=new ArrayList<>();
        List<String> smallgroups=null;
        for(String s:words){
            smallgroups=new ArrayList<>();
            for(String w:strs){
                char temp[]=w.toCharArray();
                Arrays.sort(temp);
                String t=new String(temp);
                if (s.equals(t)) {
                    smallgroups.add(w);
                }
            }
            groups.add(smallgroups);
        }
        return groups;  
    }
}
