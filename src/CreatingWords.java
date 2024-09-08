import java.util.*;
public class CreatingWords {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        while(t-->0){
            String s1 = s.next();
            String s2 = s.next();
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();
            char temp = ch1[0];
            ch1[0] = ch2[0];
            ch2[0] = temp;
            s1 = new String(ch1);
            s2 = new String(ch2);
            System.out.println(s1+" "+s2);
        }
    }
}
