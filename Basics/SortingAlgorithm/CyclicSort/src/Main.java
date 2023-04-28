import java.util.Arrays;

/*
This sorting algorithm is one is the best and most asked algorithm and been worked for 0 to n or 1 to n elements
Keep on sorting until the element is in the correct position
 */
public class Main {
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
        int current=0;
        while(current<data.length){
            if(data[current]==current+1){
                current++;
            }else{
                swap(data,current,data[current]-1);
            }
        }
    }
}