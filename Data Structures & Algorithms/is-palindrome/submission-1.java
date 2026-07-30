class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==1)
        return true;

        s=s.toLowerCase();
        String t="";
        for(char i:s.toCharArray()){
            if((i>='a' && i<= 'z')||(i>='0' && i<='9'))
            t=t+i;
            
            else
            continue;

        }
    
        for(int i=0;i<(t.length()/2);i++){
            if(t.charAt(i)!=t.charAt(t.length()-1-i))
                return false;
        }
        return true;
    }
}
