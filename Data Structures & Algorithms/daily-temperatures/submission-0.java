class Solution {
    public static int[] dailyTemperatures(int[] temperatures) {
        
        // Stack<Integer> temp=new Stack<>();
        int dayptr=0;
        int moving=dayptr+1;

        int []result=new int[temperatures.length];
        while (dayptr<temperatures.length) {
            
            if(moving==temperatures.length){
                result[dayptr]=0;
                dayptr++;
                moving=dayptr+1;
                continue;
            }

            if (temperatures[moving]<=temperatures[dayptr]) {
                // temp.push(temperatures[moving]);
                moving++;
            }
            
            else{
                result[dayptr]=(moving-dayptr);
                // temp.clear();
                dayptr++;
                moving=dayptr+1;
                // if(dayptr<temperatures.length)
                //     temp.push(temperatures[dayptr]);
            }
        }
        return result;
    }
}
