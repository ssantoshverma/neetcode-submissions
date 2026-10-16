class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int rows=matrix.length;
       int col=matrix[0].length;
       int i=0;
       int j=col-1;
       while(i<rows && j>=0){
            if(matrix[i][j]>target){
                j--;
            }
            else if(matrix[i][j]<target){
                i++;
            }
            else{
                return true;
            }
       } 
       return false;
    }
}
