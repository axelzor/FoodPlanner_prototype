package course.labb.foodplanner_prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SettingsActivity extends AppCompatActivity {
    String tag = "FoodPlanner";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(tag, "User opened Settings");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        setTitle("Inställningar");

        // Lägg till shared preferences

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

    public void onSaveClick(View v) {
        Log.d(tag, "User clicked on Save settings");
        Intent switchActivity = new Intent(this, HomeActivity.class);
        startActivity(switchActivity);
        Log.i(tag, "User successfully saved settings");
    }
    public void onLogoutClick(View v) {
        Log.d(tag, "User clicked on Logout");
        Intent switchActivity = new Intent(this, MainActivity.class);
        startActivity(switchActivity);
        Log.i(tag, "User successfully logged out");
    }

    public void setAddProductActivity(View v) {
        Intent switchActivity = new Intent(this, AddProductActivity.class);
        startActivity(switchActivity);
    }
}