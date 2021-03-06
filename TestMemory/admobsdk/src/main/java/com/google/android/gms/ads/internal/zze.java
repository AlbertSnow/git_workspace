package com.google.android.gms.ads.internal;

import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.zzbp;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzif.zza;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzjp;

@zzhb
public class zze
{
  private zza zzpz;
  private boolean zzpA;
  private boolean zzpB;

  public zze()
  {
    this.zzpB = ((Boolean)zzbt.zzvI.get()).booleanValue();
  }

  public zze(boolean paramBoolean)
  {
    this.zzpB = paramBoolean;
  }

  public void zza(zza paramzza)
  {
    this.zzpz = paramzza;
  }

  public void recordClick()
  {
    this.zzpA = true;
  }

  public boolean zzbh()
  {
    return (!this.zzpB) || (this.zzpA);
  }

  public void zzq(String paramString)
  {
    zzin.zzaI("Action was blocked because no click was detected.");
    if (this.zzpz != null)
      this.zzpz.zzr(paramString);
  }

  @zzhb
  public static class zzb
    implements zze.zza
  {
    private final zzif.zza zzpC;
    private final zzjp zzpD;

    public zzb(zzif.zza paramzza, zzjp paramzzjp)
    {
      this.zzpC = paramzza;
      this.zzpD = paramzzjp;
    }

    public void zzr(String paramString)
    {
      zzin.zzaI("An auto-clicking creative is blocked");
      Uri.Builder localBuilder = new Uri.Builder();
      localBuilder.scheme("https");
      localBuilder.path("//pagead2.googlesyndication.com/pagead/gen_204");
      localBuilder.appendQueryParameter("id", "gmob-apps-blocked-navigation");
      if (!TextUtils.isEmpty(paramString))
        localBuilder.appendQueryParameter("navigationURL", paramString);
      if ((this.zzpC != null) && (this.zzpC.zzLe != null) && (!TextUtils.isEmpty(this.zzpC.zzLe.zzHY)))
        localBuilder.appendQueryParameter("debugDialog", this.zzpC.zzLe.zzHY);
      zzr.zzbC().zzc(this.zzpD.getContext(), this.zzpD.zzhX().afmaVersion, localBuilder.toString());
    }
  }

  public static abstract interface zza
  {
    public abstract void zzr(String paramString);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.zze
 * JD-Core Version:    0.6.0
 */