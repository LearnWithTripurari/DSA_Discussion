class Solution {
    
    public int numIdenticalPairs(int[] nums) {
        
        int pair = 0;
        int i = 0;
        int j = i + 1;
        
        while(i < nums.length - 1) {
            
            if(nums[i] == nums[j]) {
                pair++;
            }
            
            if(j == nums.length - 1) {
                i++;
                j = i + 1;
            }
            else {
                j++;
            }
             
        }
        
        return pair;
    }
}