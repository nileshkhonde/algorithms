class Solution {
    public boolean isValid(String s) {
        java.util.Stack st = new java.util.Stack();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '['){
                st.push(c);
            }
            
            if (c == ')' || c == '}' || c == ']'){
                if(!st.isEmpty()){
                    Character startchar = (Character) st.pop();
                    if (c == ')' && startchar != '('){
                        return false;
                    } else if( c == '}'  && startchar != '{'){
                        return false;
                    }else if(c == ']'  && startchar != '['){
                        return false;
                    }
                }else{
                    return false;
                }
            }
        }
        
        if(st.isEmpty()){
            return true;    
        }else{
            return false;
        }
        
        
    }
}
