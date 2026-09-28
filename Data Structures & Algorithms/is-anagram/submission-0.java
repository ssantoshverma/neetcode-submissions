class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int idx=c-'a';
            freq[idx]++;
        }
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            int idx=c-'a';
            if(freq[idx]==0){
                return false;
            }
            else{
                freq[idx]--;
            }
        }
        return true;
    }
}
