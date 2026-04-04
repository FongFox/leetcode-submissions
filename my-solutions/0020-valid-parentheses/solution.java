class Solution {
    public boolean isValid(String s) {
        if(s.length() == 0) {
            return false;
        }

        char[] charArr = s.toCharArray();
        
        char firstChar = charArr[0];
        if(firstChar == ')' || firstChar == ']' || firstChar == '}'){
            return false;
        }

        Stack<Character> stackChar = new Stack<>();
        for(char c : charArr) {
            if(c == '(' || c == '[' || c == '{') {
                stackChar.push(c);
            } else {
                switch(c) {
                    case ')':
                        if(stackChar.empty() || stackChar.peek() != '(') {
                            return false;
                        }
                        stackChar.pop();
                        break;
                    case ']':
                        if(stackChar.empty() || stackChar.peek() != '[') {
                            return false;
                        }
                        stackChar.pop();
                        break;
                    case '}':
                        if(stackChar.empty() || stackChar.peek() != '{') {
                            return false;
                        }
                        stackChar.pop();
                        break;
                    default:
                        break;
                }
            }
        }

        if(!stackChar.empty()) {
            return false;
        }

        return true;
    }
}
