import java.util.*;
public class DarkMatter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inputLine = s.nextLine();
        String[] parts = inputLine.split("\\+");
        int a = Integer.parseInt(parts[0].trim());
        int b = Integer.parseInt(parts[1].trim());
        int result = a + b + ((a * a + b * b) + (a - b) + (Math.abs(a) * 2 * b) - (a * b + 2));
        System.out.println(result);
    }
}
