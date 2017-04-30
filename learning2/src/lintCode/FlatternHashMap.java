package lintCode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FlatternHashMap {

    private HashMap<String, String> flattenDictionary(HashMap<String, Object> dict) {
        LinkedHashMap<String, String> result = new LinkedHashMap<String, String>();
        dfs(dict, result, null);
        return result;
    }

    private void dfs(HashMap<String, Object> dict, HashMap<String, String> result, String prefix) {
        if (prefix == null) {
            prefix = "";
        } else {
            prefix = prefix + ".";
        }
        Set<Entry<String, Object>> entrySet = dict.entrySet();
        for (Entry<String, Object> entry : entrySet) {
            String key = prefix + entry.getKey();
            Object value = entry.getValue();
            if (value instanceof HashMap) {
                @SuppressWarnings("unchecked")
                HashMap<String, Object> subMap = (HashMap<String, Object>) value;
                dfs(subMap, result, key);
            } else {
                result.put(key, String.valueOf(value));
            }
        }
    }

    public static void main(String[] args) {

        HashMap<String, Object> dict = new HashMap<>();
        dict.put("key1", 1);
        HashMap<String, Object> subDict2 = new HashMap<>();
        dict.put("key2", subDict2);
        subDict2.put("a", 2);
        subDict2.put("b", 3);
        HashMap<String, Object> subDict2_3 = new HashMap<>();
        subDict2_3.put("d", 3);
        subDict2_3.put("e", 1);
        subDict2.put("c", subDict2_3);

        FlatternHashMap test = new FlatternHashMap();
        HashMap<String, String> result = test.flattenDictionary(dict);
        System.out.println(result);

    }

}
