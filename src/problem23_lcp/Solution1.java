package problem23_lcp;

public class Solution1 {
	
	public String getLCP(String[] sArr) {
		String lcp = sArr[0];
		for(int i = 1; i< sArr.length; i++) {
			lcp = commonPrefix(lcp, sArr[i]);
		}
		return lcp;
	}
	
	private String commonPrefix(String s1, String s2) {
		int min = Math.min(s1.length(), s2.length());
		for(int i =0; i< min; i++) {
			if(s1.charAt(i) != s2.charAt(i)) return s1.substring(0, i);
		}
		return s1.substring(0, min);
	}

}
