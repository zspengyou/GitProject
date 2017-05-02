package chapter1;

public class StrStr3 {

    public static final int MOD = 1000000;

    public static void main(String[] args) {
        StrStr3 test = new StrStr3();
        String source = "mississippi";
        String target = "issip";
        int result = test.strStr(source, target);
        System.out.println(result);
    }

    public int strStr(String source, String target) {
        if (source == null || target == null)
            return -1;
        if (source.length() < target.length())
            return -1;
        if (target.length() == 0)
            return 0;
        char[] sourceCharArray = source.toCharArray();
        int targetLength = target.length();
        int targetHashCode = calHashCode(target);
        int constant = (int)Math.pow(31, targetLength);
        int hashCode = 0;
        for (int i = 0; i < sourceCharArray.length; i++) {
            hashCode = hashCode * 31 + sourceCharArray[i];
            hashCode = hashCode % MOD;
            if (i < targetLength - 1) {
                continue;
            } else if (i > targetLength - 1) {
                hashCode = (hashCode - sourceCharArray[i - targetLength] * constant) % MOD;
                if (hashCode < 0)
                    hashCode += MOD;
            }
            if (hashCode == targetHashCode) {
                boolean equal = true;
                for (int j = 0; j < targetLength; j++) {
                    if (target.charAt(j) != (sourceCharArray[i - targetLength + 1 + j])) {
                        equal = false;
                        break;
                    }
                }
                if (equal == true)
                    return i - targetLength + 1;
            }
        }
        return -1;
    }

    private int calHashCode(String target) {
        int hashCode = 0;
        for (char c : target.toCharArray()) {
            hashCode = hashCode * 31 + c;
            hashCode = hashCode % MOD;
        }
        return hashCode;
    }

}
