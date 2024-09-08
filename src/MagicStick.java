import java.util.*;
public class MagicStick {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            long x = s.nextLong();
            long y = s.nextLong();
            if(x==1&&y>1){
                System.out.println("NO");
            }
            else if((x==2||x==3)&&y>3){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
