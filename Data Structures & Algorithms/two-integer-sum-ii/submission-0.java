class Solution {
     public static int[] twoSum(int[] a, int target) {
        
        
        int first=0;
        int second=a.length-1;
        if (a.length==2||(a[first]+a[first+1]==target)) 
            return new int[] {1,2};
        
        // int end=a.length-1;
        for(int i=0;i<a.length;i++){

            if(a[first]+a[second]==target)
                return new int[]{first+1,second+1};

            else if(a[first]+a[second]<target)
                {first+=1;}

            else{
                second--;
            }
        }
        return new int[]{first+1,second+1};
    }
}
