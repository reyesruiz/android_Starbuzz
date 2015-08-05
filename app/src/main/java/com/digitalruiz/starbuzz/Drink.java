package com.digitalruiz.starbuzz;

/**
 * Created by reyes on 8/4/15.
 */
public class Drink {
    private String name;
    private String description;
    private int imageResorceId;

    //drinks in an array of Drinks
    public static final Drink[] drinks = {
            new Drink("Latte", "A couple of espresso shots with steamed milk", R.drawable.latte),
            new Drink("Cappucccino", "Espresso, hot milk, and steamed milk foam", R.drawable.cappuccino),
            new Drink("Filter", "Highest quality beans roasted and brewed fresh", R.drawable.filter)
    };

    //Each drink has a name, description, and an image resource
    private Drink(String name, String description, int imageResorceId) {
        this.name = name;
        this.description = description;
        this.imageResorceId = imageResorceId;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResorceId;
    }

    public String toString() {
        return this.name;
    }
 }
