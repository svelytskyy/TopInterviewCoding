package m19_meeting_rooms;

import java.util.Arrays;

public class Solution2 {
	
	public int minMeetingRooms(int[][] intervals) {
		int[] start = new int[intervals.length];
		int[] end = new int[intervals.length];
		for(int i = 0; i< intervals.length; i++) {
			start[i] = intervals[i][0];
			end[i] = intervals[i][1];
		}
		Arrays.sort(start);
		Arrays.sort(end);
		int usedRooms = 0;
		for(int idxStart = 0, idxEnd = 0; idxStart < intervals.length; idxStart++){
			if(start[idxStart] < end[idxEnd]) {
				usedRooms++;
			}else {
				idxEnd++;
			}
		}
		return usedRooms;
			
	}

}
