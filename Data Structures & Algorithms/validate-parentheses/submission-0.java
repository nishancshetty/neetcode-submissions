class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if ( c == '(' || c == '[' || c =='{'){
                st.push(c);
            }
            else{
                if(st.isEmpty()){
            return false;
            }
            char c1=st.peek();
            if(c == ')' && c1 == '('){
                st.pop();
            }
            else if(c == ']' && c1 == '['){
                st.pop();
            }
            else if(c == '}' && c1 == '{'){
                st.pop();
            }else return false;

            }
        }
        return st.isEmpty();
        
    
        
    }
}
