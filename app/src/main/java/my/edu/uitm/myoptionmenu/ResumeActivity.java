package my.edu.uitm.myoptionmenu;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
public class ResumeActivity extends BaseActivity {

    WebView view;
    WebSettings webSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);

        getSupportActionBar().setTitle("Resume");
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        view = (WebView)findViewById(R.id.resume_view);

        view.setWebViewClient(new WebViewClient());
        view.loadUrl("file:///android_asset/Resume Exercise.html");

        webSettings=view.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }
}