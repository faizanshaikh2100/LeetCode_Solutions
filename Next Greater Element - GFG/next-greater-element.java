//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    long[] res = new Solution().nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
		}
	}
}




// } Driver Code Ends


class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        //1.making a stack to store indexes of array elements
       Stack<Integer>st=new Stack<>();
       //2.making an ans array to store nge
       long ans[]=new long[n];
       
       for(int i=0;i<n;i++){
           while(!st.isEmpty()&&arr[i]>arr[st.peek()]){
               ans[st.peek()]=arr[i];
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
}