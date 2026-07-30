class Solution {
    public int lengthOfLastWord(String s) {
        
        
        int count=0;
        int l=s.length()-1;
        char c=s.charAt(l);
        while(c==' '){
            l--;    
            c=s.charAt(l);
        }
        for(int i=l;i>=0;i--){
            if(s.charAt(i)==' ')
            break;

            count++;
        }
        return count;
    }
}