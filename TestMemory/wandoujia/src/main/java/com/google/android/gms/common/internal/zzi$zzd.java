package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.support.v4.app.d;

public final class zzi$zzd extends zzo.zza
{
  private final int a;

  public final void a(int paramInt, Bundle paramBundle)
  {
    d.a(null, "onAccountValidationComplete can be called only once per call to validateAccount");
    int i = this.a;
    null.a.sendMessage(null.a.obtainMessage(5, i, -1, new i()));
  }

  public final void a(int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    d.a(null, "onPostInitComplete can be called only once per call to getRemoteService");
    int i = this.a;
    null.a.sendMessage(null.a.obtainMessage(1, i, -1, new h()));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.internal.zzi.zzd
 * JD-Core Version:    0.6.0
 */