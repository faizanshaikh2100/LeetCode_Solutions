//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            String ans = obj.postToInfix(s);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static String postToInfix(String exp) {
       //making stack of strings
       
       Stack<String>st=new Stack<>();
       
       for(int i=0;i<exp.length();i++){
           char ch=exp.charAt(i);
           if(Character.isLetterOrDigit(ch)){
               st.push(ch+"");
           }
           else{
              String opr1=st.pop();
              String opr2=st.pop();
              st.push("("+opr2+ch+opr1+")");
           }
       }
       return st.pop();
    }
}
