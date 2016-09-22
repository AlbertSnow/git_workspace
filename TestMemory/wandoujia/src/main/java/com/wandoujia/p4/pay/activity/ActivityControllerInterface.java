package com.wandoujia.p4.pay.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;

public abstract interface ActivityControllerInterface
{
  public abstract void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent);

  public abstract void onCreate(Bundle paramBundle);

  public abstract void onDestroy();

  public abstract boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.activity.ActivityControllerInterface
 * JD-Core Version:    0.6.0
 */