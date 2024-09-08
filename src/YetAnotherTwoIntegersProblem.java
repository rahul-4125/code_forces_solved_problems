import java.util.*;
public class YetAnotherTwoIntegersProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long t = s.nextLong();
        while(t-->0){
            long a = s.nextLong();
            long b = s.nextLong();
            long dif = Math.abs(b-a);
            long moves = dif/10;
            if(dif%10!=0){
                moves++;
            }
            System.out.println(moves);
        }
    }
}
