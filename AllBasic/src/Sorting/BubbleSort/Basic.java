package Sorting.BubbleSort;

import java.util.Arrays;
//best case O(n) and worst O(n^2)
public class Basic {
    public static void main(String[] args) {
        int[] data={5,4,3,2,1};
//        sort(data);
        sortRecursion(data,0,data.length-1);
        System.out.println(Arrays.toString(data));
    }

    public static void sort(int[] data){
        int length=data.length;
        boolean flag=false;
        for(int i=0;i<length;i++){
            flag=false;
            for(int j=0;j<length-i-1;j++){
                if(data[j]>data[j+1]){
                    flag=true;
                    swap(data,j,j+1);
                }
            }
            if(flag==false){
                return;
            }
        }
    }


    public static void sortRecursion(int[] data, int start, int end){
        if(end<=0){
            return;
        }

        if(start<end){
            if(data[start]>data[start+1]){
                swap(data,start,start+1);
            }
            sortRecursion(data,start+1,end);
        }else{
            sortRecursion(data,0,end-1);
        }

    }
    public static void swap(int[] data, int first, int last){
        int temp=data[first];
        data[first]=data[last];
        data[last]=temp;
    }
}