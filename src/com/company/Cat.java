package com.company;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public Cat(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
    }


    public boolean eat(Plate plate) {
       String validateMessage=chekEat(plate);
       if(validateMessage !=null){
           System.out.println(validateMessage);
           return false;
       }
    doEat(plate);
    fullness=true;
    return true;
    }
       private String chekEat (Plate plate){
           if (!plate.putMoreFood(appetite)){
               return "food is not enough in plate";
           }
           if (fullness){
               return "Cat is already satiety!";

           }
           return null;
        }
        private void doEat(Plate plate){
        plate.decreaseFood(appetite);
  }
  public boolean isFullness(){
        return fullness;
  }
}
