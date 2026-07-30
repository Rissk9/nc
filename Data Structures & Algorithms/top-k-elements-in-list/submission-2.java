class Solution {
    public static int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> freq=new HashMap<>();
        
        int max=1;
        //there is no way u can have max occurence of an element as 0
        for(int i=0;i<nums.length;i++){
            if(freq.containsKey(nums[i])){
                freq.put(nums[i],freq.get(nums[i])+1);
                if(freq.get(nums[i])+1>max)
                    max=freq.get(nums[i]);
            }
            else
                freq.put(nums[i], 1);
        }
        
        int count=0;
        if (nums.length==1) {
            return new int[] {nums[0]};
        }
        int nos[]=new int[k];
        // for(int i=max;i>=0;i--){
        //     if(count>k-1)
        //         break;

        //     // System.out.println("hello");
        //     if (freq.containsValue(i)) {
        //         for(int j:freq.keySet()){
        //             if(freq.get(j)==i)
        //             {
        //                 nos[count]=j;
        //                 count++;
        //             }
        //         }
        //     }
        // }

        // System.out.println("this is the max:"+max);
        while (count+1<=k) {
            if (freq.containsValue(max)) {
                for(int i:freq.keySet()){
                    if (freq.get(i)==max) {
                        nos[count]=i;
                        count++;
                        freq.put(i, -1);
                    }
                }
            }
            // System.out.println("hello");
            // System.out.println("count is"+count);
            // System.out.println("this is the max:"+max);
            
            for(int h:freq.keySet())
                // System.out.println(h+"---> "+freq.get(h));
            if(!freq.containsValue(max)) max--;
            // else continue;
            // System.out.println(freq.containsValue(max));
            // else max--;
        }
        return nos;
    }
}
