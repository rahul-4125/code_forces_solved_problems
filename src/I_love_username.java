import java.util.*;
public class I_love_username {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int first = s.nextInt();
        int best = first;
        int worst = first;
        int c = 0;
        for(int i=1;i<n;++i){
            int k = s.nextInt();
            if(k>best){
                best = k;
                c++;
            }
            else if(k<worst){
                worst = k;
                c++;
            }
        }
        System.out.println(c);
    }
}
