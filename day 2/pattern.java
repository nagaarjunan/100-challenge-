// Problem statement
// Sam is making a forest visualizer. An N-dimensional forest is represented by the pattern of size NxN filled with ‘*’.

// For every value of ‘N’, help sam to print the corresponding N-dimensional forest.

// Example:

// Explain
// Input: ‘N’ = 3

// Output: 
// * * *
// * * *
// * * *


//Time complexity : O(n^2)
//Space complexity : O(1)

class Solution {
    public static void nForest(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}