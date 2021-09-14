package Sort;

import java.util.Arrays;

public class Countsort {
    public int[] countsort(int[] array){
        if (array.length==0) return array;
        int min=array[0],max=array[0];
        for (int j : array) {
            if (j > max) max = j;
            if (j < min) min = j;
        }
        int[] bucket = new int[max - min +1];
        Arrays.fill(bucket,0);
        for (int j : array) {
            bucket[j - min]++;
        }

        int index = 0,i=0;
        while (index < array.length){
            if (bucket[i] !=0){
                array[index] = i + min;
                bucket[i] --;
                index++;
            }else{
                i++;
            }
        }
        return array;
    }
}
