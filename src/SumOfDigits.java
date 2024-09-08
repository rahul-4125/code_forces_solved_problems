import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int c = 0;
        if(str.length()==1){
            System.out.println(0);
            return;
        }
        while(str.length()>1){
            str = sumofdigits(str);
            c++;
        }
        System.out.println(c);
    }

    public static String sumofdigits(String n){
        int sum = 0;
        for(char digit : n.toCharArray()){
            sum+=digit-'0';
        }
        return Integer.toString(sum);
    }
}
