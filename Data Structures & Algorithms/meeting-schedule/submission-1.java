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
        if(intervals.size() == 0)
            return true;
        Collections.sort(intervals, Comparator.comparingInt(interval -> interval.start));
        int a = intervals.get(0).end;
        for(int i=1; i<intervals.size(); i++) {
            
            if(a > intervals.get(i).start)
                return false;
            a = intervals.get(i).end;
        }
        return true;
    }
}
