package leetcode;

/**
 * Copyright (C),上品折扣
 * FileName: LeetCode1
 *
 * @author caoyue
 * @date 2020 2020/11/19 11:15
 * description
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 *
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 *
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/move-zeroes
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode1 {
    
    public static void moveZeroes(int[] nums) {
        int n = nums.length,left =0,right=0;
        while(right<n) {
            if(nums[right]!=0) {
                swap(nums, left, right);
                left ++;
            }
            right++;
        }
    }
    
    public static void swap(int[]nums, int left, int right) {
//        nums[left] = nums[left]^nums[right];
//        nums[right] = nums[left]^nums[right];
//        nums[left] = nums[left]^nums[right];
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public static void main(String[] args) {
        int [] nums = {3,4,60,90,0,9,0,0}; 
        moveZeroes(nums);
        for(int num: nums) {
            System.out.println(num);
        }
    }
    
    
    
    
    
}
