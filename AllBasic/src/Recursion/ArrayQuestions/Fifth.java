package Recursion.ArrayQuestions;

import java.util.Scanner;

public class Fifth {
// Rotated Binary search 2
    public static void main(String[] args) {
        int[] data = {4, 5, 6, 7, 0, 1, 2};
        Scanner input = new Scanner(System.in);
        System.out.println(find(data, input.nextInt(), 0, data.length - 1));
    }

    public static boolean find(int[] data, int target, int start, int end) {
        if (start > end) {
            return false;
        }

        int mid = start + (end - start) / 2;
        if (data[mid] == target) {
            return true;
        } else if (data[start] == target) {
            return true;
        } else if (data[end] == target) {
            return true;
        } else if (data[start] >= data[end]) {
            return find(data, target, start + 1, end - 1);
        } else {
            if (target < data[mid]) {
                return find(data, target, start, end - 1);
            } else {
                return find(data, target, start + 1, end);
            }
        }
    }
}
