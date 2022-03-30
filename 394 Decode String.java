class Solution {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        String cur = "";
        String ans = "";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ']'){
                // List<Character> decodedString = new ArrayList<>();
                StringBuilder str = new StringBuilder();
                while(stack.peek() != '['){
                    char cha =  stack.pop();
                    if(Character.isAlphabetic(cha)){
                       str.append(cha);
                    }
                }
                String sub = str.reverse().toString(); //this is the string contained in [] 
                // decodedString.add(sub);
                stack.pop();
                int k = 0;
                int base = 1;
                while(!stack.isEmpty() && Character.isDigit(stack.peek())){
                     k = k + (stack.pop() - '0') * base;
                    base *= 10;
                }
                 System.out.println(k);
                while(k > 0){
                    for(char c : sub.toCharArray())  
                        stack.push(c);
                    k--;
                }

              
            }else{
                stack.push(ch);
            }
        }
        StringBuilder retv = new StringBuilder();
        while(!stack.isEmpty())
            retv.insert(0, stack.pop());

        return retv.toString();
    }
}
