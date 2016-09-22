package com.wandoujia.jupiter.activity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;

public class DexLoadingActivity extends FragmentActivity
{
  private Handler a;
  private DexLoadingActivity.StopSelfReceiver b = new DexLoadingActivity.StopSelfReceiver(this, 0);

  public static void a(Context paramContext)
  {
    Intent localIntent = new Intent();
    localIntent.setAction("dexload.intent.action.STOP");
    paramContext.sendBroadcast(localIntent);
  }

  public void onCreate(Bundle paramBundle)
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("dexload.intent.action.STOP");
    registerReceiver(this.b, localIntentFilter);
    requestWindowFeature(1);
    super.onCreate(paramBundle);
    overridePendingTransition(2130968605, 2130968605);
    setContentView(2130903300);
    this.a = new c(this, 0);
  }

  protected void onDestroy()
  {
    super.onDestroy();
    unregisterReceiver(this.b);
    this.a = null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.activity.DexLoadingActivity
 * JD-Core Version:    0.6.0
 */