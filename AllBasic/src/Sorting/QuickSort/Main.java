package Sorting.QuickSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] data={5,4,3,2,1};
        sort(data,0,data.length-1);
        System.out.println(Arrays.toString(data));
    }

    public static void sort(int[] data, int low, int high){
        if(low>high){
            return;
        }

        int start=low;
        int end=high;
        int pivot=data[start+(end-start)/2];

        while(start<=end){
            while(data[start]<pivot){
                start++;
            }

            while(data[end]>pivot){
                end--;
            }

            if(start<=end){
                swap(data,start,end);
                start++;
                end--;
            }
        }
        sort(data,low,end);
        sort(data,start,high);

    }
    public static void swap(int[] data, int first, int last) {
        int temp = data[first];
        data[first] = data[last];
        data[last] = temp;
    }
}