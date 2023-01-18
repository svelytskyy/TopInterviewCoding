package problem23_lcp;

//binary search
public class Solution2 {
	
    public String getLCP(String[] strs) {
        return lcp(strs, 0,strs.length-1);
    }

   private String lcp(String[] sArr, int left, int right) {
        if (left == right) {
            return (sArr[left]);
        }
 
        if (right > left) {
            int mid = left + (right - left) / 2;
            String str1 = lcp(sArr, left, mid);
            String str2 = lcp(sArr, mid + 1, right);
            return (commonPrefix(str1, str2));
        }
        return null;
    }

 	private String commonPrefix(String s1, String s2) {
		int min = Math.min(s1.length(), s2.length());
		for(int i =0; i< min; i++) {
			if(s1.charAt(i) != s2.charAt(i)) return s1.substring(0, i);
		}
		return s1.substring(0, min);
	}

}
