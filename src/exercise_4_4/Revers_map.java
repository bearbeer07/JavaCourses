package exercise_4_4;

import java.util.*;

public class Revers_map {
    public static void main(String[] args) {
        //создаем map и заполняем ее и передаем на вход в наш метод
        HashMap<Integer, Integer> hashMap = new HashMap();
        hashMap.put(1,2);
        hashMap.put(1,3);
        hashMap.put(2,2);
        inverse(hashMap);
    }
    //реализация нашего метода
    public static <K, V> Map<V, Collection<K>> inverse(Map<? extends K, ? extends V> map){
        Map<V, Collection<K>> resultMap = new HashMap<>();

       // Set<K> keys = map.keySet();
        Set <K> keys = (Set<K>) map.keySet();
        for(K key : keys){
            V value = map.get(key);
            resultMap.compute(value, (v, ks) -> {
                if(ks == null){
                    ks = new HashSet<>();
                }
                ks.add(key);
                return ks;
            });
        }

        return resultMap;
    }

}
