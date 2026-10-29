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
        PriorityQueue<Integer> pq =
    new PriorityQueue<>(Collections.reverseOrder());
        for(Interval interval:intervals){
            int start = interval.start;
            int end = interval.end;
            if(!pq.isEmpty() && pq.peek() > start){
                return false;
            }
            pq.offer(end);
        }
        return true;
    }
}
