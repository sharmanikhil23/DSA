package Recursion.Basic;

import java.util.Scanner;

public class First {

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the number which you would like to print");
        int data=input.nextInt();
        print(data);
    }
    public static void print(int n ){
        if(n==0){
            return;
        }else{
            System.out.println(n);
            print(n-1);
        }
    }
}
