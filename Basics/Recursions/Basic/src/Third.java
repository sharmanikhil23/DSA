import java.util.Scanner;

public class Third {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        System.out.println(product(in.nextInt()));
    }

    public static int product(int n){
        if(n>0){
            return n*product((n-1));
        }else{
            return 1;
        }
    }
}
