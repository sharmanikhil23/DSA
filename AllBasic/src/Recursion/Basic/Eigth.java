package Recursion.Basic;

import java.util.Scanner;

public class Eigth {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        reverseNum(in.nextInt());
        in.close();
    }

    public static int reverseNum(int n){
        if(n>0){
            return ((n%10)*(int)Math.pow(10,nOfZero(n)))+reverseNum(n/10);
        }
        return 0;
    }

    public static int nOfZero(int n ){
       return (int)(Math.log10(n)+1);
    }
}
