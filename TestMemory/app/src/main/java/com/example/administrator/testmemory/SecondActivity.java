package com.example.administrator.testmemory;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    private static final String TAG = "test_memory";
    Handler handler;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();
        handler = new Handler(){

            @Override
            public void handleMessage(Message msg) {
                switch (msg.what){
                    case 1:
                        Log.i(TAG, "receive the msg 1");
                        Toast.makeText(SecondActivity.this, "SecondActivityReceiveMessage", Toast.LENGTH_LONG).show();
                        break;

                }
            }
        };
    }

    private void initView() {
        mImageView = (ImageView) findViewById(R.id.second_img);

        findViewById(R.id.second_send_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Message msg = new Message();
                msg.what = 1;
                msg.obj = this;
                handler.sendEmptyMessageDelayed(1, 1000 * 60);
                Toast.makeText(SecondActivity.this, "Send msg delay 1 minutes", Toast.LENGTH_LONG).show();
            }
        });

        findViewById(R.id.second_load_image_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mImageView.setImageResource(R.drawable.meinv_1);
            }
        });

        findViewById(R.id.second_jump_third_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this, ThirdActivity.class));
            }
        });
    }
}
