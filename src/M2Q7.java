import java.util.*;
public class M2Q7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a , b , c , d;
        for (int i = 0 ; i < n ; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = 0;
            if (a < 60){
                d++;
            }
            if (b < 60){
                d++;
            }
            if (c < 60){
                d++;
            }
            if (d == 0){
                System.out.println("P");
            }
            else if (d == 1){
                if (a + b + c > 220){
                    System.out.println("P");
                }
                else {
                    System.out.println("M");
                }
            }
            else if (d == 2){
                if (a >= 80 || b >= 80 || c >= 80){
                    System.out.println("M");
                }
                else {
                    System.out.println("F");
                }
            }
            else {
                System.out.println("F");
            }
        }
    }
}