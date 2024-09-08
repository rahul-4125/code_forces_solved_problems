import java.util.*;
public class AmusingJoke {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String guest = s.nextLine();
        String host = s.nextLine();
        String pile = s.nextLine();
        String combined = guest + host;
        if(combined.length()!=pile.length()){
            System.out.println("NO");
            return;
        }
        HashMap<Character,Integer> combinedmap = new HashMap<>();
        for(char ch : combined.toCharArray()){
            combinedmap.put(ch, combinedmap.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer> pilemap = new HashMap<>();
        for(char ch : pile.toCharArray()){
            pilemap.put(ch,pilemap.getOrDefault(ch,0)+1);
        }
        if(combinedmap.equals(pilemap)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
