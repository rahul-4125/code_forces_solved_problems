import java.util.Scanner;

public class Creep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long t = scanner.nextLong();
        while (t-- > 0) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            StringBuilder s = new StringBuilder();

            if (a >= b) {
                s.append("0");
                a--;
            } else {
                s.append("1");
                b--;
            }

            while (a > 0 || b > 0) {
                if (s.charAt(s.length() - 1) == '0') {
                    if (b > 0) {
                        s.append('1');
                        b--;
                    } else if (a > 0) {
                        s.append('0');
                        a--;
                    }
                } else if (s.charAt(s.length() - 1) == '1') {
                    if (a > 0) {
                        s.append('0');
                        a--;
                    } else if (b > 0) {
                        s.append('1');
                        b--;
                    }
                }
            }

            System.out.println(s.toString());
        }

        scanner.close();
    }
}
