package yana.geo.notes;

public class Notes {

    private String dayMeal;
    private String dishTitle;
    private String dayOfWeek;
    private int dishOrder;

    public Notes(String dayMeal, String dishTitle, String dayOfWeek, int dishOrder) {
        this.dayMeal = dayMeal;
        this.dishTitle = dishTitle;
        this.dayOfWeek = dayOfWeek;
        this.dishOrder = dishOrder;
    }

    public String getDayMeal() {
        return dayMeal;
    }

    public String getDishTitle() {
        return dishTitle;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public int getDishOrder() {
        return dishOrder;
    }
}
