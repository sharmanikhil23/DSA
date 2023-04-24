import java.util.Scanner;

public class Sixth {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number ");
        System.out.println(sumOfDigits(input.nextInt()));
    }

    static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+sumOfDigits(n/10);
    }
}
