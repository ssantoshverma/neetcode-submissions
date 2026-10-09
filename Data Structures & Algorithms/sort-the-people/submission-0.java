class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
       for(int i=0;i<heights.length;i++){
        int minIdx=i;
        for(int j=i+1;j<heights.length;j++){
            if(heights[j]<heights[minIdx]){
                minIdx=j;
            }
        }
        // swap
        int temp=heights[i];
        String temp1=names[i];
        heights[i]=heights[minIdx];
        names[i]=names[minIdx];
        heights[minIdx]=temp;
        names[minIdx]=temp1;
       } 
       int i=0;
       int j=names.length-1;
       while(i<j){
        String temp=names[i];
        names[i]=names[j];
        names[j]=temp;
        i++;
        j--;
       }
       return names;
    }
}