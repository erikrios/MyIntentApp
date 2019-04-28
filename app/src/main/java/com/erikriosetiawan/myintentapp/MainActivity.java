package com.erikriosetiawan.myintentapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonMoveActivity;
    Button buttonMoveWithDataActivity;
    Button buttonDialPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMoveActivity = findViewById(R.id.btn_move_activity);
        buttonMoveActivity.setOnClickListener(this);

        buttonMoveWithDataActivity = findViewById(R.id.btn_move_activity_data);
        buttonMoveWithDataActivity.setOnClickListener(this);

        buttonDialPhone = findViewById(R.id.btn_dial_number);
        buttonDialPhone.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch(v.getId()) {
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_move_activity_data:
                Intent moveWithDataIntent = new Intent(MainActivity.this, MoveWithDataActivity.class);
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "Erik Rio Setiawan");
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 21);
                startActivity(moveWithDataIntent);
                break;
            case R.id.btn_dial_number:
                String phoneNumber = "083854050592";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhoneIntent);
                break;
        }
    }
}
