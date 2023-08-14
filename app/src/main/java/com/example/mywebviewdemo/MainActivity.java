package com.example.mywebviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void open(View view) {

        EditText txt1=findViewById(R.id.txt1);
        String url=txt1.getText().toString();
        WebView web1=findViewById(R.id.web1);
        web1.loadUrl(url);

    }

    public void load(View view) {
        EditText txt1=findViewById(R.id.txt1);
        String data=txt1.getText().toString();
        WebView web1=findViewById(R.id.web1);
        web1.loadData(data,"text/html","utf-8");



    }
}