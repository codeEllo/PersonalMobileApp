package my.edu.uitm.myoptionmenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomepageActivity extends BaseActivity {

    //Declares btnNext as type of Button
    Button btnNext;
    //TextView textView, textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        //Sets "Home" as label in the App Bar / Action Bar
        getSupportActionBar().setTitle("Home");

        //Links btnNext (Java) to the btnAboutMe (XML)
        btnNext = (Button) findViewById(R.id.btnAboutMe);

        //Registers the btnNext as ClickListener (Event Handler)
        //Clicking on the button to move to other screen (AboutMe2Activity
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;

                //HomepageActivity.this is the current activity
                //and AboutMe2Activity.class is the next activity
                intent = new Intent(HomepageActivity.this, AboutMe2Activity.class);
                startActivity(intent);
                //finish();
            }
        });
    }
}