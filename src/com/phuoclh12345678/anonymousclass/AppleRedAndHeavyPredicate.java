/*
*  created date: Sep 24, 2021
*  author: cgm
*/
package com.phuoclh12345678.anonymousclass;

public class AppleRedAndHeavyPredicate implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {
        
        return Corlor.RED.equals(apple.getColor()) &&
            apple.getWeight() > 150;
    }
    
}
