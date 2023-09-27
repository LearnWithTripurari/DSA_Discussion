class Solution {
    public int missingNumber(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            map.put(nums[i], nums[i]);
        }

        int res = 0;

        for(int i = 1; i<=n ; i++) {
            
            if(!map.containsKey(i) && map.containsKey(0)) {
                res = i;
                break;
            }
        }

        return res;
        
    }
}