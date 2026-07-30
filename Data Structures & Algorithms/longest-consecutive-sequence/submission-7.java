// import java.util.Arrays;
class Solution {
    public static int longestConsecutive(int[] a) {
        if (a.length==0) {
            return 0;
        }
        HashSet<Integer> allnum=new HashSet<>();
        for(int i:a)allnum.add(i);
        int count=0;
        int max=0;

        for(int n:allnum){
            count=1;
            if(!allnum.contains(n-1)){
                while (allnum.contains(n+1)) {
                    count++;
                    // System.out.println(count);
                    n=n+1;
                }
                if(count>max)
                    max=count;
            }
        }
        return max;
    }
}
