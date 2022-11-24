class Solution {
    public void setZeroes(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
         int arr2[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    arr2[i][j]=-1;
                }
            }
        }
      for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr2[i][j]==-1){
                    for(int k=0;k<n;k++)
                        arr[k][j]=0;
                  for(int k=0;k<m;k++)
                        arr[i][k]=0;
                        
                }
            }
        }
    }
}