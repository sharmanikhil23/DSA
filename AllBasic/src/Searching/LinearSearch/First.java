package Searching.LinearSearch;

import java.util.Scanner;
//for linear search the time complexity is O(n)
public class First {
    public static void main(String [] args){
        int[] data={5,4,3,2,1};
        Scanner in=new Scanner(System.in);
        System.out.println("Please enter the number you would love to find");
        System.out.println(find(data,in.nextInt()));
    }

    public static int find(int[] data, int target){
        for(int i=0;i<data.length;i++){
            if(data[i]==target){
                return i;
            }
        }
        return -1;
    }
}
