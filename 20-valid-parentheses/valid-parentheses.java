class Solution {
    public boolean isValid(String s) {
        if (s.length()%2==1){
            return false;
        }
        Stack<Character> st = new Stack<>();   
            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                if(c=='(' || c=='{'|| c=='['){
                    st.push(c);
                }
                else{
                    if(st.isEmpty()){
                        return false;
                    }
                    char sh = st.pop();
                    if(c == '}' && sh!='{' || c == ']' && sh!='[' || c == ')' && sh!='('){
                        return false;
                    }
                }
                
            }
            return st.isEmpty();
        
    }
}