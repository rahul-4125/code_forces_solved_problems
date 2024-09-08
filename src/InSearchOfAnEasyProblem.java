import java.util.*;
public class InSearchOfAnEasyProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int flag = 0;
        for(int i=1;i<=n;++i){
            if(s.nextInt()==1){
                flag = 1;
            }
        }
        if(flag==1){
            System.out.println("HARD");
        }
        else{
            System.out.println("EASY");
        }
    }
}
