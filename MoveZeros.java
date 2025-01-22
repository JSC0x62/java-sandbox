//O(n) solution
//https://leetcode.com/problems/move-zeroes/
class Solution {
    public void moveZeroes(int[] nums) {

        //1) use 2 pointers, l (to be incremented when there's not a 0) and r (iterates over array)
        int l = 0;

        for(int r = 0; r < nums.length; r++){
            //2) if we hit a non-zero value, swap l and r
            if(nums[r] != 0){
            
            int tmpL = nums[l];
            nums[l] = nums[r];
            nums[r] = tmpL;
            //l is only incremented when a non-zero is hit
            //this ensures that if there are no 0's then the order will not change
            l++;
            }
        }
        
    }
}
