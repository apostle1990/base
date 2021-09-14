package Sort;

public class SelectionSort {
    public int[] selectionsort(int[] arrays){
        if (arrays.length==0) return arrays;
        for (int i=0;i<arrays.length;i++){
            int minindex = i;
            for (int j=i;j<arrays.length;j++){
                if (arrays[j]<arrays[minindex]){
                    minindex = j;
                }
            }
            int temp = arrays[minindex];
            arrays[minindex] = arrays[i];
            arrays[i]=temp;
        }
        return arrays;
    }
}
