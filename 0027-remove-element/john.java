class Solution {
	public int removeElement(int[] nums, int val) {
		var index = 0;

		for (int i = 0 ; i < nums.length && index < nums.length ; i++) {
			if (nums[i] != val) {
				nums[index++] = nums[i];
			}
		}

		return index;
	}
}
