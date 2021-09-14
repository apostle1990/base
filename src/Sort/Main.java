package Sort;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int[] arrays = {4,2,1,3,7,5,8,9,6};
        System.out.println(Arrays.toString(arrays));
        BubbleSort bubbleSort = new BubbleSort();
        int[] re1 = bubbleSort.bubbleSort(arrays);
        SelectionSort selectionSort = new SelectionSort();
        int[] re2 = selectionSort.selectionsort(arrays);
        InsertionSort insertionSort = new InsertionSort();
        int[] re3 = insertionSort.insetsort(arrays);
        ShellSort shellSort = new ShellSort();
        int[] re4 = shellSort.shellsort(arrays);
        MergeSort mergeSort = new MergeSort();
        int[] re5 = mergeSort.mergetsort(arrays);
        Quicksort quicksort = new Quicksort();
        int[] re6 = quicksort.SortArray(arrays);
        Heapsort heapsort = new Heapsort();
        int[] re7 = heapsort.heapsort(arrays);
        Countsort countsort = new Countsort();
        int[] re8 = countsort.countsort(arrays);
        System.out.println(Arrays.toString(re8));
    }
}
