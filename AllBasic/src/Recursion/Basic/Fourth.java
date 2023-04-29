package Recursion.Basic;

import java.util.Scanner;

public class Fourth {

    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter the number ");
        System.out.println(sum(input.nextInt()));
        input.close();
    }

    public static int sum(int n){
        if(n>0){
            return n+sum(n-1);
        }
        return 0;
    }
}
