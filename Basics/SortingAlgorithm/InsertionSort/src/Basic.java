import java.util.Arrays;

/*
This algorithm is stable and works great with the partially sorted Array
 */
public class Basic {
    public static void main(String[] args) {
        int[] data={5,4,3,2,1};
        sort(data);
        System.out.println(Arrays.toString(data));
    }


    public static void swap(int[] data, int first, int last) {
        int temp = data[first];
        data[first] = data[last];
        data[last] = temp;
    }

    public static void sort(int[] data){
        int length=data.length-1;
        for(int i=1;i<=length;i++){
            for(int j=i;j>0;j--){
                if(data[j]>data[j-1]){
                    break;
                }else{
                    swap(data,j, j-1);
                }

            }
        }
    }
}