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
    public int minMeetingRooms(List<Interval> intervals) {
        intervals.sort((a, b) -> Integer.compare(a.start, b.start));
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int room = 0;
        for(Interval interval:intervals){
            int start = interval.start;
            int end = interval.end;

            while(!heap.isEmpty() && heap.peek() <= start){
                heap.poll();
            }
            heap.offer(end);
            room = Math.max(room,heap.size());
        }
        return room;
    }
}
