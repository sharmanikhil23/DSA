package Recursion.Basic;

import java.util.Scanner;

public class Second {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number ");
        print(input.nextInt());
    }

    public static void print(int n){
        if(n>0){
            print(n-1);
            System.out.println(n);
        }
    }
}
