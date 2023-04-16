package m19_meeting_rooms;

public class App {

	public static void main(String[] args) {
		
		int[][]intervals = new int[][] { 
										{2,7},
										{1,10},
										{3,19},  
										{8,12},  
										{10,20},  
										{11,30}
										};
		Solution1 s1 = new Solution1();
		
		Solution2 s2 = new Solution2();
		
		System.out.println(s1.minMeetingRooms(intervals));
		System.out.println(s2.minMeetingRooms(intervals));
	}

}
