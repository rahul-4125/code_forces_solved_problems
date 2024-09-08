import java.util.*;
public class LuckyDivision {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Integer> luckynumbers = generateLuckyNumbers(1000);
        boolean isalmostlucky = false;
        for(int l : luckynumbers){
            if(n%l==0){
                isalmostlucky = true;
                break;
            }
        }
        if(isalmostlucky){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }

    private static List<Integer> generateLuckyNumbers(int limit){
        List<Integer> luckynumbers = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add("4");
        queue.add("7");
        while(!queue.isEmpty()){
            String current = queue.poll();
            int n = Integer.parseInt(current);
            if(n<=limit){
                luckynumbers.add(n);
                queue.add(current+"4");
                queue.add(current+"7");
            }
        }
        return luckynumbers;
    }
}
