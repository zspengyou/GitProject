package chapter1;

public class StrStr {

    public static void main(String[] args) {
        System.err.println("in the for loop, get the loop length, then loop [0,length) ");
        System.err.println("in the methodbody, check edge case first ");
    }

    public static int IndexOf(String source, String target) {
        if (source == null || target == null)
            return -1;
        int sourceLength = source.length();
        int targetLength = target.length();
        for (int i = 0; i < sourceLength - targetLength + 1; i++) {
            int j;
            for (j = 0; j < targetLength; j++) {
                if (source.charAt(i + j) != target.charAt(j))
                    break;
            }
            if (j == targetLength)
                return i;
        }
        return -1;

    }

}
