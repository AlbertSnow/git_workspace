package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.zzr;
import java.util.LinkedHashMap;
import java.util.Map;

@zzhb
public class zzbu
{
  private boolean zzxi;
  private String zzxj;
  private Map<String, String> zzxk;
  private Context mContext = null;
  private String zzsy = null;

  public zzbu(Context paramContext, String paramString)
  {
    this.mContext = paramContext;
    this.zzsy = paramString;
    this.zzxi = ((Boolean)zzbt.zzwg.get()).booleanValue();
    this.zzxj = ((String)zzbt.zzwh.get());
    this.zzxk = new LinkedHashMap();
    this.zzxk.put("s", "gmob_sdk");
    this.zzxk.put("v", "3");
    this.zzxk.put("os", Build.VERSION.RELEASE);
    this.zzxk.put("sdk", Build.VERSION.SDK);
    this.zzxk.put("device", zzr.zzbC().zzht());
    this.zzxk.put("app", paramContext.getApplicationContext() != null ? paramContext.getApplicationContext().getPackageName() : paramContext.getPackageName());
    zzhj localzzhj = zzr.zzbI().zzE(this.mContext);
    this.zzxk.put("network_coarse", Integer.toString(localzzhj.zzKc));
    this.zzxk.put("network_fine", Integer.toString(localzzhj.zzKd));
  }

  boolean zzdu()
  {
    return this.zzxi;
  }

  String zzdv()
  {
    return this.zzxj;
  }

  Context getContext()
  {
    return this.mContext;
  }

  String zzcs()
  {
    return this.zzsy;
  }

  Map<String, String> zzdw()
  {
    return this.zzxk;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzbu
 * JD-Core Version:    0.6.0
 */