import java.util.Scanner;

public class Fifth {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number ");
        System.out.println(productOfDigits(input.nextInt()));
    }

    static int productOfDigits(int n){
        if(n==0){
            return 1;
        }
        return (n%10)*productOfDigits(n/10);
    }
}
