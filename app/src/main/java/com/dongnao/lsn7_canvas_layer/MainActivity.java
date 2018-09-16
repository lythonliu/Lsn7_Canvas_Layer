package com.dongnao.lsn7_canvas_layer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends com.lythonliu.LinkAppCompatActivity {

    @Override
    public String getAppName(){
        return BuildConfig.APP_NAME;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //setContentView(new MyView(MainActivity.this));
        setContentView(new MyView3(MainActivity.this));
    }
}
