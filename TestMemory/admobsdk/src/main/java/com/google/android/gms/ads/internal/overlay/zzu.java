package com.google.android.gms.ads.internal.overlay;

import android.os.Handler;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzir;

@zzhb
class zzu
  implements Runnable
{
  private zzk zzFo;
  private boolean mCancelled = false;

  zzu(zzk paramzzk)
  {
    this.zzFo = paramzzk;
  }

  public void run()
  {
    if (!this.mCancelled)
    {
      this.zzFo.zzfF();
      zzfQ();
    }
  }

  public void cancel()
  {
    this.mCancelled = true;
    zzir.zzMc.removeCallbacks(this);
  }

  public void zzfQ()
  {
    zzir.zzMc.postDelayed(this, 250L);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.zzu
 * JD-Core Version:    0.6.0
 */