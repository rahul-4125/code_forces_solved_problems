import java.util.*;
public class TheatreSquare {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long m = s.nextLong();
        long a = s.nextLong();
        long val = (long)(Math.ceil((double)m/a)*Math.ceil((double)n/a));
        System.out.println(val);
    }
}
