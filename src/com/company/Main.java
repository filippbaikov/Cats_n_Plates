package com.company;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Cat[] cats = {
        new Cat("a", 60, false),
        new Cat("b", 20, false),
        new Cat("c", 30, false),
        new Cat("d", 15, false),
        new Cat("e", 25, false),
        };
        Plate plate = new Plate(100);
        printInfo(cats,plate);
        haveLunch(cats,plate);
        printInfo(cats,plate);
        addFood(plate);
        System.out.println("plate info  ");
        plate.info();
        System.out.println();
        haveLunch(cats,plate);
        printInfo(cats,plate);
    } private static void addFood(Plate plate){
        Scanner scan=new Scanner(System.in);
        System.out.print("enter new food count: ");
        int foodCount=scan.nextInt();
        plate.addFood(foodCount);
    }
    private static void printInfo(Cat[] cats, Plate plate){
        System.out.println("-------");
        plate.info();
        printInfo(cats);
        System.out.println("--------");
        System.out.println();
    }
    private static void haveLunch (Cat[] cats, Plate plate){
        for (Cat cat: cats){
            boolean result = cat.eat(plate);
            System.out.printf("did cat '%s' eat? Answer : %s%n",cat.getName(), result);
        }
        System.out.println();
    }
    private static void printInfo(Cat...cats){
        for (Cat cat : cats){
            System.out.printf("is cat '%s(appetite: %d)' hungry? Answer: %s%n",
                    cat.getName(), cat.getAppetite(),
                    !cat.isFullness());
        }

    }
}

