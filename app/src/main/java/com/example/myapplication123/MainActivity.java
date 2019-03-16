package com.example.myapplication123;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    LinearLayout btn1;
    LinearLayout btn2;
    LinearLayout btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.boton1);
        btn2 = findViewById(R.id.boton_2);
        btn3 = findViewById(R.id.boton_3);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int[] red = {R.color.color1, R.color.color2, R.color.color3, R.color.color4, R.color.color5, R.color.color6};

        int[] green = {R.color.color7,R.color.color8,R.color.color9,R.color.color18,R.color.color10,R.color.color11};

        int[] purple = {R.color.color12,R.color.color13,R.color.color14,R.color.color15,R.color.color16,R.color.color17};

        int viewId = v.getId();

        Log.i("id ",viewId+"");

        switch (viewId){
            case R.id.boton1:
                btn1.setBackgroundResource(red[(int) Math.floor(Math.random()*6)]);
                break;
            case R.id.boton_2:
                btn2.setBackgroundResource(green[(int) Math.floor(Math.random()*6)]);
                break;
            case R.id.boton_3:
                btn3.setBackgroundResource(purple[(int) Math.floor(Math.random()*6)]);
                break;
        }
    }
}
