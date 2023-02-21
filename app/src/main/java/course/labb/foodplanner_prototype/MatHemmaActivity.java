package course.labb.foodplanner_prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MatHemmaActivity extends AppCompatActivity {
    ListView listView;
    Button button;
    String tag = "FoodPlanner";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(tag, "User opened Mat Hemma");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mat_hemma);
        setTitle("Mat där hemma");
        listView = findViewById(R.id.list_ingredients);

        if (listView.getItemAtPosition(0) != null) {
            Log.i(tag, "Successfully retrieved items from database");
        }

        listView.setOnItemClickListener((adapterView, view, i, l) -> {

            Intent intent = new Intent(this, SpecificIngredientActivity.class);
            String selectedItem = (String) adapterView.getItemAtPosition(i);
            Log.d(tag, "User clicked on item: " + selectedItem);
            intent.putExtra("val", selectedItem);
            intent.putExtra("bought", "27-01-23");
            intent.putExtra("out", "3-02-23");
            startActivity(intent);
        });
        button = findViewById(R.id.btn_mat_hemma);

        button.setBackgroundColor(Color.DKGRAY);


    }

    public void onSearchClick(View v) {
        Log.d(tag,"User clicked on Search");
    }
    public void setHomeActivity(View v) {
        Log.d(tag, "User clicked on Home");
        Intent switchActivity = new Intent(this, HomeActivity.class);
        startActivity(switchActivity);
    }
    public void setSettingsActivity(View v) {
        Log.d(tag, "User clicked on Settings");
        Intent switchActivity = new Intent(this, SettingsActivity.class);
        startActivity(switchActivity);
    }
    public void setMatHemmaActivity(View v) {
        Log.d(tag, "User clicked on Mat där hemma");
        Intent switchActivity = new Intent(this, MatHemmaActivity.class);
        startActivity(switchActivity);
    }
    public void setReceptActivity(View v) {
        Log.d(tag, "User clicked on Recipes");
        Intent switchActivity = new Intent(this, ReceptActivity.class);
        startActivity(switchActivity);
    }

    public void setInkopActivity(View v) {
        Log.d(tag, "User clicked on Inköp");
        Intent switchActivity = new Intent(this, InkopActivity.class);
        startActivity(switchActivity);
    }

    public void setAddProductActivity(View v) {
        Log.d(tag, "User clicked on Add Product");
        Intent switchActivity = new Intent(this, AddProductActivity.class);
        startActivity(switchActivity);
    }


}