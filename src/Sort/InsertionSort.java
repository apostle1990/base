package Sort;

public class InsertionSort {
    public int[] insetsort(int[] arrays){
        if (arrays.length == 0) return arrays;
        for (int i=0; i<arrays.length-1; i++){
            int current = arrays[i+1];
            int preindex = i;
            while (preindex >= 0 && current<arrays[preindex]){
                arrays[preindex+1] = arrays[preindex];
                preindex--;
            }
            arrays[preindex+1] = current;
        }
        return arrays;
    }
}
