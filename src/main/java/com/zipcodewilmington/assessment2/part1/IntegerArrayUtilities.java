package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        if((array.length%2) == 0){
            return true;
        }
        return false;
    }

    public Integer[] range(int start, int stop) {
//      int[] range = IntStream.rangeClosed(start, stop).toArray();
//        Stream<Integer> boxed = range[].boxed();
       return null;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        Integer result = array[0] + array[1];
        return result;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        Integer result = array[array.length - 1] * array[array.length -2];
        return result;
    }
}
