package com.company;

/**
 * Created by krishna mahidhar on 05-05-2017.
 */
public class Car {
    //maxSpeed colour weight,brand,model
    float maxSpeed;
    String colour;
    float weight;
    String brand;

    public Car() {
        System.out.print("Hello Constructor\n");
    }

    public Car(float maxSpeed, String colour, float weight, String brand) {
        this.maxSpeed = maxSpeed;
        this.colour = colour;
        this.weight = weight;
        this.brand = brand;
    }

    /*
    * Benz BMW Audi -> Cars
    * Lion Deer Tiger -> Animals*/

    void start(){
        System.out.println("car is starting"+Main.name);
        System.out.println(brand);
        System.out.println(maxSpeed);

    }
    void stop(){
        System.out.println("the car has been stopped");
    }
}
