// Problem statement
// You have been given an array ‘a’ of ‘n’ unique non-negative integers.



// Find the second largest and second smallest element from the array.



// Return the two elements (second largest and second smallest) as another array of size 2.



// Example :

// Explain
// Input: ‘n’ = 5, ‘a’ = [1, 2, 3, 4, 5]
// Output: [4, 2]

// The second largest element after 5 is 4, and the second smallest element after 1 is 2.
// Detailed explanation ( Input/output format, Notes, Images )
// Sample Input 1 :
// 4
// 3 4 5 2
// Sample Output 1 :
// 4 3
// Explanation For Sample Input 1 :
// The second largest element after 5 is 4 only, and the second smallest element after 2 is 3.
// Sample Input 2 :
// 5
// 4 5 3 6 7
// Sample Output 2 :
// 6 4
// Expected Time Complexity:
// O(n), Where ‘n’ is the size of an input array ‘a’.
// Constraints:
// 2 ≤ 'n' ≤ 10^5
// 0 ≤ 'a'[i] ≤ 10^9

// Time limit: 1 sec


// Hints:
// 1. Sort the array.
// 2. More efficiently, can you use the largest and smallest elements to find the required elements?
// 3. Can you find the largest and smallest elements in a single traversal?

//time complexity : O(n)
//space complexity : O(1)

class Solution{
    static int[] secondLargestAndSecondSmallest(int[] a, int n){
        int[] result = new int[2];
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]>firstLargest){
                secondLargest = firstLargest;
                firstLargest = a[i];
            }
            else if(a[i]>secondLargest && a[i]!=firstLargest){
                secondLargest = a[i];
            }
            if(a[i]<firstSmallest){
                secondSmallest = firstSmallest;
                firstSmallest = a[i];
            }
            else if(a[i]<secondSmallest && a[i]!=firstSmallest){
                secondSmallest = a[i];
            }
        }
        result[0] = secondLargest;
        result[1] = secondSmallest;
        return result;
    }
}

















