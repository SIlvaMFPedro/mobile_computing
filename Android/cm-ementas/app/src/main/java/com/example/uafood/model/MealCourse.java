package com.example.uafood.model;

public class MealCourse {
    // private attributes
    private int courseOrder;
    private String foodOptionDescription;

    // Constructor for MealCourse class
    public MealCourse(int courseOrder, String foodOptionDescription){
        this.courseOrder = courseOrder;
        this.foodOptionDescription = foodOptionDescription;
    }

    // MealCourse get meal course order method
    public int getMealCourseOrder(){
        return courseOrder;
    }

    // MealCourse get food option description method
    public String getFoodOptionDescription(){
        return foodOptionDescription;
    }
}
