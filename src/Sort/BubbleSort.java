package Sort;

public class BubbleSort {
    public int[] bubbleSort(int[] arrays){
        if (arrays.length == 0) return arrays;
        for (int i=0; i<arrays.length; i++){
            for (int j=0; j< arrays.length-i-1;j++){
                if (arrays[j+1] < arrays[j]){
                    int temp = arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j+1] = temp;
                }
            }
        }
        return arrays;
    }
}
