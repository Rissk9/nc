class Solution {
    public int maxProfit(int[] a) {
        int min=a[0];
        int max=-1;

        int maxi=0;int mini=0;

        int maxtotal=0;
        for(int i=0;i<a.length;i++){
            if(mini>maxi)
                max=-1;
            if(a[i]<min){
                min=a[i];
                mini=i;
            }
            else if(a[i]>max ){
                max=a[i];
                maxi=i;
            }
            if((max-min)>maxtotal && maxi>mini){
                maxtotal=max-min;
            }
        }
        // if(maxi<=mini)
        //     return 0;

        // else
        //     return max-min;
        return maxtotal;

    }
}
