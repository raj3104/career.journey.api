package com.raj.career.journey.api.model;

public class Profile {

    private String name;
    private  int age;
    private String college;
    private String goal;


    public Profile(String name,int age, String college,String goal){
        this.name=name;
        this.age=age;
        this.college=college;
        this.goal=goal;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCollege() {
        return college;
    }

    public String getGoal() {
        return goal;
    }
}
