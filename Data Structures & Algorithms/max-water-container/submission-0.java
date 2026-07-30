class Solution {
    public static int maxArea(int[] heights) {
        
        int l=0;
        int r=heights.length-1;

        int max=Math.min(heights[l], heights[r])*(r-l);

        while (l<r) {
            if (Math.min(heights[l+1], heights[r])*(r-(l+1)) >max) {
                max=Math.min(heights[l+1], heights[r])*(r-(l+1));
                l++;
            }
            else if(Math.min(heights[l], heights[r-1])*((r-1)-l) >max){
                max=Math.min(heights[l], heights[r-1])*((r-1)-l);
                r--;
            }
            else if(heights[r]>heights[l]){
                l++;
            }
            else
                r--;

            // System.out.println(max);
        }
        return max;
    }
}
