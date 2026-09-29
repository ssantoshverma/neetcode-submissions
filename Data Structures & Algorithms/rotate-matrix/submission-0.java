class Solution {
    public void reverse(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int[][] matrix) {
       int m=matrix.length;
       int n=matrix[0].length;
       for(int i=0;i<m;i++){
        for(int j=0;j<=i;j++){
            int temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
        }
       } 
        for(int[] arr:matrix){
            reverse(arr);
        }
      
    }
}
