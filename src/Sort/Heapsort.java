package Sort;

public class Heapsort {

    static int len;
    public int[] heapsort(int[] array){
        len = array.length;
        if (len<1) return array;
        buildmaxheap(array);
        while (len>0){
            swap(array,0,len-1);
            len--;
            adjustheap(array,0);
        }
        return array;
    }

    public static void buildmaxheap(int[] array){
        for (int i = len/2; i>=0; i--){
            adjustheap(array,i);
        }
    }

    public static void adjustheap(int[] array, int i){
        int maxindex = i;
        if (i*2<len && array[i*2]>array[maxindex]) maxindex = i*2;
        if (i*2 +1<len && array[i*2+1]>array[maxindex]) maxindex = i*2+1;
        if (maxindex!=i) {
            swap(array,maxindex,i);
            adjustheap(array,maxindex);
        }
    }

    private static void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
