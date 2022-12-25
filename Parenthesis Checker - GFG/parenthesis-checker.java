//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Reading total number of testcases
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            //reading the string
            String st = sc.next();
            
            //calling ispar method of Paranthesis class 
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}
// } Driver Code Ends




class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean isMatching(char ch,char peek){
        if(ch==')'&&peek=='(')return true;
        else if(ch=='}'&&peek=='{')return true;
        else if(ch==']'&&peek=='[')return true;
        else return false;
    }
    static boolean ispar(String s)
    {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            //1.if is a opening bracket 
            if(ch=='{'||ch=='('||ch=='['){
                st.push(ch);
            }
            //2.if closing then
            else {
                if(!st.isEmpty()){
                        if(isMatching(ch,st.peek())){
                            st.pop();
                        }
                        else{
                            return false;
                        }
                        //i.
                }
                else{
                    return false;
                }
            }
            
        }
        if(st.isEmpty())return true;
        else return false;
    }
}
