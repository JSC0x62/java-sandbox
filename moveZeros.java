class Solution {
    public void moveZeroes(int[] nums) {
        
        //https://leetcode.com/problems/move-zeroes/
        //0) use a l pointer = 0 and a right pointer = 1
        int l = 0;

        //1) iterate through the array using r
        for(int r = 0; r < nums.length; r++){
            //2) if r > 0 then swap with left. Increment left
            //tmp variable is used because we need to swap l and r with each other
            if (nums[r] != 0){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                //l is only incremented when r is not 0, and r always incremented by 1
                //this ensures that if there are no 0's they just swap with
                l++;
            }
        }
    }
}
