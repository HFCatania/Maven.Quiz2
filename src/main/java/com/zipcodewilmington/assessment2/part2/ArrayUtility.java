package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {

        return Stream.of(array1, array2)
                .flatMap(Stream ::of)
                .toArray(Integer[]::new);
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        int temp;
        for(int i = 0; i < index; i++){
            temp = array[0];
            for (int j = 0 ; j < array.length-1; j++){
                array[j] = array[j +1];
            }
            array[array.length-1] = temp;
        }
        return array;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int result1 = 0;
        for (int i = 0; i < array1.length; i++) {
            if (valueToEvaluate == array1[i]) {
                result1++;
            }
        }
        int result2 = 0;
        for (int i = 0; i < array2.length; i++) {
            if (valueToEvaluate == array2[i]) {
                result2++;
            }
        }
        return result1 + result2;
    }

    public Integer mostCommon(Integer[] array) {
        int maxKey = -1;
        int maxValue = -1;
        Map<Integer, Integer>arrayMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++){
            if(!arrayMap.containsKey(array[i])){
                arrayMap.put(array[i], 1);
            } else {
                arrayMap.put(array[i], arrayMap.get(array[i])+1);
            }
            for(Map.Entry<Integer, Integer>entry : arrayMap.entrySet()){
                if(entry.getValue() > maxValue){
                    maxKey = entry.getKey();
                }
            }

        }
        return maxKey;
    }
}
