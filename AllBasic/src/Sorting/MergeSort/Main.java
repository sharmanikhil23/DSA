package Sorting.MergeSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] data={5,4,3,2,1};
        sort(data,0,data.length-1);
        System.out.println(Arrays.toString(data));
    }

    public static void sort(int[] data,int start, int end){
        int mid=start+(end-start)/2;
        if(end-start<=0){
            return;
        }
        sort(data,start,mid);
        sort(data,mid+1,end);
        merge(data,start,mid,end);
        return;

    }

    public static void merge(int[] data, int start, int mid, int end){

        int[] temp=new int[end-start+1];
        int fStart=start;
        int sStart=mid+1;
        int tempIndex=0;

        while(fStart<=mid && sStart<=end){
            if(data[fStart]<data[sStart]){
                temp[tempIndex++]=data[fStart++];
            }else{
                temp[tempIndex++]=data[sStart++];
            }
        }

        while(fStart<=mid){
            temp[tempIndex++]=data[fStart++];
        }

        while(sStart<=end){
            temp[tempIndex++]=data[sStart++];
        }

        for(int i=0,j=start;i<temp.length && j<=end;i++,j++){
            data[j]=temp[i];
        }

    }
}