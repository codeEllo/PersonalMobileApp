package my.edu.uitm.myoptionmenu;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class BaseActivity extends AppCompatActivity {
         ListView listView;
        GridView gridView;
	    List<Pojo> list;
         List<Pojo2> list2;
	    MyAdapter myAdapter;

    MyAdapter2 myAdapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hobbies);
        gridView = findViewById(R.id.grid_list);
        gridList();
        myAdapter = new MyAdapter(this,list);
        gridView.setAdapter(myAdapter);

        setContentView(R.layout.activity_skills);

        listView = findViewById(R.id.list_view);

        listShow();

        myAdapter2 = new MyAdapter2(this,list2);
        listView.setAdapter(myAdapter2);

    }
    private void gridList() {
        list = new ArrayList<>();
        list.add(new Pojo(R.drawable.ic_wifi, "Wifi"));
        list.add(new Pojo(R.drawable.ic_bluetooth, "Bluetooth"));
        //list.add(new Pojo(R.drawable.ic_storage, "Storage"));
        //list.add(new Pojo(R.drawable.ic_wallpaper, "Wallpaper"));
        // list.add(new Pojo(R.drawable.ic_screen_rotation, "screen Rotation"));
        //list.add(new Pojo(R.drawable.ic_battery_full, "Battery full"));
        //list.add(new Pojo(R.drawable.ic_access_alarm, "Access Alarm"));
        //list.add(new Pojo(R.drawable.ic_access_alarm, "Access Alarm"));
    }


    private void listShow() {
        list2 = new ArrayList<>();
        list2.add(new Pojo2(R.drawable.ic_wifi, "Wifi","This is wifi icon"));
        list2.add(new Pojo2(R.drawable.ic_bluetooth, "Bluetooth","This is wifi icon"));
        //list.add(new Pojo(R.drawable.ic_storage, "Storage"));
        //list.add(new Pojo(R.drawable.ic_wallpaper, "Wallpaper"));
        // list.add(new Pojo(R.drawable.ic_screen_rotation, "screen Rotation"));
        //list.add(new Pojo(R.drawable.ic_battery_full, "Battery full"));
        //list.add(new Pojo(R.drawable.ic_access_alarm, "Access Alarm"));
        //list.add(new Pojo(R.drawable.ic_access_alarm, "Access Alarm"));
    }




    //Creates Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return super.onCreateOptionsMenu(menu);
    }


    //Reads the selected item and takes action (do something)
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id;
        id = item.getItemId();
        Intent i;



        if(id==R.id.mnAboutMe){
            Toast.makeText(this,"The Home Menu is clicked",Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, HomepageActivity.class));

        } else if(id==R.id.btnLogout)
            {
                Toast.makeText(this,"You have successfully been logged out",Toast.LENGTH_SHORT).show();
                i = new Intent(this, LoginActivity.class);
                startActivity(i);
                finish();
        }  else if(id==R.id.mnHobbies) {
            Toast.makeText(this, "The Hobbies Menu is clicked",Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this,HobbiesActivity.class));

        }else if(id==R.id.mnSkills){
            Toast.makeText(this,"The Skills Menu is clicked",Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this,SkillsActivity.class));

        }else if(id==R.id.mnResume){
            Toast.makeText(this,"The Resume Menu is clicked",Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this,ResumeActivity.class));

        }else if(id==R.id.mnUitm){
            Toast.makeText(this,"The UiTM Menu is clicked",Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this,UitmActivity.class));

        }else if(id==R.id.mnStudentPortal){
            Toast.makeText(this,"The Student Portal Menu is clicked",Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this,iStudentActivity.class));
        }
        return super.onOptionsItemSelected(item);

    }
}