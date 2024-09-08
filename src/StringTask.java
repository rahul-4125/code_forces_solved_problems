import java.util.*;
public class StringTask {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String x = "";
        String str = s.nextLine().toLowerCase();
        for(char i : str.toCharArray()){
            if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u'){
                continue;
            }
            else {
                x+='.';
                x+=i;
            }
        }
        System.out.println(x);
    }
}

