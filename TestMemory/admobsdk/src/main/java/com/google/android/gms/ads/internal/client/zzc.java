package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.internal.zzhb;

@zzhb
public final class zzc extends zzq.zza
{
  private final AdListener zztA;

  public zzc(AdListener paramAdListener)
  {
    this.zztA = paramAdListener;
  }

  public void onAdClosed()
  {
    this.zztA.onAdClosed();
  }

  public void onAdFailedToLoad(int errorCode)
  {
    this.zztA.onAdFailedToLoad(errorCode);
  }

  public void onAdLeftApplication()
  {
    this.zztA.onAdLeftApplication();
  }

  public void onAdLoaded()
  {
    this.zztA.onAdLoaded();
  }

  public void onAdOpened()
  {
    this.zztA.onAdOpened();
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzc
 * JD-Core Version:    0.6.0
 */