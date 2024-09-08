import java.util.*;
public class NextRound {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int pos = s.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;++i){
            a[i] = s.nextInt();
        }
        if(a[0]==0){
            System.out.println(0);
            return;
        }
        int c = 0;
        for(int i = 0;i<n;++i){
            if(a[i]>=a[pos-1]&&a[i]>0){
                c++;

            }
        }
        System.out.println(c);
    }
}
