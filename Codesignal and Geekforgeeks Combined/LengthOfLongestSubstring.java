Given a string S, find the length of the longest substring without repeating characters. 

Example 1:

Input:
S = "geeksforgeeks"
Output: 7
Explanation: Longest substring is
"eksforg".
Example 2:

Input:
S = "ABDEFGABEF"
Output: 6
Explanation: Longest substring is
"BDEFGA" and "DEFGAB".
 

User Task:
Your task is to complete the function longestUniqueSubsttr() which takes a string S as and returns the length of the longest substring. You need not take input or print anything.

 

Expected Time Complexity: O(length of the string).
Expected Auxiliary Space: O(number of characters).


class Solution{
    int longestUniqueSubsttr(String S){
        int aPointer = 0;
        int bPointer = 0;
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int length = S.length();
        while (bPointer < length) {
            if (!set.contains(S.charAt(bPointer))) {
                set.add(S.charAt(bPointer++));
                maxLength = Math.max(set.size(), maxLength);
            }
            else {
                set.remove(S.charAt(aPointer++));
            }
        }
        return maxLength;
    }
}
