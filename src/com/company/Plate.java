package com.company;

public class Plate {
    private int food;

    public int getFood() {
        return food;
    }

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("еды в тарелке " + food);
    }

    public void decreaseFood(int amount) {
        food -= amount;

    }

    public void addFood(int foodCount) {
        this.food+=foodCount;

    }

    public boolean putMoreFood(int foodCount){
        return getFood()>=foodCount;
    }


}


