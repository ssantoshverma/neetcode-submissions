class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int n=matrix.length;
       int m=matrix[0].length;
       int i=m-1;
       int j=0;
       while(i>0 &&j<m){
        if(matrix[j][i]==target){
            return true;
        }
        else if(matrix[j][i]<target){
            j++;
        }
        else if(matrix[j][i]>target){
            i--;
        }
       } 
       return false;
    }
}
