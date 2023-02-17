import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PalindromeNumber {
    static public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        List<Integer> list = new ArrayList<>();
        while(x>0){
            list.add(x%10);
            x/=10;
        }
        for (int i = 0, j = list.size()-1; i < list.size(); i++, j--) {
            if (i == j ){
                return true;
            } else if (list.get(i) != list.get(j)) {
                return false;
            }
        }
        return true;
    }
}
