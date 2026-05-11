class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] r = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int p = 1;
            for (int j = 0; j < nums.length; j++) {
                boolean flag = false;
                if (j == i) {
                    flag = true;
                }
                if (!flag) {
                    p *= nums[j];
                }
            }
            r[i] = p;
        }
        
        return r;
    }
}  
