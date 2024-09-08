//Get an integer as input and print the count of prime numbers it gets add to
//Ex. 5 = 2 + 3, 8 = 2 + 3 + 5
import java.util.*;
public class RangeSumOfPrimes {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println(rangeSumPrimes(a));
    }

    public static boolean isPrime(int a){
        if(a<=1) return false;
        if(a<=3) return true;
        if(a%2==0||a%3==0) return false;
        for(int i=5;i*i<=a;i+=6){
            if(a%i==0||a%(i+2)==0){
                return false;
            }
        }
        return true;
    }

    public static int rangeSumPrimes(int a){
        int sumOfPrimes = 0;
        int count = 0;
        int currentNumber = 2;
        while(sumOfPrimes<a){
            if(isPrime(currentNumber)){
                sumOfPrimes += currentNumber;
                count++;
                if(sumOfPrimes==a){
                    break;
                }
            }
            currentNumber++;
        }
        return count;
    }
}
