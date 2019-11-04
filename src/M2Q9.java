import java.util.*;
public class M2Q9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        for (int i = a ; i >= 2 ; i--){
            if (a % i == 0 && b % i == 0){
                c = i;
                break;
            }
        }
        System.out.println(c);
        System.out.println((a * b) / c);
    }
}