import java.util.Arrays;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Step 1: Sort both arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;
        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;

        // Step 2: Use two pointers to find the intersection
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++; // Move pointer i if nums1[i] is smaller
            } else if (nums1[i] > nums2[j]) {
                j++; // Move pointer j if nums2[j] is smaller
            } else {
                // Found an intersection element, store it
                if (index == 0 || temp[index - 1] != nums1[i]) { // Avoid duplicates
                    temp[index++] = nums1[i];
                }
                i++;
                j++;
            }
        }

        // Step 3: Copy the valid part of the temp array to the final result
        return Arrays.copyOf(temp, index);
    }
}
