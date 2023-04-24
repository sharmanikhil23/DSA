import java.util.ArrayList;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 1, 2, 3, 1, 1};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number which you would like to find ");
        System.out.println(find(data, 0, input.nextInt()));
        input.close();
    }

    public static ArrayList<Integer> find(int[] data, int index, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        if (index == data.length) {
            return result;
        } else {
            if (data[index] == target) {
                result.add(index);
            }
            result.addAll(find(data, index + 1, target));
            return result;
        }
    }
}
