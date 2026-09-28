class Solution {

    public String encode(List<String> strs) {
        StringBuilder en=new StringBuilder();
       for(String word:strs){
        en.append(word);
        en.append('#');
       } 
       return en.toString();
    }

    public List<String> decode(String str) {
            List<String> ans=new ArrayList<>();
            int i=0;
            int j=i;
            while(j<str.length()){
                while(j<str.length() &&str.charAt(j)!='#'){
                    j++;
                }
                String s=str.substring(i,j);
                ans.add(s);
                j++;
                i=j;
            }
            return ans;
    }
}
