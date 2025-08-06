import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in ) ;
        int w  =  sc.nextInt();
        System.out.println(divide(w));
        sc.close();
    }
    static String divide(int w ){

           if ( w>2 && w%2 == 0) {
            return "YES";

        } else
            return "NO";
    }
}
