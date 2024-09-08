import java.util.*;
public class NearestLuckyNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        int c = 0;
        while(n!=0){
            if(n%10==4||n%10==7){
                c++;
            }
            n/=10;
        }
        if(c==4||c==7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
