package com.example.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import java.util.ArrayList;

public class MainActivityWeek3 extends AppCompatActivity implements AdapterView.OnItemClickListener{


    private final static String TAG = MainActivity.class.getSimpleName();

    private static final String BASE_URL = "https://www.uplips.com/\n";
    //private ArrayList<String> androidVersion;
    String[] androidVersion ;
    private ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_week3);

        WebView webView = findViewById(R.id.webView);
        WebSettings webSettings = webView.getSettings();

        webSettings.setJavaScriptEnabled(true);

        webView.loadUrl(BASE_URL);

        androidVersion= getResources().getStringArray(R.array.data);

        Spinner androidVersionsSpinner = findViewById(R.id.android_versions_spinner);
//        adapter=getAdapter();
        androidVersionsSpinner.setAdapter(adapter);
    }


    private ArrayList<String> getDataSource(){
        ArrayList<String> androidVersions = new ArrayList<>();

        androidVersions.add("Cupcake");
        androidVersions.add("Lollipop");
        androidVersions.add("JellyBean");
        androidVersions.add("Oreo");
        androidVersions.add("KitKat");
        return androidVersions;
    }

//    private ArrayAdapter<String> getAdapter(){
//        return new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, androidVersion);
//    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Log.d(TAG,"position "+ position);
    }
}
