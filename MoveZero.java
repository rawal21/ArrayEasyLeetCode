// ✅ Approach: Two-Pointer Technique
// ✅ Time Complexity: O(n) -> Iterates the array once
// ✅ Space Complexity: O(1) -> No extra space used

class Solution {
  public void moveZeroes(int[] nums) {
      int nonZeroIndex = 0; // Pointer for placing non-zero elements
      
      // 1st Pass: Move non-zero elements to the front
      for (int i = 0; i < nums.length; i++) {
          if (nums[i] != 0) {
              nums[nonZeroIndex] = nums[i];
              nonZeroIndex++; // Move pointer to the next position
          }
      }
      
      // 2nd Pass: Fill remaining positions with zeroes
      while (nonZeroIndex < nums.length) {
          nums[nonZeroIndex] = 0;
          nonZeroIndex++;
      }
  }
}
