package com.example.ex7_web;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    WebView wV1;
    String stringUrl;
    EditText UrlEditText;
    Button LoadButton;
    String web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wV1 = findViewById(R.id.wV1);
        UrlEditText = findViewById(R.id.urlEditText);
        LoadButton = findViewById(R.id.loadButton);


    }

    public void btn1(View view) {
        web=UrlEditText.getText().toString();
        wV1.loadUrl(web);
    }

}