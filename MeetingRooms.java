//O(nlogn) solution
//https://leetcode.com/problems/meeting-rooms/
import java.util.Arrays;
class Solution {
    public boolean canAttendMeetings(int[][] intervals) {

        //1) Sort the array by start interval lowest to highest
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        //2) iterate through the array starting a 1 so it can be compared to previous
        for(int i = 1; i < intervals.length; i++){
            //3) if the start time is lower (sooner) than the previous end time, it is not possible
            if(intervals[i][0] < intervals[i - 1][1]){
                return false;
            }
        }
        return true;
    }
}
