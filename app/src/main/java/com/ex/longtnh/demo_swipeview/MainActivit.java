package com.ex.longtnh.demo_swipeview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        tao đang test này
        final TextView textView = (TextView)findViewById(R.id.tv);
        textView.setText("Hài hước");
    }
}
