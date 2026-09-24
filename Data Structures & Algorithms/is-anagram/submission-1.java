class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq=new int[26];
        int[] freq2=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int idx=c-'a';
            freq[idx]++;
        }
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            int idx=c-'a';
            freq2[idx]++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=freq2[i]){
                return false;
            }
        }
        return true;
    }
}
