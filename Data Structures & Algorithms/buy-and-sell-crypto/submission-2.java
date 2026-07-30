class Solution {
    public int maxProfit(int[] a) {
        int max=0;
        int l=0;
        int r=1;
        while(r<a.length){
            if(a[r]-a[l]>max)
                max=a[r]-a[l];
            if(a[r]<a[l])
                l=r;
            r=r+1;
        }
        return max;

    }
}
