import java.util.*;
public class CreepAlt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int i=1;
        while(t-->0){
            int a = s.nextInt();
            int b = s.nextInt();
            while(true){
                if((a==0)&(b==0)){
                    break;
                }
                if((i%2==1)&&(a>0)){
                    System.out.print(0);
                    a--;
                }
                if((i%2==0)&&(b>0)){
                    System.out.print(1);
                    b--;
                }
                i++;
            }
        }
    }
}
