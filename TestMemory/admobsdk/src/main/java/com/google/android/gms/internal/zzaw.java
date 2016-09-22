package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

@zzhb
public final class zzaw
{
  private final String zzsv;
  private final JSONObject zzsw;
  private final String zzsx;
  private final String zzsy;
  private final boolean zzsz;
  private final boolean zzsA;

  public zzaw(String paramString1, VersionInfoParcel paramVersionInfoParcel, String paramString2, JSONObject paramJSONObject, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.zzsy = paramVersionInfoParcel.afmaVersion;
    this.zzsw = paramJSONObject;
    this.zzsx = paramString1;
    this.zzsv = paramString2;
    this.zzsz = paramBoolean1;
    this.zzsA = paramBoolean2;
  }

  public String zzcr()
  {
    return this.zzsv;
  }

  public String zzcs()
  {
    return this.zzsy;
  }

  public JSONObject zzct()
  {
    return this.zzsw;
  }

  public String zzcu()
  {
    return this.zzsx;
  }

  public boolean zzcv()
  {
    return this.zzsz;
  }

  public boolean zzcw()
  {
    return this.zzsA;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzaw
 * JD-Core Version:    0.6.0
 */