/*
*  created date: Sep 24, 2021
*  author: cgm
*/
package com.phuoclh12345678.anonymousclass;

public class Apple {
    private int weight = 0;
    private Corlor color;

    public Apple(int weight, Corlor color) {
      this.weight = weight;
      this.color = color;
    }

    public int getWeight() {
      return weight;
    }

    public void setWeight(int weight) {
      this.weight = weight;
    }

    public Corlor getColor() {
      return color;
    }

    public void setColor(Corlor color) {
      this.color = color;
    }

    @SuppressWarnings("boxing")
    @Override
    public String toString() {
      return String.format("Apple{color='%s', weight=%d}", color, weight);
    }
}
