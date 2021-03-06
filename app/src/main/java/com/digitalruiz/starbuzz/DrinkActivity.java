package com.digitalruiz.starbuzz;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DrinkActivity extends Activity {

    public static final String EXTRA_DRINKNO = "drinkNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);


    int drinkNo = (Integer)getIntent().getExtras().get(EXTRA_DRINKNO);
    Drink drink = Drink.drinks[drinkNo];

    ImageView photo = (ImageView) findViewById(R.id.photo);
    photo.setImageResource(drink.getImageResourceId());
    photo.setContentDescription(drink.getName());

    TextView name = (TextView) findViewById(R.id.name);
    name.setText(drink.getName());

    TextView description = (TextView) findViewById(R.id.description);
    description.setText(drink.getDescription());

    }
}