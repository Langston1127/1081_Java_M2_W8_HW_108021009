import java.util.*;
public class M2Q13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 1l;
        for (int i = n ; i >= 1 ; i--){
             sum = sum * i;
        }
        System.out.println(sum);
    }
}
