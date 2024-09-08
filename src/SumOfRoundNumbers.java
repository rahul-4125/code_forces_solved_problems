import java.util.*;
public class SumOfRoundNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int n = s.nextInt();
            List<Integer> val = new ArrayList<>();
            if(n>=1000){
                int thousand = (n/1000)*1000;
                val.add(thousand);
                n%=1000;
            }
            if(n>=100){
                int hundred = (n/100)*100;
                val.add(hundred);
                n%=100;
            }
            if(n>=10){
                int ten = (n/10)*10;
                val.add(ten);
                n%=10;
            }
            if(n>0){
                val.add(n);
            }
            val.removeIf(x->x==0);
            Collections.sort(val,Collections.reverseOrder());
            System.out.println(val.size());
            for(int i:val){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
