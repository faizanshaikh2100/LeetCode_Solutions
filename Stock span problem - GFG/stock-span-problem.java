//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int a[] = new int[n];
            
            int i = 0;
            for(i = 0; i < n; i++)
              a[i] = sc.nextInt();
              
            int[] s = new Solution().calculateSpan(a, n);
            
            for(i = 0; i < n; i++)
            {
                System.out.print(s[i] + " ");
            }
            
            System.out.println();
        }
    }
    
    
    
}
// } Driver Code Ends



class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    //1.find all indexs of previous greater elements
    static int[] prevGreater(int arr[],int n){
        //making a stack to store indexs
        Stack<Integer>st=new Stack<>();
        //ans array for PGE indexes
        int ans[]=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&&arr[i]>arr[st.peek()]){
                ans[st.peek()]=i;
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.peek()]=-1;
            st.pop();
        }
        
        return ans;
        
        
    }
    public static int[] calculateSpan(int arr[], int n)
    {
      int temp[]=prevGreater(arr,n);
      int ans[]=new int[n];
      for(int i=0;i<n;i++){
          int breakpoint=temp[i];
          ans[i]=i-breakpoint;
      }
      return ans;
    }
    
}