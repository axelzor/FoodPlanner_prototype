package course.labb.foodplanner_prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class SpecificIngredientActivity extends AppCompatActivity {
TextView theIngredient, theOutDate, theBoughtDate;
String incomingIngredient, boughtDate, outDate;
String tag = "FoodPlanner";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        incomingIngredient = getIntent().getStringExtra("val");
        Log.d(tag, "User opened specific ingredient: " + incomingIngredient);
        setTitle(incomingIngredient);
        boughtDate = getIntent().getStringExtra("bought");
        outDate = getIntent().getStringExtra("out");


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specific_ingredient);
        theIngredient = findViewById(R.id.txt_ingredient);
        theBoughtDate = findViewById(R.id.txt_bought);
        theOutDate = findViewById(R.id.txt_out);
        theIngredient.setText(incomingIngredient);
        theBoughtDate.setText(boughtDate);
        theOutDate.setText(outDate);

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

    public void onRemoveClick(View v) {
        // Här kan föremålet tas bort
        Log.d(tag,"User is removing item");
        //Log.i(tag, "User successfully removed item");
    }
    public void onSaveClick(View v) {
        // Här kan ny volym eller kvantitet sparas.
        Log.d(tag,"User is saving changes");
        // Log.i(tag, "Successfully changed item");
    }
    public void onChangeClick(View v) {
        Log.d(tag,"User is changing quantity");
    }
}