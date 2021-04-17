class Solution {
    List<String> ans = new ArrayList<String>();
    
    public String[] expand(String s) {
        expander(s);   
        String[] sarr = new String[ans.size()]; 
        return ans.toArray(sarr);
    }
    
    void expander(String s){
        if(s.indexOf('{') == -1){
            ans.add(s);
            return;
        }
        
        String left = s.substring(0, s.indexOf('{'));
        String right = s.substring(s.indexOf('}')+1);
        String tokenstr = s.substring(s.indexOf('{')+1, s.indexOf('}'));
        String[] tokens = tokenstr.split(",");
        for(int i=0;i<tokens.length;i++){
            expander(left+tokens[i]+right);
        }
    }
    
    
}
