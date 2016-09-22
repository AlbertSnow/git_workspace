package com.wandoujia.p4.settings;

import android.os.AsyncTask;
import java.lang.ref.WeakReference;

final class ad extends AsyncTask<Void, Void, Long>
{
  private WeakReference<MainSettingActivity> a;

  public ad(MainSettingActivity paramMainSettingActivity)
  {
    this.a = new WeakReference(paramMainSettingActivity);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.settings.ad
 * JD-Core Version:    0.6.0
 */