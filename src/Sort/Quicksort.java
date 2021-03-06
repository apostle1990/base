package Sort;

import java.util.Random;

public class Quicksort {
    public int[] SortArray(int[] nums){
        if (nums.length<2) return nums;
        quicksort(nums, 0, nums.length-1);
        return nums;
    }
    public static void quicksort(int[] nums, int left, int right){
        if (left<right){
            int smallindex = partion(nums,left,right);
            quicksort(nums,left,smallindex-1);
            quicksort(nums,smallindex+1,right);
        }
    }

    public static int partion(int[] nums, int left ,int right){
        int index = left +1;
        for (int i=index; i<=right;i++){
            if (nums[i]<nums[left]){
                swap(nums,i,index);
                index++;
            }
        }
        swap(nums, left, index-1);
        return index-1;
    }

    public static void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
