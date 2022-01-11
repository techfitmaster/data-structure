/*
 * @Author: zhengxing.hu
 * @Date: 2022-01-11 15:44:15
 * @LastEditTime: 2022-01-11 15:53:20
 * @Description: 
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct. 
 * https://leetcode.com/problems/contains-duplicate/
 */
public class ContainsDuplicate {

	static class Solution {
		public boolean containsDuplicate(int[] nums) {
			Boolean bl = false;
			for (i = 0; i < nums.lenght; i++ ){
				for (j = i+1; j < nums.length; j++){
					if (nums[i] = nums[j]) {
						return true;
					}
				}
			}
			return bl;
		}
		
	}
	public static void main(String[] args) {
		Solution solution = new Solution();
		int [] nums = {1,2,3,1};
		System.out.println(solution.containsDuplicate(nums)); 
	}	

}
