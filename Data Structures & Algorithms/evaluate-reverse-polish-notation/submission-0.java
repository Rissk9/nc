public class Solution {
    String stack[];
    int top=-1;
    public int evalRPN(String[] tokens) {
        stack=new String[tokens.length];
    for(int i=0;i<tokens.length;i++){
        // System.out.println(tokens[i]);
        if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")){
            int op2=Integer.parseInt(pop());
            int op1=Integer.parseInt(pop());
            System.out.println(op1+" "+op2);
            int res=0;
            if(tokens[i].equals("+"))
                res=op1+op2;
            else if(tokens[i].equals("-"))
                res=op1-op2;
            else if(tokens[i].equals("*"))
                res=op1*op2;
            else if(tokens[i].equals("/"))
                res=op1/op2;
            push(Integer.toString(res));
            // System.out.println(stack[0]);
            }        
            else
            push(tokens[i]);
    }
    return Integer.parseInt(stack[top]);
    }
    public void push(String n){
        stack[++top]=n;
    }
    public String pop(){
        // top--;
        return stack[top--];
    }
}