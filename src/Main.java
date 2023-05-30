import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
          cub(5,10);

    }
    public static int sum(int k, int n){
        if (k == 0){
            return 0;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(i +"."+ Integer.toString(sum(k-1, n)) );
        }

        return 0;
    }

    public static void cub(int k, int n){
        if (k == 0 || n == 0){
            return;
        }
        String s = "";
        int count = 0;

        for (int i = 0; i < k; i++) {
            s += n-1;
        }
        while (!s.equals(Integer.toString(count, n)) ){
            String tempNum = Integer.toString(count++, n);

            while (tempNum.length() < 4){
                tempNum = "0" + tempNum;
            }
            System.out.println(tempNum);
        }
        String tempNum = Integer.toString(count++, n);

        while (tempNum.length() < 4){
            tempNum = "0" + tempNum;
        }
        System.out.println(tempNum);
    }
}
