package com.google.android.gms.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View.MeasureSpec;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.zzr;

@zzhb
public class zzgo
  implements Runnable
{
  private final Handler zzGj;
  private final long zzGk;
  private long zzGl;
  private zzjq.zza zzGm;
  protected final zzjp zzpD;
  protected boolean zzGn;
  protected boolean zzGo;
  private final int zzoH;
  private final int zzoG;

  public zzgo(zzjq.zza paramzza, zzjp paramzzjp, int paramInt1, int paramInt2, long paramLong1, long paramLong2)
  {
    this.zzGk = paramLong1;
    this.zzGl = paramLong2;
    this.zzGj = new Handler(Looper.getMainLooper());
    this.zzpD = paramzzjp;
    this.zzGm = paramzza;
    this.zzGn = false;
    this.zzGo = false;
    this.zzoH = paramInt2;
    this.zzoG = paramInt1;
  }

  public zzgo(zzjq.zza paramzza, zzjp paramzzjp, int paramInt1, int paramInt2)
  {
    this(paramzza, paramzzjp, paramInt1, paramInt2, 200L, 50L);
  }

  public void run()
  {
    if ((this.zzpD == null) || (zzgg()))
    {
      this.zzGm.zza(this.zzpD, true);
      return;
    }
    new zza(this.zzpD.getWebView()).execute(new Void[0]);
  }

  public void zzge()
  {
    this.zzGj.postDelayed(this, this.zzGk);
  }

  public void zza(AdResponseParcel paramAdResponseParcel, zzjy paramzzjy)
  {
    this.zzpD.setWebViewClient(paramzzjy);
    this.zzpD.loadDataWithBaseURL(TextUtils.isEmpty(paramAdResponseParcel.zzEF) ? null : zzr.zzbC().zzaC(paramAdResponseParcel.zzEF), paramAdResponseParcel.body, "text/html", "UTF-8", null);
  }

  public void zza(AdResponseParcel paramAdResponseParcel)
  {
    zzjy localzzjy = new zzjy(this, this.zzpD, paramAdResponseParcel.zzIa);
    zza(paramAdResponseParcel, localzzjy);
  }

  public synchronized void zzgf()
  {
    this.zzGn = true;
  }

  public synchronized boolean zzgg()
  {
    return this.zzGn;
  }

  public boolean zzgh()
  {
    return this.zzGo;
  }

  protected final class zza extends AsyncTask<Void, Void, Boolean>
  {
    private final WebView zzGp;
    private Bitmap zzGq;

    public zza(WebView arg2)
    {
      Object localObject;
      this.zzGp = localObject;
    }

    protected synchronized void onPreExecute()
    {
      this.zzGq = Bitmap.createBitmap(zzgo.zza(zzgo.this), zzgo.zzb(zzgo.this), Bitmap.Config.ARGB_8888);
      this.zzGp.setVisibility(0);
      this.zzGp.measure(View.MeasureSpec.makeMeasureSpec(zzgo.zza(zzgo.this), 0), View.MeasureSpec.makeMeasureSpec(zzgo.zzb(zzgo.this), 0));
      this.zzGp.layout(0, 0, zzgo.zza(zzgo.this), zzgo.zzb(zzgo.this));
      Canvas localCanvas = new Canvas(this.zzGq);
      this.zzGp.draw(localCanvas);
      this.zzGp.invalidate();
    }

    protected synchronized Boolean zza(Void[] paramArrayOfVoid)
    {
      int i = this.zzGq.getWidth();
      int j = this.zzGq.getHeight();
      if ((i == 0) || (j == 0))
        return Boolean.valueOf(false);
      int k = 0;
      for (int m = 0; m < i; m += 10)
        for (int n = 0; n < j; n += 10)
        {
          if (this.zzGq.getPixel(m, n) == 0)
            continue;
          k++;
        }
      double d = k / (i * j / 100.0D);
      return Boolean.valueOf(d > 0.1D);
    }

    protected void zza(Boolean paramBoolean)
    {
      zzgo.zzc(zzgo.this);
      if ((paramBoolean.booleanValue()) || (zzgo.this.zzgg()) || (zzgo.zzd(zzgo.this) <= 0L))
      {
        zzgo.this.zzGo = paramBoolean.booleanValue();
        zzgo.zze(zzgo.this).zza(zzgo.this.zzpD, true);
      }
      else if (zzgo.zzd(zzgo.this) > 0L)
      {
        if (zzin.zzQ(2))
          zzin.zzaI("Ad not detected, scheduling another run.");
        zzgo.zzg(zzgo.this).postDelayed(zzgo.this, zzgo.zzf(zzgo.this));
      }
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzgo
 * JD-Core Version:    0.6.0
 */