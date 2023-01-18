package problem23_lcp;

public class App {

	public static void main(String[] args) {
		testSolution1();
		testSolution2();

	}
	
	public static void testSolution1() {
		Solution1 s = new Solution1();
		String case1 = s.getLCP(new String[] {"peace", "peaceful", "peach", "pear"});
		System.out.println(case1);
	}
	
	public static void testSolution2() {
		Solution2 s = new Solution2();
		String case1 = s.getLCP(new String[] {"peace", "peaceful", "peach", "pear"});
		System.out.println(case1);
	}

}
