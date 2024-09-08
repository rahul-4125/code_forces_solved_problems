import java.util.*;
public class Translation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();
        StringBuilder sb = new StringBuilder(str1);
        sb.reverse();
        if(sb.toString().equals(str2)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
