package m19_meeting_rooms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution1 {
	
	public int minMeetingRooms(int[][] intervals) {
        // Sort the intervals by their start times
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        
        // Create a priority queue to keep track of the end times of the meetings
        PriorityQueue<Integer> endTimes = new PriorityQueue<>();
        
        // Add the first meeting's end time to the queue
        endTimes.offer(intervals[0][1]);
        
        // Iterate over the remaining meetings
        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];
            int earliestEndTime = endTimes.peek();
            if (interval[0] >= earliestEndTime) {
                // The current meeting can reuse a room whose previous meeting has already ended
                endTimes.poll();
            }
            // Add the current meeting's end time to the queue
            endTimes.offer(interval[1]);
        }
        
        // The size of the queue indicates the minimum number of conference rooms required
        return endTimes.size();
    }

	
}
