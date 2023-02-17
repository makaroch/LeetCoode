import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class RomanToInteger {
    static String getRoman() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    static int RomToInt(String roman) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = 0;
        boolean flag = true;
        for (int i = 0; i < roman.length() -1; i++) {
            if ((roman.charAt(i) == 'I' && (roman.charAt(i+1) == 'V' || roman.charAt(i+1) == 'X')) ||
                    (roman.charAt(i) == 'X' && (roman.charAt(i+1) == 'L' || roman.charAt(i+1) == 'C')) ||
                    ((roman.charAt(i) == 'C' && (roman.charAt(i+1) == 'D' || roman.charAt(i+1) == 'M')))) {
                if (i == roman.length()-2){
                    flag = false;
                }
                res += map.get(roman.charAt(i+1)) - map.get(roman.charAt(i));
                i++;
            }
            else res += map.get(roman.charAt(i));
        }
        if (flag){
            res += map.get(roman.charAt(roman.length()-1));
        }
        return res;
    }
}
class IntegerToRoman{
    static int getInteger(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    static String intToRoman(int numIn){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(5, "V");
        map.put(10,"X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(400, "CD");
        map.put(90, "XC");
        map.put(40, "XL");
        map.put(9, "IX");
        map.put(4,"IV");

        StringBuilder str = new StringBuilder();
        int[] arrNumders = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int temp = 0;
        for (int i = 0; i < arrNumders.length; i++) {
            temp = numIn / arrNumders[i];
            for (int j = 0; j < temp; j++) {
                str.append(map.get(arrNumders[i]));
            }
            numIn -= arrNumders[i] * temp;
        }
        return str.toString();
    }
}


class TribonacciNumber{
    static int tribonacci(int n){
        int one = 0;
        int two = 1;
        int three = 1;
        int count = 2;
        int temp = 2;
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;
        while (count < n){
            temp = one + two + three;
            one = two;
            two = three;
            three = temp;
            count++;
        }
        return temp;
    }
}