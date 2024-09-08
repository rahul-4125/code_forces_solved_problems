import java.util.*;
public class Tram {
     public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         int t = s.nextInt();
         int cap = 0;
         int cur = 0;
         while(t-->0){
             int a = s.nextInt();
             int b = s.nextInt();
             cur = cur-a+b;
             cap = Math.max(cur,cap);
         }
         System.out.println(cap);
     }
}
