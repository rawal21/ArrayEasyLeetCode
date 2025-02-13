public class RemoveDuplicates {
  public int removeDuplicates(int[] nums) {
    // Pointer 'i' tracks the position of the last unique element in the array
    int i = 0; 

    // Iterate through the array starting from the second element
    for (int j = 1; j < nums.length; j++) {

        // If the current element (nums[j]) is greater than the last unique element (nums[i]),
        // it means we found a new unique element
        if (nums[i] < nums[j]) {

            // Swap the elements to place the unique element in its correct position
            int temp = nums[j];
            nums[j] = nums[i + 1];
            nums[i + 1] = temp;

            // Move the unique element pointer 'i' forward
            i++;
        }
    }

    // Return the length of the array with unique elements (i+1 is the count)
    return i + 1;
}

}
