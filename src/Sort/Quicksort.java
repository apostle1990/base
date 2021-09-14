package Sort;

import java.util.Random;

public class Quicksort {
    private static final Random random = new Random();
    private static final int base = 7;
    public int[] SortArray(int[] nums){
        if (nums.length<2) return nums;
        quicksort(nums, 0, nums.length-1);
        return nums;
    }
    public static void quicksort(int[] nums, int left, int right){
        if (right - left<base){
            InsertionSort insertionSort = new InsertionSort();
            insertionSort.insetsort(nums);
            return;
        }
//        if (left>=right) return;
        int smallindex = partionsort(nums, left, right);
        quicksort(nums, left, smallindex);
        quicksort(nums, smallindex+1, right);
    }
    private static int partionsort(int[] nums, int left, int right){
        int pivot = random.nextInt(right - left + 1) +left;
        swap(nums,left,pivot);
        int smallindex = left-1;
        for (int i = left; i<=right; i++){
            if (nums[i] <= nums[left]){
                smallindex++;
                if (i>smallindex){
                    swap(nums,i,smallindex);
                }
            }
        }
        return smallindex;
    }

    private static void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
