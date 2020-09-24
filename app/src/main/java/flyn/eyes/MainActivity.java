package flyn.eyes;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_statusbar_color = findViewById(R.id.btn_statusbar_color);
        Button btn_statusbar_color_toolbar = findViewById(R.id.btn_statusbar_color_toolbar);
        Button btn_statusbar_translucent = findViewById(R.id.btn_statusbar_translucent);
        Button btn_statusbar_color_coordinator = findViewById(R.id.btn_statusbar_color_coordinator);
        Button btn_statusbar_translucent_coordinator = findViewById(R.id.btn_statusbar_translucent_coordinator);
        Button btn_statusbar_translucent_coordinator_drawerlayout = findViewById(R.id.btn_statusbar_translucent_coordinator_drawerlayout);
        Button btn_statusbar_white = findViewById(R.id.btn_statusbar_white);
        Button btn_statusbar_white_toolbar = findViewById(R.id.btn_statusbar_white_toolbar);
        Button btn_statusbar_white_coordinator = findViewById(R.id.btn_statusbar_white_coordinator);

        btn_statusbar_color.setOnClickListener(this);
        btn_statusbar_color_toolbar.setOnClickListener(this);
        btn_statusbar_translucent.setOnClickListener(this);
        btn_statusbar_color_coordinator.setOnClickListener(this);
        btn_statusbar_translucent_coordinator.setOnClickListener(this);
        btn_statusbar_translucent_coordinator_drawerlayout.setOnClickListener(this);
        btn_statusbar_white.setOnClickListener(this);
        btn_statusbar_white_toolbar.setOnClickListener(this);
        btn_statusbar_white_coordinator.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.btn_statusbar_color:
                intent.setClass(this, StatusBarColorActivity.class);
                break;
            case R.id.btn_statusbar_color_toolbar:
                intent.setClass(this, StatusBarColorToolBarActivity.class);
                break;
            case R.id.btn_statusbar_translucent:
                intent.setClass(this, StatusBarTranslucent.class);
                break;
            case R.id.btn_statusbar_color_coordinator:
                intent.setClass(this, StatusBarColorCoordinatorActivity.class);
                break;
            case R.id.btn_statusbar_translucent_coordinator:
                intent.setClass(this, StatusBarTranslucentCoordinatorActivity.class);
                break;
            case R.id.btn_statusbar_translucent_coordinator_drawerlayout:
                intent.setClass(this, StatusBarTranslucentCoordinatorDrawerLayoutActivity.class);
                break;
            case R.id.btn_statusbar_white:
                intent.setClass(this, StatusBarWhiteActivity.class);
                break;
            case R.id.btn_statusbar_white_toolbar:
                intent.setClass(this, StatusBarWhiteToolBarActivity.class);
                break;
            case R.id.btn_statusbar_white_coordinator:
                intent.setClass(this, StatusBarWhiteCoordinatorActivity.class);
                break;
        }
        startActivity(intent);
    }
}
