package com.google.android.gms.internal;

import java.util.Map;

@zzhb
public class zzdi
  implements zzdf
{
  private final zzdj zzzy;

  public zzdi(zzdj paramzzdj)
  {
    this.zzzy = paramzzdj;
  }

  public void zza(zzjp paramzzjp, Map<String, String> paramMap)
  {
    boolean bool1 = "1".equals(paramMap.get("transparentBackground"));
    boolean bool2 = "1".equals(paramMap.get("blur"));
    float f = 0.0F;
    try
    {
      if (paramMap.get("blurRadius") != null)
        f = Float.parseFloat((String)paramMap.get("blurRadius"));
    }
    catch (NumberFormatException localNumberFormatException)
    {
      zzin.zzb("Fail to parse float", localNumberFormatException);
    }
    this.zzzy.zzd(bool1);
    this.zzzy.zza(bool2, f);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzdi
 * JD-Core Version:    0.6.0
 */