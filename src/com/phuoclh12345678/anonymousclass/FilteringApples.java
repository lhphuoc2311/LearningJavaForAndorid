/*
*  created date: Sep 24, 2021
*  author: cgm
*/
package com.phuoclh12345678.anonymousclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilteringApples {
    public static void main(String[] args) {

        List<Apple> inventory = Arrays.asList(new Apple(80, Corlor.GREEN), new Apple(155, Corlor.GREEN),
                new Apple(80, Corlor.RED));

       // List<Apple> greenAppleList = filterApplesByCorlor(inventory, Corlor.GREEN);

        //List<Apple> redAppleList = filterApplesByCorlor(inventory, Corlor.RED);

        ApplePredicate applePredicate = new AppleGreenColorPredicate();

        List<Apple> greenAppleList = filterApples(inventory, applePredicate);



        List<Apple> redAppleAndHeavyList = filterApples(inventory, new AppleRedAndHeavyPredicate());

        List<Apple> redAppleList = filterApples(inventory, new ApplePredicate(){

            @Override
            public boolean test(Apple apple) {
                return Corlor.RED.equals(apple.getColor());
            }
            
        });




        System.out.println(redAppleList);
    }

    static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {

            if (apple.getColor().equals(Corlor.GREEN)) {
                result.add(apple);
            }

        }

        return result;
    }

    static List<Apple> filterApplesByCorlor(List<Apple> inventory, Corlor corlor) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {

            if (apple.getColor().equals(corlor)) {
                result.add(apple);
            }

        }

        return result;
    }


    
    static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {

           if(p.test(apple)){
               result.add(apple);
           }

        }
        return result;
    }

}
