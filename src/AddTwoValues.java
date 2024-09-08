//Given two values, they can be integer or floating point numbers, add them and print the result
import java.util.*;
public class AddTwoValues {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        System.out.println((int)(a+b));
    }
}
