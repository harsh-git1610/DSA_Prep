import java.util.Scanner;
public class nextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        int k = sc.nextInt();
        int counter = 0 ;
        for (int i = 0; i <= n; i++) {
            int a  = sc.nextInt();
            if (a > k ){
                counter++ ;
                break;
            } else if (a == k ) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
