class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
       List<Boolean> res = new ArrayList<>();
       for(String q: queries){
           res.add(match(q, pattern));
       }
       return res;
       
    }
    
    private boolean match(String query, String pattern){
        char[] q = query.toCharArray();
        char[] p = pattern.toCharArray();
        int j = 0;
        
        for(int i = 0; i < q.length; i++){
            if(j < p.length &&  q[i] == p[j]){
                j++;
            }else if(q[i] < 'a' || q[i] > 'z'){
                return false;
            }
        }
     
        
        return j ==pattern.length();
    }
}
