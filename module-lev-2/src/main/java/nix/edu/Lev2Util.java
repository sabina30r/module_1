package nix.edu;

import java.util.HashMap;
import java.util.Stack;

public class Lev2Util {
    public void checkStringWithBrackets(String inputString) {

        HashMap<String, Integer> openBrackets = new HashMap<String, Integer>() {{
            put("(", 0);
            put("{", 1);
            put("[", 2);
        }};
        HashMap<String, Integer> closeBrackets = new HashMap<String, Integer>() {{
            put(")", 0);
            put("}", 1);
            put("]", 2);
        }};
        Stack<String> stack = new Stack<>();

        String result = "YES";

        for (int i = 0; i < inputString.length(); i++) {
            Character character = inputString.charAt(i);
            String symbol = character.toString();
            if (openBrackets.containsKey(symbol)) {
                stack.push(symbol);
            } else if (closeBrackets.containsKey(symbol)) {
                if (stack.empty() || !openBrackets.get(stack.pop()).equals(closeBrackets.get(symbol))) {
                    result = "NO";
                }
            }
        }
        System.out.println(result);
    }


}
