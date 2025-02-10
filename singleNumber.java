// ✅ Approach: Bit Manipulation (Using XOR ^ Operator)
// ✅ Time Complexity: O(n) -> We iterate through the array once
// ✅ Space Complexity: O(1) -> We use only one variable

class Solution {
  public int singleNumber(int[] nums) {
      // Initialize result to 0, since XOR with 0 doesn't change the number
      int result = 0;

      // Iterate through all elements in the array
      for (int num : nums) {
          result ^= num;  // XOR operation cancels out duplicate numbers
      }

      // The remaining number is the single number
      return result;
  }
}

/*
🔹 Why XOR (^) Works?
 - XOR of two same numbers is 0:  (a ^ a = 0)
 - XOR of any number with 0 remains unchanged: (a ^ 0 = a)
 - Order doesn't matter:  (a ^ b ^ a) = (a ^ a ^ b) = (0 ^ b) = b

📌 Example:
 nums = [4, 1, 2, 1, 2]
 Step-by-step XOR:
 4 ^ 1 = 5
 5 ^ 2 = 7
 7 ^ 1 = 6
 6 ^ 2 = 4
 => The single number left is 4 ✅

🔹 Why is this better than sorting or using HashMap?
 - Sorting takes O(n log n)
 - HashMap uses O(n) extra space
 - XOR solution is O(n) time and O(1) space, making it optimal.
*/
