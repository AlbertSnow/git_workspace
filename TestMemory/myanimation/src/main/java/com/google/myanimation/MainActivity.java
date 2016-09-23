package com.google.myanimation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

import com.google.myanimation.view.MyView;

public class MainActivity extends Activity {

    SeekBar radiusBar, innerRadiusBar;
    MyView myView;

    SeekBar ptBar;
    TextView textPt;
    final static int MIN_PT = 3;

    RadioButton optLayerTypeNone, optLayerTypeSoftware, optLayerTypeHardware;
    TextView textLayerInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radiusBar = (SeekBar) findViewById(R.id.radiusbar);
        innerRadiusBar = (SeekBar)findViewById(R.id.innerradiusbar);
        myView = (MyView) findViewById(R.id.myview);
        float defaultRatio = (float) (radiusBar.getProgress())
                / (float) (radiusBar.getMax());
        myView.setShapeRadiusRatio(defaultRatio);
        float defaultInnerRatio = (float) (innerRadiusBar.getProgress())
                / (float) (innerRadiusBar.getMax());
        myView.setShapeInnerRadiusRatio(defaultInnerRatio);

        radiusBar.setOnSeekBarChangeListener(radiusBarOnSeekBarChangeListener);
        innerRadiusBar.setOnSeekBarChangeListener(innerRadiusBarOnSeekBarChangeListener);

        textPt = (TextView)findViewById(R.id.pttext);
        ptBar = (SeekBar)findViewById(R.id.ptbar);
        ptBar.setOnSeekBarChangeListener(ptBarOnSeekBarChangeListener);

        optLayerTypeNone = (RadioButton)findViewById(R.id.typeNone);
        optLayerTypeSoftware = (RadioButton)findViewById(R.id.typeSoftware);
        optLayerTypeHardware = (RadioButton)findViewById(R.id.typeHardware);
        textLayerInfo = (TextView)findViewById(R.id.typeinfo);

        myView.passElements(textLayerInfo);
        myView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);

        optLayerTypeNone.setOnCheckedChangeListener(optLayerTypeOnCheckedChangeListener);
        optLayerTypeSoftware.setOnCheckedChangeListener(optLayerTypeOnCheckedChangeListener);
        optLayerTypeHardware.setOnCheckedChangeListener(optLayerTypeOnCheckedChangeListener);
    };

    OnCheckedChangeListener optLayerTypeOnCheckedChangeListener =
            new OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(CompoundButton buttonView,
                                             boolean isChecked) {
                    if(optLayerTypeNone.isChecked()){
                        myView.setLayerType(View.LAYER_TYPE_NONE, null);
                    }else if(optLayerTypeSoftware.isChecked()){
                        myView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
                    }else{
                        myView.setLayerType(View.LAYER_TYPE_HARDWARE, null);
                    }

                    myView.invalidate();
                }};

    OnSeekBarChangeListener radiusBarOnSeekBarChangeListener =
            new OnSeekBarChangeListener() {

                @Override
                public void onProgressChanged(SeekBar seekBar, int progress,
                                              boolean fromUser) {
                    float ratio = (float) (radiusBar.getProgress())
                            / (float) (radiusBar.getMax());
                    myView.setShapeRadiusRatio(ratio);
                    myView.invalidate();
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {}

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {}

            };

    OnSeekBarChangeListener innerRadiusBarOnSeekBarChangeListener =
            new OnSeekBarChangeListener() {

                @Override
                public void onProgressChanged(SeekBar seekBar, int progress,
                                              boolean fromUser) {
                    float ratio = (float) (innerRadiusBar.getProgress())
                            / (float) (innerRadiusBar.getMax());
                    myView.setShapeInnerRadiusRatio(ratio);
                    myView.invalidate();
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {}

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {}

            };

    OnSeekBarChangeListener ptBarOnSeekBarChangeListener =
            new OnSeekBarChangeListener() {

                @Override
                public void onProgressChanged(SeekBar seekBar, int progress,
                                              boolean fromUser) {
                    int pt = progress + MIN_PT;
                    textPt.setText("number of point in polygon: " + String.valueOf(pt));
                    myView.setNumberOfPoint(pt);
                    myView.invalidate();
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {}

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {}

            };
}