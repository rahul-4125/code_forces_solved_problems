import java.util.*;
public class CandiesAndTwoSisters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            double n = s.nextDouble();
            long ans = (long)Math.ceil((n/2)-1);
            System.out.println(ans);
        }
    }
}
