package exercise_4_4;

import java.util.*;
import java.util.stream.Collectors;

public class Revers_map {

   /* Map<String, Integer> map = new HashMap<>();
    Map<Integer, String> swapped = map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
    ///
    HashMap<String, String> newMap = new HashMap<>();*/


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map_revers = new HashMap<>();
      //  Заполнение map1
        for (int i=0; i<4; i++){
            map1.put(i,(int) (Math.random()*10));
        }



    }


}
