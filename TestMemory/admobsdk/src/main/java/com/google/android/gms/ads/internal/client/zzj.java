package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.internal.zzhb;

@zzhb
public final class zzj extends zzw.zza
{
  private final AppEventListener zzun;

  public zzj(AppEventListener paramAppEventListener)
  {
    this.zzun = paramAppEventListener;
  }

  public void onAppEvent(String name, String info)
  {
    this.zzun.onAppEvent(name, info);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzj
 * JD-Core Version:    0.6.0
 */