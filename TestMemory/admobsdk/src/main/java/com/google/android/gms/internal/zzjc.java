package com.google.android.gms.internal;

import android.app.Activity;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.internal.zzr;

@zzhb
public final class zzjc
{
  private Activity zzMM;
  private boolean zzMN;
  private boolean zzMO;
  private boolean zzMP;
  private ViewTreeObserver.OnGlobalLayoutListener zzMQ;
  private ViewTreeObserver.OnScrollChangedListener zzMR;

  public zzjc(Activity paramActivity, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener)
  {
    this.zzMM = paramActivity;
    this.zzMQ = paramOnGlobalLayoutListener;
    this.zzMR = paramOnScrollChangedListener;
  }

  public void zzi(Activity paramActivity)
  {
    this.zzMM = paramActivity;
  }

  public void zzhE()
  {
    this.zzMP = true;
    if (this.zzMO)
      zzhG();
  }

  public void zzhF()
  {
    this.zzMP = false;
    zzhH();
  }

  public void onAttachedToWindow()
  {
    this.zzMO = true;
    if (this.zzMP)
      zzhG();
  }

  public void onDetachedFromWindow()
  {
    this.zzMO = false;
    zzhH();
  }

  private void zzhG()
  {
    if (this.zzMM == null)
      return;
    if (!this.zzMN)
    {
      if (this.zzMQ != null)
        zzr.zzbC().zza(this.zzMM, this.zzMQ);
      if (this.zzMR != null)
        zzr.zzbC().zza(this.zzMM, this.zzMR);
      this.zzMN = true;
    }
  }

  private void zzhH()
  {
    if (this.zzMM == null)
      return;
    if (this.zzMN)
    {
      if (this.zzMQ != null)
        zzr.zzbE().zzb(this.zzMM, this.zzMQ);
      if (this.zzMR != null)
        zzr.zzbC().zzb(this.zzMM, this.zzMR);
      this.zzMN = false;
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzjc
 * JD-Core Version:    0.6.0
 */