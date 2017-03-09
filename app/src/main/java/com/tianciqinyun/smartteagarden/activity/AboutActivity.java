package com.tianciqinyun.smartteagarden.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

import com.tianciqinyun.smartteagarden.R;

public class AboutActivity extends AppCompatActivity {

    private static final String TAG = "AboutActivity";
    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        TextView title = (TextView) findViewById(R.id.toolbar_title);
        toolbar.setTitle("");
        toolbar.setNavigationIcon(R.drawable.back);
        setSupportActionBar(toolbar);
        title.setText("关于我们");

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        //设置WebView
        mWebView = (WebView) findViewById(R.id.web);
        mWebView.setBackgroundColor(getResources().getColor(R.color.activity_background_color)); // 设置背景色
        mWebView.getBackground().setAlpha(2); // 设置填充透明度 范围：0-255
        mWebView.loadUrl("file:///android_asset/web/Html/introduce.html");

    }

}
