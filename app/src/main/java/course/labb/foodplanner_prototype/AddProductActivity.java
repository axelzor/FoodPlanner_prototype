package course.labb.foodplanner_prototype;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ListView;


public class AddProductActivity extends AppCompatActivity {
    ListView listView;
    String tag = "FoodPlanner";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(tag, "User opened Add Product");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);
        setTitle("Lägg till vara");
        listView = findViewById(R.id.listview_add_product);
        listView.setAdapter(new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_single_choice,
                getResources().getStringArray(R.array.ingredients)));

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

    public void onClick(View v) {
        // Här öppnar vi kamera app
        Log.d(tag, "User opened camera");
    }

    public void setAddProductActivity(View v) {
        Intent switchActivity = new Intent(this, AddProductActivity.class);
        startActivity(switchActivity);
    }

    public void onAddItemClick(View v) {
        Log.d(tag, "User added items");
    }

}