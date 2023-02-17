public class LongestCommonPrefix {
//    public String longestCommonPrefix(String[] strs) {
//        int count = strs[0].length();
//        int tempCount = 0;
//        for (int i = 0; i < strs.length-1; i++) {
//            for (int j = 0; j < strs[i].length() && j < strs[i+1].length(); j++) {
//                if (strs[i].charAt(j) == strs[i+1].charAt(j)){
//                    tempCount++;
//                }
//                else break;
//            }
//            if (tempCount < count){
//                count = tempCount;
//            }
//            tempCount = 0;
//        }
//        if (count == 0){
//            return "";
//        }
//        String res ="";
//        for (int i = 0; i < count; i++) {
//            res += strs[0].charAt(i);
//        }
//        return res;
//    }
        public String longestCommonPrefix(String[] strs) {
            StringBuilder sb = new StringBuilder();

            for(int i=0; i<strs[0].length(); i++) {
                char tmp = strs[0].charAt(i);

                for(int j=1; j<strs.length; j++) {
                    if(strs[j].length() < i+1) {
                        return sb.toString();
                    }
                    if(strs[j].charAt(i) != tmp) {
                        return sb.toString();
                    }
                }
                sb.append(tmp);
            }
            return sb.toString();
        }
}
