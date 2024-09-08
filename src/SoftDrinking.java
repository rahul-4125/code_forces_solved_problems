import java.util.*;
public class SoftDrinking {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long k = s.nextLong();
        long l = s.nextLong();
        long c = s.nextLong();
        long d = s.nextLong();
        long p = s.nextLong();
        long nl = s.nextLong();
        long np = s.nextLong();
        long totaldrinks = k*l;
        long toasts = totaldrinks/nl;
        long limeslices = c*d;
        long enoughsalt = p/np;
        System.out.println(Math.min(Math.min(toasts,limeslices),enoughsalt)/n);
    }
}
