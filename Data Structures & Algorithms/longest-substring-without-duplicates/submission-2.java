class Solution {
    public static int lengthOfLongestSubstring(String s) {
        
        int max=0;
        // String maxword="";
        String temp="";
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if (!temp.contains(Character.toString(c))) {
                temp+=c;
                if (temp.length()>max) {
                    max=temp.length();
                    // maxword=temp;
                }
            }
            
            else
            {
                // System.out.println("at i: "+i);
                int index=temp.indexOf(c);
                if (temp.length()>1) {
                    String t=temp.substring(index+1);
                    temp=t;
                    // System.out.println(temp);
                }
                else
                    temp="";

                i--;
                
            }
        }
        // System.out.println(maxword);
        return max;
    }
}
