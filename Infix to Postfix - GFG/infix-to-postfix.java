//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(
                new Solution().infixToPostfix(br.readLine().trim()));
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to convert an infix expression to a postfix expression.
    private static int pres(char ch){
       if(ch == '*' ||  ch == '/') return 2;
        else if(ch == '^') return 3;
        else if(ch == '+'||  ch == '-') return 1;
        else return -1;
    }
    public static String infixToPostfix(String exp) {
       
       //making a stack
       Stack <Character>st=new Stack<>();
       StringBuilder sb=new StringBuilder();
       for(int i=0;i<exp.length();i++){
           char ch=exp.charAt(i);
           //if its a opening bracket
           if(ch=='(')st.push(ch);
           
           //if its a closing bracket
           else if(ch==')'){
               while((!st.isEmpty())&&st.peek()!='('){
                   sb.append(st.pop());
               }
               st.pop();
           }
           else if(Character.isLetterOrDigit(ch))sb.append(ch);
           //if its a operator
           else {
               
                   while(st.size()>0&&pres(ch)<=pres(st.peek())){
                   sb.append(st.pop());
                }
                st.push(ch);
               
           }
           //if its a operand
          
       }
      if(st.size()>0)sb.append(st.pop());
      return sb.toString();
       
    }
}