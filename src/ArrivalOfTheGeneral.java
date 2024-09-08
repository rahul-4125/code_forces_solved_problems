import java.util.*;
public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;++i){
            a[i] = s.nextInt();
        }
        int maxindex = 0;
        int minindex = 0;
        for(int i=0;i<n;++i){
            if(a[i]>a[maxindex]){
                maxindex = i;
            }
            if(a[i]<=a[minindex]){
                minindex = i;
            }
        }
        int moves = maxindex;
        moves+=(n-1-minindex);
        if(minindex<maxindex){
            moves--;
        }
        System.out.println(moves);
    }
}
