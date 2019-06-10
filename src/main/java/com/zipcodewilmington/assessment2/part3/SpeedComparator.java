package com.zipcodewilmington.assessment2.part3;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {

    public int compare(Animal animal1, Animal animal2) {

        return animal1.getSpeed() > animal2.getSpeed() ? 1 : animal1.getSpeed() < animal2.getSpeed() ? -1 : 0;
    }
}


//    f(animal1.getSpeed() == animal2.getSpeed()){
//        return 0;
//    } else if (animal1.getSpeed() > animal2.getSpeed()){
//        return -1;
//    } else
//            return 1;