package com.google.myanimation.view;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.myanimation.R;

public class InputActivity extends AppCompatActivity {

    private EditText mInputViw;
    private View mSendBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        initView();
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
    }

    private void initView() {
        mInputViw = (EditText) findViewById(R.id.edit_view);
        mInputViw.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.i("test", "beforeChange； " + s);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.i("test", "onChange: " + s);
                if (s.length() > 0) {
//                    mSendBtn.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.i("test", "afterChange: " + s.toString());
            }
        });
        mSendBtn = findViewById(R.id.send_btn);
        mSendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(InputActivity.this, mInputViw.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }


}
