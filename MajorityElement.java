/*
O(n) solution
https://www.youtube.com/watch?v=7pnhv842keE&t=115s
*/
class Solution {
    public int majorityElement(int[] nums) {

        int halfN = nums.length / 2;
        int majority = 0;
        //map keeps track of k = num, v = count
        HashMap<Integer, Integer> map = new HashMap<>();
        
         //1) iterate through nums[]
        for(int i = 0; i < nums.length; i++){
            //2) for each num, check if its in the map
            if(map.containsKey(nums[i])){
                //3) if its in the map, increase its count and check if its the majority
                map.put(nums[i], map.get(nums[i]) + 1);
                if(map.get(nums[i]) > halfN){
                    majority = nums[i];
                }
            }
            //4) else put in the map with value of 1
            else{
                map.put(nums[i], 1);
            }
        }
        return majority;
    }
}
