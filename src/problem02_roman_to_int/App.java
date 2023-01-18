package problem02_roman_to_int;

public class App {

	public static void main(String[] args) {
		
		Solution1 s1 = new Solution1();
		int case1 = s1.romanToInt("III"); // 3
		int case2 = s1.romanToInt("LVIII"); // 58
		int case3 = s1.romanToInt("MCMXCIV"); // 1994
		int case4 = s1.romanToInt("IX"); // 9
		System.out.println("case 1 : " + case1 + "\n" +
							"case 2 : " + case2 + "\n" + 
							"case 3 : " + case3 + "\n" +
							"case 4 : " + case4 + "\n");
	}

}
