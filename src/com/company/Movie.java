package com.company;

/**
 * Created by krishna mahidhar on 08-05-2017.
 */
public class Movie {
    private String name;
    private String date;
    private String director;
    private float budget;

    public Movie(String name, String date, String director, float budget) {
        this.name = name;
        this.date = date;
        this.director = director;
        this.budget = budget;
    }

    void play() {
        System.out.println("<<<<<Welcome to the movie>>>>>");
        System.out.println("The name of the movie is: " + name);
        System.out.println("Release date: " + date);
        System.out.println("Name of the director: " + director);
        System.out.println("Movie budget is: " + budget);
    }

    void setName(String name) {
        this.name = name;
    }
        void setDate(String date){
        this.date= date;
        }
    void setDirector(String director ){
            this.director= director;
    }
     void setBudget(float budget){
        this.budget=budget;

     }
}