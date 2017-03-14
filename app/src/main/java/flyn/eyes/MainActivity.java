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
        Button btn_statusbar_color = (Button) findViewById(R.id.btn_statusbar_color);
        Button btn_statusbar_color_toolbar = (Button) findViewById(R.id.btn_statusbar_color_toolbar);
        Button btn_statusbar_translucent = (Button) findViewById(R.id.btn_statusbar_translucent);
        Button btn_statusbar_color_coordinator = (Button) findViewById(R.id.btn_statusbar_color_coordinator);
        Button btn_statusbar_translucent_coordinator = (Button) findViewById(R.id.btn_statusbar_translucent_coordinator);

        btn_statusbar_color.setOnClickListener(this);
        btn_statusbar_color_toolbar.setOnClickListener(this);
        btn_statusbar_translucent.setOnClickListener(this);
        btn_statusbar_color_coordinator.setOnClickListener(this);
        btn_statusbar_translucent_coordinator.setOnClickListener(this);
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
        }
        startActivity(intent);
    }
}
