import java.util.*;
public class TwoRivalStudents {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int n = s.nextInt();
            int x = s.nextInt();
            int a = s.nextInt();
            int b = s.nextInt();
            if(a>b){
                int temp = a;
                a = b;
                b = temp;
            }
            int turn = 1;
            while(x>0){
                if(turn==1){
                    if(a>1){
                        a--;
                    }
                    else if(b<n){
                        b++;
                    }
                }
                else{
                    if(b<n){
                        b++;
                    }
                    else if(a>1){
                        a--;
                    }
                }
                turn = 1- turn;
                x--;
            }
            System.out.println(b-a);
        }
    }
}
