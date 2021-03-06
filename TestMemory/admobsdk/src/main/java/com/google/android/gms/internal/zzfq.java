package com.google.android.gms.internal;

import org.json.JSONException;
import org.json.JSONObject;

@zzhb
public class zzfq
{
  private final boolean zzDu;
  private final boolean zzDv;
  private final boolean zzDw;
  private final boolean zzDx;
  private final boolean zzDy;

  private zzfq(zza paramzza)
  {
    this.zzDu = zza.zza(paramzza);
    this.zzDv = zza.zzb(paramzza);
    this.zzDw = zza.zzc(paramzza);
    this.zzDx = zza.zzd(paramzza);
    this.zzDy = zza.zze(paramzza);
  }

  public JSONObject toJson()
  {
    try
    {
      return new JSONObject().put("sms", this.zzDu).put("tel", this.zzDv).put("calendar", this.zzDw).put("storePicture", this.zzDx).put("inlineVideo", this.zzDy);
    }
    catch (JSONException localJSONException)
    {
      zzin.zzb("Error occured while obtaining the MRAID capabilities.", localJSONException);
    }
    return null;
  }

  public static final class zza
  {
    private boolean zzDu;
    private boolean zzDv;
    private boolean zzDw;
    private boolean zzDx;
    private boolean zzDy;

    public zza zzq(boolean paramBoolean)
    {
      this.zzDu = paramBoolean;
      return this;
    }

    public zza zzr(boolean paramBoolean)
    {
      this.zzDv = paramBoolean;
      return this;
    }

    public zza zzs(boolean paramBoolean)
    {
      this.zzDw = paramBoolean;
      return this;
    }

    public zza zzt(boolean paramBoolean)
    {
      this.zzDx = paramBoolean;
      return this;
    }

    public zza zzu(boolean paramBoolean)
    {
      this.zzDy = paramBoolean;
      return this;
    }

    public zzfq zzeP()
    {
      return new zzfq(this, null);
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzfq
 * JD-Core Version:    0.6.0
 */