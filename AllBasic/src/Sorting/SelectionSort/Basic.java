package Sorting.SelectionSort;

import java.util.Arrays;

public class Basic {
    public static void main(String[] args) {
        int[] data={5,4,3,2,1};
//        sort(data);
        sortRecursion(data,0,data.length-1, 0);
        System.out.println(Arrays.toString(data));
    }

    public static void sort(int[] data){
        int length=data.length-1;
        for(int i=length;i>=0;i--){
            int large=0;
            for(int j=1;j<=i;j++){
                if(data[large]<data[j]){
                    large=j;
                }
            }
            swap(data,large,i);
        }
    }


    public static void sortRecursion(int[] data, int start, int end, int max){
        if(end==0){
            return;
        }

        if(start<=end){
            if(data[max]<data[start]){
                max=start;
            }
            sortRecursion(data,start+1,end,max);
        }else{
            swap(data, end,max);
            sortRecursion(data,0, end-1,0);
        }
    }


    public static void swap(int[] data, int first, int last){
        int temp=data[first];
        data[first]=data[last];
        data[last]=temp;
    }
}