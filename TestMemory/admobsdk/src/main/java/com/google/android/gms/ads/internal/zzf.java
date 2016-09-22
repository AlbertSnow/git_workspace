package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzau;
import com.google.android.gms.internal.zzax;
import com.google.android.gms.internal.zzbp;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzex;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzif;
import com.google.android.gms.internal.zzif.zza;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzjk;
import com.google.android.gms.internal.zzjp;
import com.google.android.gms.internal.zzjq;
import com.google.android.gms.internal.zzjq.zzb;

@zzhb
public class zzf extends zzc
  implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener
{
  private boolean zzpE;

  public zzf(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, zzex paramzzex, VersionInfoParcel paramVersionInfoParcel, zzd paramzzd)
  {
    super(paramContext, paramAdSizeParcel, paramString, paramzzex, paramVersionInfoParcel, paramzzd);
  }

  protected zzjp zza(zzif.zza paramzza, zze paramzze)
  {
    if (this.zzpj.zzrp.zzul)
      this.zzpj.zzrp = zzb(paramzza);
    return super.zza(paramzza, paramzze);
  }

  public boolean zzb(AdRequestParcel paramAdRequestParcel)
  {
    return super.zzb(zze(paramAdRequestParcel));
  }

  AdRequestParcel zze(AdRequestParcel paramAdRequestParcel)
  {
    if (paramAdRequestParcel.zztH == this.zzpE)
      return paramAdRequestParcel;
    return new AdRequestParcel(paramAdRequestParcel.versionCode, paramAdRequestParcel.zztC, paramAdRequestParcel.extras, paramAdRequestParcel.zztD, paramAdRequestParcel.zztE, paramAdRequestParcel.zztF, paramAdRequestParcel.zztG, (paramAdRequestParcel.zztH) || (this.zzpE), paramAdRequestParcel.zztI, paramAdRequestParcel.zztJ, paramAdRequestParcel.zztK, paramAdRequestParcel.zztL, paramAdRequestParcel.zztM, paramAdRequestParcel.zztN, paramAdRequestParcel.zztO, paramAdRequestParcel.zztP, paramAdRequestParcel.zztQ, paramAdRequestParcel.zztR);
  }

  public boolean zza(zzif paramzzif1, zzif paramzzif2)
  {
    if (!super.zza(paramzzif1, paramzzif2))
      return false;
    if ((this.zzpj.zzbW()) && (!zzb(paramzzif1, paramzzif2)))
    {
      zzf(0);
      return false;
    }
    if (paramzzif2.zzIm)
    {
      zze(paramzzif2);
      zzjk.zza(this.zzpj.zzrm, this);
      zzjk.zza(this.zzpj.zzrm, this);
    }
    else if ((!this.zzpj.zzbX()) || (((Boolean)zzbt.zzxg.get()).booleanValue()))
    {
      zza(paramzzif2, false);
    }
    zzd(paramzzif2);
    return true;
  }

  private void zzd(zzif paramzzif)
  {
    if (this.zzpj.zzbW())
    {
      if (paramzzif.zzED != null)
      {
        if (paramzzif.zzKT != null)
          this.zzpl.zza(this.zzpj.zzrp, paramzzif);
        if (paramzzif.zzcv())
        {
          zzau localzzau = this.zzpl.zza(this.zzpj.zzrp, paramzzif);
          localzzau.zza(paramzzif.zzED);
        }
        else
        {
          paramzzif.zzED.zzhU().zza(new zzjq.zzb(paramzzif)
          {
            public void zzbi()
            {
              zzau localzzau = zzf.this.zzpl.zza(zzf.this.zzpj.zzrp, this.zzpF);
              localzzau.zza(this.zzpF.zzED);
            }
          });
        }
      }
    }
    else if ((this.zzpj.zzrK != null) && (paramzzif.zzKT != null))
      this.zzpl.zza(this.zzpj.zzrp, paramzzif, this.zzpj.zzrK);
  }

