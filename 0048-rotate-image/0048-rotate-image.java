class Solution {
    public void rotate(int[][] arr) {
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            for(int j=i;j<n-1-i;j++){
                int temp=arr[i][j];
                
                //bottom into top
                arr[i][j]=arr[n-1-j][i];
                
                //right to left
                arr[n-1-j][i]=arr[n-1-i][n-1-j];
                
                //top to bottom
                arr[n-1-i][n-1-j]= arr[j][n-1-i];
                
                //left to right
                arr[j][n-1-i]=temp;
            }
        }
    }
}