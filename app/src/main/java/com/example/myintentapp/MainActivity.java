package com.example.myintentapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMoveActiviy = findViewById(R.id.btn_move_activity);
        btnMoveActiviy.setOnClickListener(this);

        Button btnMoveWithActivityData = findViewById(R.id.btn_move_activity_data);
        btnMoveWithActivityData.setOnClickListener(this);

        Button btnDialPhone = findViewById(R.id.btn_dial_number);
        btnDialPhone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_move_activity_data:
                Intent moveWithDataIntent = new Intent(MainActivity.this, MoveWithDataActivity.class);
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "Faqih Yugos");
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 5);
                startActivity(moveWithDataIntent);
                break;
            case R.id.btn_dial_number:
                String phoneNumber = "081223456754";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhoneIntent);
                break;
        }
    }
}
