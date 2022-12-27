//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    System.out.println(new Solution().evaluatePostFix(br.readLine().trim()));
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String s)
    {
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            //if my character is a digit
            if(Character.isDigit(ch)){
                st.push(ch-'0');
            }
            //if its a operator then pop 2 elemnts and do the evaalution using the operator
            else{
                int opr1=st.pop();
                int opr2=st.pop();
                if(ch=='+')st.push(opr2+opr1);
                else if(ch=='-')st.push(opr2-opr1);
                else if(ch=='/')st.push(opr2/opr1);
                else st.push(opr2*opr1);
            }
        }
        return st.pop();
    }
}