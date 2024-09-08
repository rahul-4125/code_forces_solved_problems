
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EvenFibonacci {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long a = 1;
            long b = 2;
            long sum = 0;
            while(a<=n){
                if(a%2==0){
                    sum+=a;
                }
                long next = a+b;
                a = b;
                b = next;
            }
            System.out.println(sum);
        }
    }
}