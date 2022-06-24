package my.edu.uitm.myoptionmenu;

import android.os.Bundle;
public class SkillsActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item_skills);
        getSupportActionBar().setTitle("My Expertise");

    }
}