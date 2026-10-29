/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        intervals.sort((a,b) -> Integer.compare(a.start,b.start));
        Interval temp = null;
        for(Interval interval:intervals){
            int start = interval.start;
            if(temp == null){
                temp = interval;
                continue;
            }
            if(temp.end > start){
                return false;
            }
            temp = interval;
        }
        return true;
    }
}
