class Solution {
    char[] stack;
    int top=-1;
    public boolean isValid(String s) {
        stack=new char[s.length()];
        char c=s.charAt(0);
        if(c=='}'||c==']'||c==')')
            return false;
        
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            if(c==']'||c=='}'||c==')')
            {
                if(checkComp(pop())!=c)
                    return false;
            }
            else
            push(c);
        }
        if(top==-1)
        return true;
        else 
        return false;
    }
    public void push(char c){
        stack[++top]=c;
    }
    public char pop(){
        if(top==-1)
        return ' ';
        return stack[top--];
    }
    public char checkComp(char c){
        if(c=='{')
        return '}';

        else if(c=='[')
        return ']';

        else if(c=='(')
        return ')';
        
        else
        return '?';

    }
}
