package main.java;

import java.util.Arrays;

public class BubbleSort {
    //    procedure bubbleSort(A : list of sortable items)
//    n := length(A)
//        for i from 0 to N-1 do
//            for j from 0 to N-i-1 do
//                if a[j]>a[j+1] then
//                    swap(a[j], a[j+1])
//                endif
//            end for
//        end for
//    end procedure


    public static void main(String[] args) {

        int[] array = {68, 84, 41, 62, 18};
        var n = array.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (array[j] > array[j+1]) {
                    int jt = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = jt;
                }
        System.out.println(Arrays.toString(array));
    }
}