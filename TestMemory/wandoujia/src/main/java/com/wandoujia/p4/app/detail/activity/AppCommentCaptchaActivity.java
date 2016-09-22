package com.wandoujia.p4.app.detail.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.wandoujia.ripple_framework.view.a.h;

public class AppCommentCaptchaActivity extends Activity
  implements com.wandoujia.p4.app.controller.c
{
  private String a;
  private ImageView b;
  private com.wandoujia.ripple_framework.view.a.a c;

  public final void a(Bitmap paramBitmap)
  {
    runOnUiThread(new e(this, paramBitmap));
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Intent localIntent = getIntent();
    if (localIntent != null)
    {
      this.a = localIntent.getStringExtra("pn");
      if (!TextUtils.isEmpty(this.a))
      {
        setContentView(2130903585);
        h localh = new h(this);
        View localView = LayoutInflater.from(this).inflate(2130903587, null);
        this.b = ((ImageView)localView.findViewById(2131493997));
        this.b.setOnClickListener(new a(this));
        EditText localEditText = (EditText)localView.findViewById(2131493998);
        localh.a(2131625586);
        localh.a(localView);
        localh.a(false);
        localh.a(2131624604, new b(this, localEditText));
        localh.b(2131624330, new c(this));
        this.c = localh.b();
        this.c.setOnDismissListener(new d(this));
        com.wandoujia.p4.app.controller.a.a();
        com.wandoujia.p4.app.controller.a.a(this);
      }
    }
  }

  protected void onDestroy()
  {
    super.onDestroy();
    if (this.c != null)
    {
      this.c.dismiss();
      this.c = null;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.detail.activity.AppCommentCaptchaActivity
 * JD-Core Version:    0.6.0
 */