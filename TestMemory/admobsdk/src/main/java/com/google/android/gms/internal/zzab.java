package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;

public class zzab extends zzk<String>
{
  private final zzm.zzb<String> zzaG;

  public zzab(int paramInt, String paramString, zzm.zzb<String> paramzzb, zzm.zza paramzza)
  {
    super(paramInt, paramString, paramzza);
    this.zzaG = paramzzb;
  }

  public zzab(String paramString, zzm.zzb<String> paramzzb, zzm.zza paramzza)
  {
    this(0, paramString, paramzzb, paramzza);
  }

  protected void zzi(String paramString)
  {
    this.zzaG.zzb(paramString);
  }

  protected zzm<String> zza(zzi paramzzi)
  {
    String str;
    try
    {
      str = new String(paramzzi.data, zzx.zza(paramzzi.zzA));
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      str = new String(paramzzi.data);
    }
    return zzm.zza(str, zzx.zzb(paramzzi));
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzab
 * JD-Core Version:    0.6.0
 */