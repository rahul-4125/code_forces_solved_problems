import java.util.*;
public class RajuAndJEEExam {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int a = s.nextInt();
            int b = s.nextInt();
            int maxscore = a*4;
            if(b>maxscore){
                System.out.println(-1);
            }
            else {
                int minscored = ((b + 3) / 4) * 4;
                double acc = (double) minscored / maxscore * 100;
                System.out.printf("%.2f", acc);
            }
        }
    }
}
