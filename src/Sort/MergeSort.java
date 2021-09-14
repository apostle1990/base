package Sort;

import java.util.Arrays;

public class MergeSort {
    public int[] mergetsort(int[] arrays){
        return mergetsort(arrays,0,arrays.length-1);
    }

    public int[] mergetsort(int[] arrays,int left, int right){
        if (left<right){
            int mid = (right - left)/2 +left;
            mergetsort(arrays,left,mid);
            mergetsort(arrays,mid+1,right);
            merge(arrays,left,mid,right);
        }
        return arrays;
    }

    public static void merge(int[] arrays, int left, int mid, int right){
        int[] temp = new int[right-left+1];
        int i = left;
        int j = mid +1;
        int k=0;
        while (i<=mid && j<=right){
            if (arrays[i]<arrays[j]){
                temp[k++] = arrays[i++];
            }else {
                temp[k++] = arrays[j++];
            }
        }
        while (i<=mid){
            temp[k++] = arrays[i++];
        }
        while (j<=right){
            temp[k++] = arrays[j++];
        }
        if (temp.length >= 0) System.arraycopy(temp, 0, arrays, left, temp.length);
    }
}
