import java.util.Scanner;
//For binary search the time complexity is log(N)
public class First {
    public static void main(String[] args) {
        int[] data={5,4,3,2,1};
        Scanner in=new Scanner(System.in);
        System.out.println("Please enter the number you would love to find");
        System.out.println(find(data,in.nextInt()));
    }

    public static int find(int []data, int target){
        int start=0;
        int end=data.length-1;
        while(start<end) {
            int mid=start+(end-start)/2;

            if (data[mid] == target) {
                return mid;
            }else if(data[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}