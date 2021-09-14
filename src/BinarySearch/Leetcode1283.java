package BinarySearch;

public class Leetcode1283 {
    public static int smallestDivisor(int[] nums, int threshold) {
        int maxVal =1;
        for (int num:nums){
            maxVal = Math.max(maxVal,num);
        }
        int right = maxVal, left=1;
        while (left<right){
            int mid = (right - left)/2 +left;
            if (calculate(nums,mid)>threshold){
                left = mid+1;
            }else {
                right = mid;
            }
        }
        return left;
    }
    private static int calculate(int[] nums, int divisor){
        int sum =0;
        for (int num : nums){
            sum += num/divisor;
            if (num % divisor!=0){
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,5,9};
        int threshold = 6;
        int re = smallestDivisor(nums,threshold);
        System.out.println(re);
    }
}
