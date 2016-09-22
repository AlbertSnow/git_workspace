package com.alipay.android.mini.window.sdk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.alipay.android.app.m;
import com.alipay.android.app.pay.PayTask;
import com.alipay.wandoujia.g;
import com.wandoujia.image.c.a;

public class MiniLaucherActivity extends Activity
{
  private boolean a = false;

  private void a(Intent paramIntent)
  {
    try
    {
      String str = paramIntent.getStringExtra("order_info");
      new PayTask(this, new ba(this)).execute(new String[] { str });
      return;
    }
    catch (Exception localException)
    {
      finish();
    }
  }

  public void finish()
  {
    super.finish();
    if (!this.a)
    {
      m localm = m.b(6001);
      Intent localIntent = new Intent("com.alipay.android.app.pay.ACTION_PAY_FAILED");
      localIntent.putExtra("resultStatus", String.valueOf(localm.a()));
      localIntent.putExtra("memo", localm.b());
      localIntent.putExtra("result", "");
      setResult(0, localIntent);
    }
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    super.getWindow().setBackgroundDrawable(null);
    super.getWindow().getDecorView().setBackgroundDrawable(null);
    a.a().a(getApplicationContext(), g.z());
    a(getIntent());
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    a(paramIntent);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.window.sdk.MiniLaucherActivity
 * JD-Core Version:    0.6.0
 */