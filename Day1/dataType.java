// Problem statement
// Programming languages have some conditional / decision-making statements that execute when some specific condition is fulfilled.
// If-else is one of the ways to implement them.
// You are given two numbers 'a' and 'b'.
// Compare the numbers and print the relation.
// Print “smaller”, “greater” or “equal” when ‘a’ is smaller than ‘b’, greater than ‘b’, or equal to ‘b’ respectively.

// Example :

// Explain
// Input: ‘a’ = 5 and ‘b’ = 3

// Output: greater

// Explanation: Since ‘a’ (= 5) is greater than ‘b’ (= 3), we are printing “greater”.
// Detailed explanation ( Input/output format, Notes, Images )
// Sample Input 1:
// 5 3
// Sample Output 1:
// greater


import java.util.*;
class Solution {
    public static String compareIfElse(int a, int b) {
        if(a>b){
            return "greater";
        }
        else if(a<b){
            return "smaller";
        }
        else{
            return "equal";
        }



        // Write your code here
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        compareIfElse(a, b);
    }
}