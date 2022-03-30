class Solution {
    public String decodeString(String s) {
        // s = "3[af]2[bc]"
        //
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ']'){
                StringBuilder str = new StringBuilder();
                while(stack.peek() != '['){
                    char cha =  stack.pop();
                    if(Character.isAlphabetic(cha)){
                       str.append(cha);
                    }
                }
                //str fa    cb
                String sub = str.reverse().toString(); //this is the string contained in [] 
                // sub af   bc
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
                //stack: (left is bottom) afafaf   bcbc
              
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
