package chapter1;

public class StrStrIII {

    public static void main(String[] args) {
        StrStrIII test = new StrStrIII();
        int index = test.strStr("mississippi", "issip");
        System.out.println(index);
    }

    public static final int MOD = 10000000;
    public static final int HASH_CONST = 31;

    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null)
            return -1;
        if (haystack.length() < needle.length())
            return -1;
        if (needle.length() == 0)
            return 0;
        int needleHash = getHashCode(needle);
        int haystackHash = getHashCode(haystack.substring(0, needle.length() - 1));
        int hashConstPower = 1;
        for (int i = 0; i < needle.length(); i++) {
            hashConstPower = (hashConstPower * HASH_CONST) % MOD;
        }
        for (int i = needle.length() - 1; i < haystack.length(); i++) {
            haystackHash = haystackHash * HASH_CONST + haystack.charAt(i);
            haystackHash = haystackHash % MOD;
            if (i > needle.length() - 1) {
                haystackHash = (haystackHash - haystack.charAt(i - needle.length()) * hashConstPower) % MOD;
                haystackHash = (haystackHash + MOD) % MOD;
            }
            if (haystackHash == needleHash) {
                int endIndex = i;
                int startIndex = i - needle.length() + 1;
                if (haystack.substring(startIndex, endIndex + 1).equals(needle)) {
                    return startIndex;
                }
            }

        }
        return -1;
    }

    private int getHashCode(String input) {
        int result = 0;
        for (char c : input.toCharArray()) {
            result = result * HASH_CONST + c;
            result = result % MOD;
        }
        return result;
    }

}
