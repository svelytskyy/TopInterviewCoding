package problem06_valid_palindrome;

//O(2n) = O(n), O(n)
class Solution2 {
	  public boolean isPalindrome(String s) {
	    StringBuilder builder = new StringBuilder();

	    for (char ch : s.toCharArray()) {
	      if (Character.isLetterOrDigit(ch)) {
	        builder.append(Character.toLowerCase(ch));
	      }
	    }

	    String filteredString = builder.toString();
	    String reversedString = builder.reverse().toString();

	    return filteredString.equals(reversedString);
	  }

	  /** using Java 8 Streams */
	  public boolean isPalindromeUsingStreams(String s) {
	    StringBuilder builder = new StringBuilder();

	    s.chars()
	        .filter(c -> Character.isLetterOrDigit(c))
	        .mapToObj(c -> Character.toLowerCase((char) c))
	        .forEach(builder::append);
	    return builder.toString().equals(builder.reverse().toString());
	  }

}