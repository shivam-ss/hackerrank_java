/*Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints

 will consist at most  lower case english letters.
Sample Input

madam
Sample Output

Yes */


















import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        // the input string;
        int len=A.length();
        String B="";
        for(int i=len-1; i>=0; i--){
            char temp=A.charAt(i);
            String temp2=Character.toString(temp);
            B=B.concat(temp2);
        }
        
        if(A.compareTo(B)==0){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}