  private boolean zzb(zzif paramzzif1, zzif paramzzif2)
  {
    View localView1;
    if (paramzzif2.zzHT)
    {
      localView1 = zzm.zzf(paramzzif2);
      if (localView1 == null)
      {
        zzin.zzaK("Could not get mediation view");
        return false;
      }
      View localView2 = this.zzpj.zzrm.getNextView();
      if (localView2 != null)
      {
        if ((localView2 instanceof zzjp))
          ((zzjp)localView2).destroy();
        this.zzpj.zzrm.removeView(localView2);
      }
      if (!zzm.zzg(paramzzif2))
        try
        {
          zzb(localView1);
        }
        catch (Throwable localThrowable)
        {
          zzin.zzd("Could not add mediation view to view hierarchy.", localThrowable);
          return false;
        }
    }
    else if ((paramzzif2.zzKW != null) && (paramzzif2.zzED != null))
    {
      paramzzif2.zzED.zza(paramzzif2.zzKW);
      this.zzpj.zzrm.removeAllViews();
      this.zzpj.zzrm.setMinimumWidth(paramzzif2.zzKW.widthPixels);
      this.zzpj.zzrm.setMinimumHeight(paramzzif2.zzKW.heightPixels);
      zzb(paramzzif2.zzED.getView());
    }
    if (this.zzpj.zzrm.getChildCount() > 1)
      this.zzpj.zzrm.showNext();
    if (paramzzif1 != null)
    {
      localView1 = this.zzpj.zzrm.getNextView();
      if ((localView1 instanceof zzjp))
        ((zzjp)localView1).zza(this.zzpj.context, this.zzpj.zzrp, this.zzpe);
      else if (localView1 != null)
        this.zzpj.zzrm.removeView(localView1);
      this.zzpj.zzbV();
    }
    this.zzpj.zzrm.setVisibility(0);
    return true;
  }

  protected boolean zzaV()
  {
    int i = 1;
    if (!zzr.zzbC().zza(this.zzpj.context.getPackageManager(), this.zzpj.context.getPackageName(), "android.permission.INTERNET"))
    {
      zzn.zzcS().zza(this.zzpj.zzrm, this.zzpj.zzrp, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
      i = 0;
    }
    if (!zzr.zzbC().zzI(this.zzpj.context))
    {
      zzn.zzcS().zza(this.zzpj.zzrm, this.zzpj.zzrp, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
      i = 0;
    }
    if ((i == 0) && (this.zzpj.zzrm != null))
      this.zzpj.zzrm.setVisibility(0);
    return i;
  }

  public void setManualImpressionsEnabled(boolean enabled)
  {
    zzx.zzcD("setManualImpressionsEnabled must be called from the main thread.");
    this.zzpE = enabled;
  }

  public void showInterstitial()
  {
    throw new IllegalStateException("Interstitial is NOT supported by BannerAdManager.");
  }

  private AdSizeParcel zzb(zzif.zza paramzza)
  {
    if (paramzza.zzLe.zzul)
      return this.zzpj.zzrp;
    String str = paramzza.zzLe.zzHW;
    AdSize localAdSize;
    if (str != null)
    {
      String[] arrayOfString = str.split("[xX]");
      arrayOfString[0] = arrayOfString[0].trim();
      arrayOfString[1] = arrayOfString[1].trim();
      int i = Integer.parseInt(arrayOfString[0]);
      int j = Integer.parseInt(arrayOfString[1]);
      localAdSize = new AdSize(i, j);
    }
    else
    {
      localAdSize = this.zzpj.zzrp.zzcQ();
    }
    return new AdSizeParcel(this.zzpj.context, localAdSize);
  }

  public void onGlobalLayout()
  {
    zze(this.zzpj.zzrq);
  }

  public void onScrollChanged()
  {
    zze(this.zzpj.zzrq);
  }

  protected void zza(zzif paramzzif, boolean paramBoolean)
  {
    super.zza(paramzzif, paramBoolean);
    if (zzm.zzg(paramzzif))
      zzm.zza(paramzzif, new zza());
  }

  void zze(zzif paramzzif)
  {
    if (paramzzif == null)
      return;
    if (paramzzif.zzKU)
      return;
    if ((this.zzpj.zzrm == null) || (!zzr.zzbC().zza(this.zzpj.zzrm, this.zzpj.context)) || (!this.zzpj.zzrm.getGlobalVisibleRect(new Rect(), null)))
      return;
    zza(paramzzif, false);
    paramzzif.zzKU = true;
  }

  public class zza
  {
    public zza()
    {
    }

    public void onClick()
    {
      zzf.this.onAdClicked();
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.zzf
 * JD-Core Version:    0.6.0
 */