import java.util.Arrays;

public class Zigzag_Conversion {
    //PAYPALISHIRING
    static public String convert(String s, int numRows) {
        if (numRows == 1 || (s.length() < numRows)){
            return s;
        }
        int len2 = (s.length()/2 == 0)? 1: s.length()/2+1;

        char[][] charArr = new char[numRows][len2];

        int i = -1;
        int j = 0;
        int count = 0;
        boolean flag = true;
        while (count < s.length()){
            if (flag){
                if (!(s.length() - count < numRows)){
                    for (int k = 0; k < numRows; k++) {
                        i++;
                        charArr[i][j] = s.charAt(count++);
                    }
                }
                else {
                    for (int k = 0; k <= s.length()-count; k++) {
                        i++;
                        charArr[i][j] = s.charAt(count++);
                    }
                }

                flag = false;
            }
            else {
                for (int k = 0; k < numRows - 2; k++) {
                    i--;
                    j++;
                    charArr[i][j] = s.charAt(count++);
                }
                flag = true;
                i = -1;
                j++;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int k = 0; k < numRows; k++) {
            for (int l = 0; l < len2; l++) {
                if (charArr[k][l] != '\u0000' ){//\u0000
                    stringBuilder.append(charArr[k][l]);
                }
            }
        }
        return stringBuilder.toString();
    }
}
