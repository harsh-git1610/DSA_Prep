import java.util.Scanner;

public class Ateam {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int ProblemToSolve = 0 ;

        for (int i = 0; i < n; i++) {

            int petya = sc.nextInt();
            int vesya = sc.nextInt();
            int tonya = sc.nextInt();
            if (petya + vesya + tonya >= 2 ){
                ProblemToSolve++ ;

            }
        }
        System.out.println(ProblemToSolve);


    }
}
