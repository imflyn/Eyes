package flyn.eyes;


import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import flyn.StatusBarUtil;

public class StatusBarWhiteCoordinatorActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statusbar_white_coordinator);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("StatusBar White whith CoordinatorLayout");

        AppBarLayout mAppBarLayout = findViewById(R.id.appbar);
        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.collapsing_layout);
        collapsingToolbarLayout.setTitle(getString(R.string.app_name));

        StatusBarUtil.setStatusBarLightForCollapsingToolbar(this, mAppBarLayout, collapsingToolbarLayout, toolbar, Color.WHITE);
    }
}
