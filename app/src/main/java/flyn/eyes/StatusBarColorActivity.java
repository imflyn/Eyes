package flyn.eyes;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

import flyn.StatusBarUtil;

public class StatusBarColorActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statusbar_color);
        getSupportActionBar().setTitle("StatusBarColorByCodes");

        StatusBarUtil.setStatusBarColor(this, ContextCompat.getColor(this, R.color.colorAccent));
    }
}
