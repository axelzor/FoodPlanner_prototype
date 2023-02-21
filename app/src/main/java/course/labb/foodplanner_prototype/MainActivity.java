package course.labb.foodplanner_prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * FoodPlanner application for organizing your food!
 *
 * @author Axel Starck
 * @version 1.0
 * @since 17 february 2023
 */


public class MainActivity extends AppCompatActivity {
    String tag = "FoodPlanner";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Logga in");
    }

    public void buttonClick(View v) {
        Log.d(tag, "User clicked on sign in with user credentials");
        Intent switchActivity = new Intent(this, HomeActivity.class);
        startActivity(switchActivity);
        Log.i(tag, "User successfully logged in and is on the home page");
    }
    public void buttonGoogleClick(View v) {
        //Här kommer användaren logga in via Google
        Log.d(tag, "User clicked on Sign In With Google");
    }

    public void buttonFacebookClick(View v) {
        //Här loggar användaren in via Facebook
        Log.d(tag, "User clicked on Sign In With Facebook");
    }

}