package problem03_valid_parentheses;

import java.util.Map;
import java.util.Stack;

public class Solution1 {
	
    Map<Character,Character> map = Map.of(
			')','(',
			'}','{', 
			']','[' 
	);
    
    public boolean isValid(String s) {
    	if(s == null || s.isEmpty()) return false;
    	Stack<Character> stack = new Stack<>();
    	
    	for(int i = 0; i< s.length(); i++) {
    		if(map.containsValue(s.charAt(i))) {
    			stack.push(s.charAt(i));
    		}else {
    			if(stack.isEmpty()) return false;
    			Character br = stack.pop();
    			if(br != map.get(s.charAt(i))) return false;
    		}
    	}
    	if(!stack.isEmpty()) return false;
    	else return true;
    	
    }


}
