package course.labb.foodplanner_prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;


public class ReceptActivity extends AppCompatActivity {
    CheckBox chkbx_rice, chkbx_meat, chkbx_cream;
    Button btn_recipe, btn_find_recipe;
    String tag = "FoodPlanner";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(tag, "User opened Recipes");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recept);
        setTitle("Recept");

        btn_recipe = findViewById(R.id.btn_recept);
        btn_recipe.setBackgroundColor(Color.DKGRAY);


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
        Log.d(tag, "User pressed Find recipes");
        Intent intent = new Intent(this, ChooseRecipeActivity.class);
        btn_find_recipe = findViewById(R.id.btn_find_recipes);

        chkbx_rice = findViewById(R.id.chkbox_rice);
        chkbx_meat = findViewById(R.id.chkbox_meat);
        chkbx_cream = findViewById(R.id.chkbox_cream);

        if(chkbx_rice.isChecked()) {
            TextView getTxt_rice_weight = findViewById(R.id.txt_rice_weight);
            intent.putExtra("rice", chkbx_rice.getText());
            intent.putExtra("rice_weight", getTxt_rice_weight.getText());
        }
        if (chkbx_meat.isChecked()) {
            TextView getTxt_meat_weight = findViewById(R.id.txt_meat_weight);
            intent.putExtra("meat", chkbx_meat.getText());
            intent.putExtra("meat_weight", getTxt_meat_weight.getText());

        }

        if (chkbx_cream.isChecked()) {
            TextView getTxt_cream_volume = findViewById(R.id.txt_cream_volume);
            intent.putExtra("cream", chkbx_cream.getText());
            intent.putExtra("cream_volume", getTxt_cream_volume.getText());
        }
        startActivity(intent);
    }

    public void setAddProductActivity(View v) {
        Intent switchActivity = new Intent(this, AddProductActivity.class);
        startActivity(switchActivity);
    }

}