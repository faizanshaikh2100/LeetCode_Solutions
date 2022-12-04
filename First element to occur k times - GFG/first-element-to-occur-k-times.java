//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

public class GfG { 
	public static void main (String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int m = Integer.parseInt(inputLine[1]);
		    int[] arr = new int[n];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++)arr[i] = Integer.parseInt(inputLine[i]);
		    
		    Solution obj = new Solution();
		    System.out.println(obj.firstElementKTime(arr, n, m));
		}
	}
}

// } Driver Code Ends


class Solution
{
    public int firstElementKTime(int[] arr, int n, int k) { 
        //1.make hashmap to store all values
        HashMap<Integer,Integer>map=new HashMap<>();
        int ans=-1;
        for(int i=0;i<n;i++){
            //if key is persent update its count by 1 else set count to 1
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);  
            //at any point if occurance or value of any key becomes euqal to k
            if(map.get(arr[i])==k)
            {
                ans=arr[i];     //storing the key into the ans
                break;
            }
        }
        return ans;
    } 
}