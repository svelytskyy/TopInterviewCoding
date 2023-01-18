package problem21_pascal_triangle;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
	
	public List<List<Integer>> getPascalTriangle(int n){
		List<List<Integer>> ptriangle = new ArrayList<List<Integer>>();
		ptriangle.add(List.of(1));
		for(int i = 1; i < n; i++) {
			List<Integer> curRow = new ArrayList<>();
			List<Integer> prevRow = ptriangle.get(i-1);
			curRow.add(1);
			for(int j = 1; j < i; j++) {
				curRow.add(prevRow.get(j) + prevRow.get(j-1));
			}
			curRow.add(1);
			ptriangle.add(curRow);
		}
		return ptriangle;
	}

}
