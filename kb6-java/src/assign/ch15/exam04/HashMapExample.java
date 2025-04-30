package assign.ch15.exam04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(); // 뒤 < > 생략

        // 저장
        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95);
        System.out.println("총 Entry 수:" + map.size());
        String key = "홍길동";
        int value = map.get(key);

        System.out.println(key + " : " + value);

        // Set 으로 접근하기
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();

        while (keyIterator.hasNext()) {
           String k = keyIterator.next();
           Integer v = map.get(k);
           System.out.println(k + " : " + v);
       }
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();

        while (entryIterator.hasNext()) {
            Entry<String, Integer> entry = entryIterator.next();
            String s = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(s + " : " + v);
        }

        map.remove("홍길동");
        System.out.println("총 엔트리 수 : " + map.size());
    }
}
