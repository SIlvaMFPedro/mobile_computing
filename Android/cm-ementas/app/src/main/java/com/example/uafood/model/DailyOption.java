package com.example.uafood.model;

// IMPORTS
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DailyOption {
    //static public attributes;
    static final public int DAILY_MEAL_LUNCH = 1;
    static final public int DAILY_MEALDINNER = 2;

    // private attributes;
    private Date date;
    private String canteenSite;
    private String dailyMeal;
    private boolean available;
    private List<MealCourse> mealCourseList;

    // Constructor for DailyOption class
    public DailyOption(Date date, String canteenSite, String dailyMeal, boolean available){
        this.date = date;
        this.canteenSite = canteenSite;
        this.dailyMeal = dailyMeal;
        this.available = available;
        mealCourseList = new ArrayList<>();
    }

    // DailyOption add meal course method
    public void addMealCourse(MealCourse mealCourse){
        mealCourseList.add(mealCourse);
    }

    // DailyOption get meal course method
    public List<MealCourse> getMealCourseList() {
        return mealCourseList;
    }

    // DailyOption get date method
    public Date getDate(){
        return date;
    }

    // DailyOption get canteen site method
    public String getCanteenSite(){
        return canteenSite;
    }

    // DailyOption get daily meal method
    public String getDailyMeal(){
        return dailyMeal;
    }

    // DailyOption available method
    public boolean isAvailable(){
        return available;
    }
}
