package my.edu.uitm.myoptionmenu;

import android.os.Bundle;

public class HobbiesActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);
        getSupportActionBar().setTitle("Hobbies");
    }
}
