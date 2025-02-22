class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length]; // The result should match the size of nums1
        
        for (int i = 0; i < nums1.length; i++) {
            int foundIndex = -1;
            ans[i] = -1; // Default value if no greater element is found
            
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    foundIndex = j; // Mark the index where nums1[i] appears in nums2
                    break;
                }
            }
            
            // Look for the next greater element in nums2
            if (foundIndex != -1) {
                for (int j = foundIndex + 1; j < nums2.length; j++) {
                    if (nums2[j] > nums1[i]) {
                        ans[i] = nums2[j];
                        break;
                    }
                }
            }
        }
        
        return ans;
    }
}
