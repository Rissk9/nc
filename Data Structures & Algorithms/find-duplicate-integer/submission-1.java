class Solution {
    public static int findDuplicate(int[] a) {
        //this is the most efficient method by using slow and fast pointer and linear TC

        int slow=0;
        int fast=0;
        do
        {
            slow=a[slow];
            fast=a[a[fast]];
        }while(slow!=fast);

        //after they meet cycle is confirmed and then traverse one by one to get the starting node

        slow=0;
        while (slow!=fast) {
            slow=a[slow];
            fast=a[fast];
        }
        return slow;
        
    }
}
