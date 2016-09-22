package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.TextureView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.internal.zzbp;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzbx;
import com.google.android.gms.internal.zzbz;
import com.google.android.gms.internal.zzcb;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zziv;
import com.google.android.gms.internal.zziv.zza;
import com.google.android.gms.internal.zziv.zzb;
import com.google.android.gms.internal.zzmq;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

@zzhb
public class zzt
{
  private final Context mContext;
  private final String zzEY;
  private final VersionInfoParcel zzEZ;

  @Nullable
  private final zzbz zzFa;

  @Nullable
  private final zzcb zzFb;
  private final zziv zzFc = new zziv.zzb().zza("min_1", 4.9E-324D, 1.0D).zza("1_5", 1.0D, 5.0D).zza("5_10", 5.0D, 10.0D).zza("10_20", 10.0D, 20.0D).zza("20_30", 20.0D, 30.0D).zza("30_max", 30.0D, 1.7976931348623157E+308D).zzhA();
  private final long[] zzFd;
  private final String[] zzFe;

  @Nullable
  private zzbz zzFf;

  @Nullable
  private zzbz zzFg;

  @Nullable
  private zzbz zzFh;

  @Nullable
  private zzbz zzFi;
  private boolean zzFj;
  private zzi zzFk;
  private boolean zzFl;
  private boolean zzFm;
  private long zzFn = -1L;

  public zzt(Context paramContext, VersionInfoParcel paramVersionInfoParcel, String paramString, @Nullable zzcb paramzzcb, @Nullable zzbz paramzzbz)
  {
    this.mContext = paramContext;
    this.zzEZ = paramVersionInfoParcel;
    this.zzEY = paramString;
    this.zzFb = paramzzcb;
    this.zzFa = paramzzbz;
    String str = (String)zzbt.zzvV.get();
    if (str == null)
    {
      this.zzFe = new String[0];
      this.zzFd = new long[0];
      return;
    }
    String[] arrayOfString = TextUtils.split(str, ",");
    this.zzFe = new String[arrayOfString.length];
    this.zzFd = new long[arrayOfString.length];
    for (int i = 0; i < arrayOfString.length; i++)
      try
      {
        this.zzFd[i] = Long.parseLong(arrayOfString[i]);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        zzin.zzd("Unable to parse frame hash target time number.", localNumberFormatException);
        this.zzFd[i] = -1L;
      }
  }

  public void zza(zzi paramzzi)
  {
    zzbx.zza(this.zzFb, this.zzFa, new String[] { "vpc" });
    this.zzFf = zzbx.zzb(this.zzFb);
    this.zzFk = paramzzi;
  }

  public void zzfz()
  {
    if ((this.zzFf == null) || (this.zzFg != null))
      return;
    zzbx.zza(this.zzFb, this.zzFf, new String[] { "vfr" });
    this.zzFg = zzbx.zzb(this.zzFb);
  }

  public void onStop()
  {
    if ((((Boolean)zzbt.zzvU.get()).booleanValue()) && (!this.zzFl))
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("type", "native-player-metrics");
      localBundle.putString("request", this.zzEY);
      localBundle.putString("player", this.zzFk.zzeZ());
      Iterator localIterator = this.zzFc.getBuckets().iterator();
      Object localObject;
      while (localIterator.hasNext())
      {
        localObject = (zziv.zza)localIterator.next();
        localBundle.putString("fps_c_" + ((zziv.zza)localObject).name, Integer.toString(((zziv.zza)localObject).count));
        localBundle.putString("fps_p_" + ((zziv.zza)localObject).name, Double.toString(((zziv.zza)localObject).zzMu));
      }
      for (int i = 0; i < this.zzFd.length; i++)
      {
        localObject = this.zzFe[i];
        if (localObject == null)
          continue;
        localBundle.putString("fh_" + Long.valueOf(this.zzFd[i]), (String)localObject);
      }
      zzr.zzbC().zza(this.mContext, this.zzEZ.afmaVersion, "gmob-apps", localBundle, true);
      this.zzFl = true;
    }
  }

  public void zzb(zzi paramzzi)
  {
    zzfN();
    zzc(paramzzi);
  }

  private void zzfN()
  {
    if ((this.zzFh != null) && (this.zzFi == null))
    {
      zzbx.zza(this.zzFb, this.zzFh, new String[] { "vff" });
      zzbx.zza(this.zzFb, this.zzFa, new String[] { "vtt" });
      this.zzFi = zzbx.zzb(this.zzFb);
    }
    long l = zzr.zzbG().nanoTime();
    if ((this.zzFj) && (this.zzFm) && (this.zzFn != -1L))
    {
      double d = TimeUnit.SECONDS.toNanos(1L) / (l - this.zzFn);
      this.zzFc.zza(d);
    }
    this.zzFm = this.zzFj;
    this.zzFn = l;
  }

  private void zzc(zzi paramzzi)
  {
    long l1 = ((Long)zzbt.zzvW.get()).longValue();
    long l2 = paramzzi.getCurrentPosition();
    for (int i = 0; i < this.zzFe.length; i++)
    {
      if (this.zzFe[i] != null)
        continue;
      long l3 = this.zzFd[i];
      if (l1 <= Math.abs(l2 - l3))
        continue;
      this.zzFe[i] = zza(paramzzi);
      break;
    }
  }

  String zza(TextureView paramTextureView)
  {
    Bitmap localBitmap = paramTextureView.getBitmap(8, 8);
    long l1 = 0L;
    long l2 = 63L;
    for (int i = 0; i < 8; i++)
    {
      int j = 0;
      while (j < 8)
      {
        int k = localBitmap.getPixel(j, i);
        int m = Color.blue(k) + Color.red(k) + Color.green(k);
        long l3 = m > 128 ? 1L : 0L;
        l1 |= l3 << (int)l2;
        j++;
        l2 -= 1L;
      }
    }
    return String.format("%016X", new Object[] { Long.valueOf(l1) });
  }

  public void zzfO()
  {
    this.zzFj = true;
    if ((this.zzFg != null) && (this.zzFh == null))
    {
      zzbx.zza(this.zzFb, this.zzFg, new String[] { "vfp" });
      this.zzFh = zzbx.zzb(this.zzFb);
    }
  }

  public void zzfP()
  {
    this.zzFj = false;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.zzt
 * JD-Core Version:    0.6.0
 */