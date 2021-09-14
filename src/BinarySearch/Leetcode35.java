package BinarySearch;

public class Leetcode35 {
    public static int searchInsert(int[] nums, int target) {
        int left =0,right = nums.length-1;
        int mid = 0;
        while (left <= right){
            mid = (right - left)/2 + left;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) right = mid-1;
            else left = mid+1;
        }
        return nums[mid]<target?mid+1:mid;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,5,6};
        int target = 1;
        int re = searchInsert(nums,target);
        System.out.println(re);
    }
}
