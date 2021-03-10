package com.p.mynicestart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * Esta pantalla permite volver al MainActivity
 * @author pablo
 */
public class ChatBotActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatbot);

        WebView myWebView = findViewById(R.id.webview);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl("https://console.dialogflow.com/api-client/demo/embedded/9af39dcd-6f7d-47bb-8c1f-55ef222c2358");
    }
}