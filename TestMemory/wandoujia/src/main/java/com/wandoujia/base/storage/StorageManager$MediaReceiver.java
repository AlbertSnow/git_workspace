package com.wandoujia.base.storage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class StorageManager$MediaReceiver extends BroadcastReceiver
{
  private StorageManager$MediaReceiver(StorageManager paramStorageManager)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    String str = paramIntent.getAction();
    if ((str != null) && ((str.equals("android.intent.action.MEDIA_MOUNTED")) || (str.equals("android.intent.action.MEDIA_UNMOUNTED"))))
    {
      StorageManager.access$102(this.a, StorageManager.access$200(this.a));
      StorageManager.access$300(this.a);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.storage.StorageManager.MediaReceiver
 * JD-Core Version:    0.6.0
 */