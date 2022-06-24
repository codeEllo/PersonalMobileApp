package my.edu.uitm.myoptionmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class iStudentActivity extends BaseActivity {

    //Declares the references
    WebView wv;
    WebSettings ws;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_istudentportal);

        //Sets "UiTM" as label in the App Bar / Action Bar
        getSupportActionBar().setTitle("UiTM Official Website");

        //Links wv (Java) to the wvUitm (XML)
        wv = (WebView) findViewById(R.id.wvUitm);

        //Sets wv to WebViewClient
        wv.setWebViewClient(new WebViewClient());

        //Loads the specified url
        wv.loadUrl("https://simsweb.uitm.edu.my/SPORTAL_APP/SPORTAL_LOGIN/index.htm");

        //Enables the JavaScript
        ws = wv.getSettings();
        ws.setJavaScriptEnabled(true);

    }

    //Handles the navigation of the website (when clicking on the back button)
    @Override
    public void onBackPressed() {
        if(wv.canGoBack())
            wv.goBack();
        else
            super.onBackPressed();
    }
}