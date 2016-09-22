package com.wandoujia.jupiter.activity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.v4.app.FragmentActivity;

public class NoDexLaunchActivity extends FragmentActivity
{
  private HandlerThread a = new HandlerThread("loadMultiDexThread");
  private Handler b;
  private Handler c;
  private NoDexLaunchActivity.StopSelfReceiver d = new NoDexLaunchActivity.StopSelfReceiver(this, 0);

  public static void a(Context paramContext)
  {
    Intent localIntent = new Intent();
    localIntent.setAction("nodex.intent.action.STOP");
    paramContext.sendBroadcast(localIntent);
  }

  public void onBackPressed()
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("nodex.intent.action.STOP");
    registerReceiver(this.d, localIntentFilter);
    requestWindowFeature(1);
    super.onCreate(paramBundle);
    overridePendingTransition(2130968605, 2130968605);
    setContentView(2130903338);
    this.b = new j(this, 0);
    this.a.start();
    this.c = new Handler(this.a.getLooper());
    this.c.post(new i(this));
  }

  protected void onDestroy()
  {
    super.onDestroy();
    unregisterReceiver(this.d);
    if (this.a == null)
      return;
    this.a.quit();
    this.b = null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.activity.NoDexLaunchActivity
 * JD-Core Version:    0.6.0
 */