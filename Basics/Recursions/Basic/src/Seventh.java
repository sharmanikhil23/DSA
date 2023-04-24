import java.util.Scanner;

public class Seventh {
    public static void main(String[] args){
        System.out.println("Enter the string which you want to print");
        Scanner input=new Scanner(System.in);
        System.out.println(reverse(input.nextLine()));
    }

    public static String reverse(String l){
        if(l.length()>0){
            return l.charAt(l.length()-1)+reverse(l.substring(0,l.length()-1));
        }
        return "";
    }
}
