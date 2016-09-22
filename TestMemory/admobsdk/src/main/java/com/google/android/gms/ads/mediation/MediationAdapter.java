package com.google.android.gms.ads.mediation;

import android.os.Bundle;

public abstract interface MediationAdapter
{
  public abstract void onDestroy();

  public abstract void onPause();

  public abstract void onResume();

  public static class zza
  {
    private int zzOn;

    public zza zzS(int paramInt)
    {
      this.zzOn = paramInt;
      return this;
    }

    public Bundle zziw()
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("capabilities", this.zzOn);
      return localBundle;
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.mediation.MediationAdapter
 * JD-Core Version:    0.6.0
 */