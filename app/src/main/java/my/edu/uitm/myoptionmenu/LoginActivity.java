package my.edu.uitm.myoptionmenu;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    DatabaseHelper db;
    EditText email, pass;
    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setTitle("");
        db = new DatabaseHelper(this);
        email = (EditText) findViewById(R.id.etEmail);
        pass = (EditText) findViewById(R.id.etPass);
        button1 = (Button) findViewById(R.id.btnLogin);
        button2 = (Button) findViewById(R.id.btnSignup);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        boolean chk;
        String emel, pwd;
        Intent i;
        switch(v.getId()) {
            case R.id.btnLogin:
                emel = email.getText().toString();
                pwd = pass.getText().toString();

                if (emel.equals("") || pwd.equals(""))
                    Toast.makeText(getApplicationContext(), "Fill the fields are required.", Toast.LENGTH_SHORT).show();
                else {
                    chk = db.chklogin(emel, pwd);
                    if (chk) {
                        Toast.makeText(getApplicationContext(), "You have successfully been login", Toast.LENGTH_SHORT).show();
                        i = new Intent(LoginActivity.this, my.edu.uitm.myoptionmenu.HomepageActivity.class);
                        startActivity(i);
                        finish();
                    } else
                        Toast.makeText(getApplicationContext(), "Username or Password is invalid", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btnSignup:
                // Toast.makeText(getApplicationContext(), "Signup", Toast.LENGTH_SHORT).show();
                i = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(i);
                finish();
        }
    }
}