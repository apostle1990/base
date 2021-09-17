package ACMcoder;

import java.util.*;

public class Machine {
    private static int count;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int[] nums = new int[len];
        for (int i=0; i<len; i++){
            nums[i] = input.nextInt();
        }
        count =0;

        cal(nums);

        System.out.println(count);
    }
    public static void cal(int[] nums){
        int num;
        for (int i=1; i<nums.length-1;i++){
            num = nums[i];
            if (num<nums[i-1] && num<nums[i+1]){
                swap(nums,i,nums[i-1]);
            }
            if (num>nums[i-1] && num>nums[i+1]){
                swap(nums,i,nums[i+1]);
            }
        }
    }

    public static void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
        count++;
    }
}
