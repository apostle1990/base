package ACMcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GetLeastNumbers {

    public static void main(String[] args) {
        int[] input = {4,5,1,6,2,7,3,8};
        int k = 4;
        ArrayList<Integer> res = GetLeastNumbers_Solution(input,k);
        System.out.println(res.toString());
    }

    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (input.length==0 || k==0) return arrayList;
        quicksort(input,0,input.length-1);
        for (int i=0;i<k;i++){
            arrayList.add(input[i]);
        }
        return arrayList;
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
