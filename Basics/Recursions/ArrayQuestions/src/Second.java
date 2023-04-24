import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        int[] data={1,2,3,4,5,1};
        System.out.println("Enter the number which you would like to find  ");
        Scanner input=new Scanner(System.in);
        System.out.println(find(data,input.nextInt(),0));
    }

    public static int find(int[] data, int target,int index){
        if(data.length==index){
            return -1;
        }else{
            if(data[index]==target){
                return index;
            }else{
                return find(data, target, ++index);
            }
        }
    }
}
