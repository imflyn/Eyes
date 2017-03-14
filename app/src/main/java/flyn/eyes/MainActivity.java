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
        Button btn_statusbar_color_xml = (Button) findViewById(R.id.btn_statusbar_color_xml);
        Button btn_statusbar_color_toolbar = (Button) findViewById(R.id.btn_statusbar_color_toolbar);


        btn_statusbar_color.setOnClickListener(this);
        btn_statusbar_color_xml.setOnClickListener(this);
        btn_statusbar_color_toolbar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.btn_statusbar_color:
                intent.setClass(this, StatusBarColorActivity.class);
                break;
            case R.id.btn_statusbar_color_xml:
                intent.setClass(this, StatusBarColorXMLActivity.class);
                break;
            case R.id.btn_statusbar_color_toolbar:
                intent.setClass(this, StatusBarColorToolBarActivity.class);
                break;
        }
        startActivity(intent);
    }
}
