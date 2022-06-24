package my.edu.uitm.myoptionmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AboutMe2Activity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me2);

        //Sets "About Me" as label in the App Bar / Action Bar
        getSupportActionBar().setTitle("About Me");

        //Display the Up Button (<--) in the App Bar / Action Bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}