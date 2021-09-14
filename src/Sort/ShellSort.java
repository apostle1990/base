package Sort;

public class ShellSort {
    public int[] shellsort(int[] arrays){
        int len = arrays.length;
        int temp, gap = len/2;
        while (gap > 0){
            for (int i =gap; i<len; i++){
                temp = arrays[i];
                int preindex = i-gap;
                while (preindex>=0 && arrays[preindex]>temp){
                    arrays[preindex +gap] = arrays[preindex];
                    preindex -=gap;
                }
                arrays[preindex+gap] = temp;
            }
            gap = gap/2;
        }
        return arrays;
    }
}
