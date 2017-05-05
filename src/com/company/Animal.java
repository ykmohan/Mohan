package com.company;

/**
 * Created by krishna mahidhar on 05-05-2017.
 */
public class Animal {
    //name,type,food
    private String name;
    private String type;
    private String food;
    private int age;

    public Animal(){

    }

     public Animal(String name,String type,String food){
     this.food=food;
     this.name=name;
     this.type=type;
    }

    void eat(){
        System.out.print(name+"is a" + food);
    }
    void live(){
        System.out.print(name + "is a "+ type);
    }
    static void test(){
        System.out.println("Hello Static");
    }
     int getAge(){
        return this.age;
    }
     void setAge(int age){
        this.age = age;
    }
    private String getFood(){
        return this.food;

    }
    private void setFood(String food){
        this.food=food;
    }


  }