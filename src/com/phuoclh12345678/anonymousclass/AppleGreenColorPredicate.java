/*
*  created date: Sep 24, 2021
*  author: cgm
*/
package com.phuoclh12345678.anonymousclass;

public class AppleGreenColorPredicate implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {
        return Corlor.GREEN.equals(apple.getColor());//true
    }
    
}
