package com.wandoujia.p4.settings;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FollowUsTipsTransparentActivity extends Activity
{
  private float a;

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903222);
    View localView1 = findViewById(2131493521);
    View localView2 = findViewById(2131492885);
    Button localButton = (Button)findViewById(2131493523);
    localView1.setOnTouchListener(new c(this));
    localButton.setOnClickListener(new d(this));
    localView2.setOnClickListener(new f(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.settings.FollowUsTipsTransparentActivity
 * JD-Core Version:    0.6.0
 */