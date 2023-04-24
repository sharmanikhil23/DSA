import java.util.Scanner;

public class Fourth {
//    Rotated binary search 1
    public static void main(String[] args) {
        int[] data ={ 4,5,6,7,0,1,2};
        Scanner input=new Scanner(System.in);
        System.out.println(find(data,input.nextInt(),0,data.length-1));
    }

    public static int find(int[] data, int target, int start, int end) {
        if (start > end ) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (data[mid] == target) {
            return mid;
        } else if (data[start]==target){
            return start;
        }else if(data[end]==target){
            return end;
        }else if(data[start]>data[end]){
            return find(data,target,start+1,end-1);
        }else{
            if(target<data[mid]){
                return find(data,target, start, end-1);
            }else{
                return find (data,target,start+1,end);
            }
        }
    }
}
