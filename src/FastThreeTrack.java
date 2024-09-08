import java.util.*;
public class FastThreeTrack {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int n = s.nextInt();
            int sum = 0;
            int flag = 0;
            for(int i=0;i<n;++i){
                int val = s.nextInt();
                sum+=val;
                if(val%3==1){
                    flag = 1;
                }
            }
            if(sum%3==0){
                System.out.println(0);
            }
            else if(flag==1){
                System.out.println(1);
            }
            else{
                System.out.println(3-sum%3);
            }
        }
    }
}
