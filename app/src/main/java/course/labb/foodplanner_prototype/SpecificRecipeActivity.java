package course.labb.foodplanner_prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SpecificRecipeActivity extends AppCompatActivity {
String tag = "FoodPlanner";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specific_recipe);
        setTitle("Valt recept");

        String specificRecipe = getIntent().getStringExtra("val"); // Här kan valt recept utnyttjas
        Log.d(tag, "User opened specific recipe: " + specificRecipe);
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