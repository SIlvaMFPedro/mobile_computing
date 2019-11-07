package com.example.uafood.model;

// IMPORTS
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Holds information for daily menus at the UA's canteens; it  may contain one or several days
 */
public class UAMenus {
    // static public attributes
    static final public int COURSE_ORDER_SOUP = 0;
    static final public int COURSE_ORDER_MEAT_NORMAL = 1;
    static final public int COURSE_ORDER_FISH_NORMAL = 2;

    // private attributes
    private List<DailyOption> dailyMenusPerCanteen = new ArrayList<>();

    // UAMenus get daily option menus method
    public List<DailyOption> getDailyMenusPerCanteen(){
        return dailyMenusPerCanteen;
    }

    // UAMenus add daily option method
    public void add(DailyOption dailyOption){
        this.getDailyMenusPerCanteen().add(dailyOption);
    }

    /**
     * Dumps the content of the object into a string for logging/dubbuging
     * @return the contents as String
     */
    public String formatedContentsForDebugging(){
        SimpleDateFormat dateFormater = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        StringBuilder builder = new StringBuilder();
        for (DailyOption option : this.getDailyMenusPerCanteen()) {
            builder.append("\nDay: ");
            builder.append(dateFormater.format(option.getDate()));
            builder.append("\nCanteen: ");
            builder.append(option.getCanteenSite());
            builder.append("\nMeal type: ");
            builder.append(option.getDailyMeal());
            builder.append("\nIs open? ");
            builder.append(option.isAvailable());
            builder.append("\n");
            for (MealCourse mealOption: option.getMealCourseList() ) {
                builder.append("\nCourse: ");   builder.append(mealOption.getMealCourseOrder());
                builder.append("\nmeal: ");   builder.append(mealOption.getFoodOptionDescription());
                builder.append("\n");
            }
        }
        return builder.toString();
    }
}
