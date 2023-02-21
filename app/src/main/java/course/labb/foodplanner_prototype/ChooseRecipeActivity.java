package course.labb.foodplanner_prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

public class ChooseRecipeActivity extends AppCompatActivity {
ListView listView;
boolean emptyRice, emptyMeat, emptyCream;

String tag = "FoodPlanner";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(tag, "User opened Choose recipe");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_recipe);
        setTitle("Välj recept");

        listView = findViewById(R.id.listview_recipes);

        if(listView.getItemAtPosition(0) != null) {
            Log.i(tag, "Successfully recieved recipes from API");
        }

        emptyRice = getIntent().getStringExtra("rice").isEmpty();
        emptyCream = getIntent().getStringExtra("cream").isEmpty();
        emptyMeat = getIntent().getStringExtra("meat").isEmpty();

        if (!emptyRice && !emptyMeat && !emptyCream) {
            listView.setOnItemClickListener((adapterView, view, i, l) -> {

                Intent intent = new Intent(this, SpecificRecipeActivity.class);
                String selectedItem = (String) adapterView.getItemAtPosition(i);
                Log.d(tag, "User choose recipe" + selectedItem);
                intent.putExtra("val", selectedItem); // Skickar med valt recept
                startActivity(intent);
            });
        }


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