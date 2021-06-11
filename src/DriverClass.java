// { Driver Code Starts
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
}// } Driver Code Ends





class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        Stack<Character> s=new Stack<Character>();
        for(int i=0;i<x.length();i++){
            char a=x.charAt(i);
            if(a=='{') {
                s.push(x.charAt(i));
            }
            else if(a=='('){
                s.push(x.charAt(i));
            }
            else if(a=='['){
                s.push(x.charAt(i));
            }
            else{
                if(!s.isEmpty()){
                    char ch=s.pop();
                    if(a==ch+2){
                        continue;
                    }
                    else if(a==ch+1){
                        continue;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    s.push(x.charAt(i));
                }
            }
        }
        if(!s.isEmpty()){
            return false;
        }
        return true;
    }
}
