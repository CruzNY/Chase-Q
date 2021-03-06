import java.util.*;
public class Valid_Parentheses{
    public static boolean isValid(String s){
	HashMap<Character, Character> map = new HashMap<>();
	Stack<Character> stack = new Stack<>();
	map.put('(', ')');
	map.put('[', ']');
	map.put('{', '}');
	for (int i = 0; i < s.length(); i++) {
	    char curr = s.charAt(i);

	    if (map.keySet().contains(curr)) {
		stack.push(curr);
	    } else if (map.values().contains(curr)) {
		if (!stack.empty() && map.get(stack.peek()) == curr) {
		    stack.pop();
		} else {
		    return false;
		    
		}
		
	    }
	    
	}

	return stack.empty();
    }
    public static void main(String[] args){
	String s = "{[}";
	System.out.println(isValid(s));
    }
}
