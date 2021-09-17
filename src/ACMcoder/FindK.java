package ACMcoder;

import java.util.Arrays;
import java.util.Scanner;

public class FindK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int len = input.nextInt();
        int index = input.nextInt();

        int[] array = new int[3 * len];

        for (int j=0; j<len; j++){
            array[j] = input.nextInt();
        }
        for (int j=0; j<len; j++){
            array[j+len] = input.nextInt();
        }
        for (int j=0; j<len; j++){
            array[j+2*len] = input.nextInt();
        }
        Sort(array);
        System.out.println(array[index-1]);
    }

    public static void Sort(int[] nums){
        quicksort(nums,0,nums.length-1);
    }

    public static void quicksort(int[] nums, int left, int right){
        if (right -left <1) return;
        int smallindex = partion(nums,left,right);
        quicksort(nums,left,smallindex);
        quicksort(nums,smallindex+1,right);
    }

    public static int partion(int[] nums, int left, int right){
        int pivot =  (int) (left + Math.random()*(right-left+1));
        swap(nums, pivot,left);
        int smallindex = left-1;
        for (int i=left; i<=right; i++){
            if (nums[i]<nums[left]){
                smallindex++;
                if (i>smallindex){
                    swap(nums,i,smallindex);
                }
            }
        }
        return smallindex;
    }

    public static void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
