package course.labb.foodplanner_prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

public class InkopActivity extends AppCompatActivity {
    String tag = "FoodPlanner";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(tag, "User opened Inköp");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inkop);
        setTitle("Inköpslista");
        Button button = findViewById(R.id.btn_inkop);
        ListView listView = findViewById(R.id.list_shopping_list);
        listView.setAdapter(new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_single_choice,
                getResources().getStringArray(R.array.shopping_list)));

        if (listView.getItemAtPosition(0) != null) {
            Log.i(tag, "Successfully receieved items from database");
        }

        button.setBackgroundColor(Color.DKGRAY);



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

    public void onClick(View v) {
        // Här kan varor tas bort från inköpslistan
        Log.d(tag, "User saved changes for the list");
    }
}