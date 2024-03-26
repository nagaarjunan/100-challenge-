// Problem statement
// Given an array ‘arr’ of size ‘n’ find the largest element in the array.



// Example:


// Explain
// Input: 'n' = 5, 'arr' = [1, 2, 3, 4, 5]

// Output: 5

// Explanation: From the array {1, 2, 3, 4, 5}, the largest element is 5.
// Detailed explanation ( Input/output format, Notes, Images )
// Sample input 1:
// 6
// 4 7 8 6 7 6 
// Sample output 1:
// 8



class Solution {

    static int largestElement(int[] arr, int n) {

        // Create a temporary variable 'temp' and initialize it with 0.
        int maxElement = 0;

        // Traverse the array.
       for(int i=0;i<arr.length;i++){
           if(arr[i]>maxElement){
               maxElement=arr[i];
           }
       }

        // Return 'temp'.
        return maxElement;

    }
}

//Time complexity : O(n)
//Space complexity : O(1)
