// Problem statement
// Sam is planting trees on the upper half region (separated by the left diagonal) of the square shared field.

// For every value of ‘N’, print the field if the trees are represented by ‘*’.

// Example:

// Explain
// Input: ‘N’ = 3

// Output: 
// * * *
// * *
// *

//time complexity : O(n^2)
//space complexity : O(1)

class Solution {
    public static void nForest(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
