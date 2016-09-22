package com.wandoujia.p4.community.d;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import android.support.v7.app.f;
import android.support.v7.app.k;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.base.utils.SharePrefSubmitor;
import com.wandoujia.ripple_framework.ReceiverMonitor;
import com.wandoujia.ripple_framework.n;

public final class a extends com.wandoujia.p4.community.a<f>
{
  private static a a;
  private volatile int b = -1;
  private final n c = new b();
  private final k d = new c();

  private a()
  {
    ReceiverMonitor.a().a(this.c);
    ReceiverMonitor.a().a(this.d);
  }

  public static a a()
  {
    if (a == null)
      a = new a();
    return a;
  }

  public final void a(int paramInt)
  {
    if (1 != this.b)
    {
      SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.wandoujia.p4.a.a());
      if (localSharedPreferences != null)
      {
        SharedPreferences.Editor localEditor = localSharedPreferences.edit();
        localEditor.putInt("setting_save_mobile_flow", 1);
        SharePrefSubmitor.submit(localEditor);
      }
      if (!NetworkUtil.isMobileNetworkConnected(com.wandoujia.p4.a.a()))
        paramInt = 0;
      this.b = paramInt;
      com.wandoujia.p4.a.b().start();
      a(new d(this));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.d.a
 * JD-Core Version:    0.6.0
 */