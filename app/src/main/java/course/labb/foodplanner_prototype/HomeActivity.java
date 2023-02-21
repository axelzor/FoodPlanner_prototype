package course.labb.foodplanner_prototype;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

public class HomeActivity extends AppCompatActivity {
CoordinatorLayout layout;
Intent intent;
String tag = "FoodPlanner";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(tag, "User is on the Home page");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setTitle("Hemma");
        layout = findViewById(R.id.coordinatorLayout);

        Snackbar.make(layout, R.string.items_near_date, Snackbar.LENGTH_LONG).setAction(R.string.show, view -> {
            Log.d(tag, "User pressed the snackbar telling the user that items are near expiration date");
            intent = new Intent(getApplicationContext(), NearDateActivity.class);
            startActivity(intent);
        }).setActionTextColor(getColor(R.color.white)).show();

        /* För att visa att en vara lagts till
        Snackbar.make(layout, R.string.new_items, Snackbar.LENGTH_LONG).setAction(R.string.show, view -> {
            Log.d(tag, "User pressed the snackbar telling the user that items are near expiration date");
            intent = new Intent(getApplicationContext(), AddProductActivity.class);
            startActivity(intent);

        }).setActionTextColor(getColor(R.color.white)).show();
        */


    }



    public void setHomeActivity(View v) {
        Intent switchActivity = new Intent(this, HomeActivity.class);
        startActivity(switchActivity);
    }
    public void setSettingsActivity(View v) {
        Intent switchActivity = new Intent(this, SettingsActivity.class);
        startActivity(switchActivity);
    }
    public void setMatHemmaActivity(View v) {
        Intent switchActivity = new Intent(this, MatHemmaActivity.class);
        startActivity(switchActivity);
    }
    public void setReceptActivity(View v) {
        Intent switchActivity = new Intent(this, ReceptActivity.class);
        startActivity(switchActivity);
    }

    public void setInkopActivity(View v) {
        Intent switchActivity = new Intent(this, InkopActivity.class);
        startActivity(switchActivity);
    }

    public void setAddProductActivity(View v) {
        Intent switchActivity = new Intent(this, AddProductActivity.class);
        startActivity(switchActivity);
    }
}