package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzr;
import java.util.Map;

@zzhb
public final class zzdd
  implements zzdf
{
  public void zza(zzjp paramzzjp, Map<String, String> paramMap)
  {
    String str = (String)paramMap.get("action");
    if ("tick".equals(str))
      zzb(paramzzjp, paramMap);
    else if ("experiment".equals(str))
      zzc(paramzzjp, paramMap);
    else if ("extra".equals(str))
      zzd(paramzzjp, paramMap);
  }

  private void zzb(zzjp paramzzjp, Map<String, String> paramMap)
  {
    String str1 = (String)paramMap.get("label");
    String str2 = (String)paramMap.get("start_label");
    String str3 = (String)paramMap.get("timestamp");
    if (TextUtils.isEmpty(str1))
    {
      zzin.zzaK("No label given for CSI tick.");
      return;
    }
    if (TextUtils.isEmpty(str3))
    {
      zzin.zzaK("No timestamp given for CSI tick.");
      return;
    }
    long l;
    try
    {
      l = zzc(Long.parseLong(str3));
    }
    catch (NumberFormatException localNumberFormatException)
    {
      zzin.zzd("Malformed timestamp for CSI tick.", localNumberFormatException);
      return;
    }
    str2 = TextUtils.isEmpty(str2) ? "native:view_load" : str2;
    paramzzjp.zzic().zza(str1, str2, l);
  }

  private void zzc(zzjp paramzzjp, Map<String, String> paramMap)
  {
    String str = (String)paramMap.get("value");
    if (TextUtils.isEmpty(str))
    {
      zzin.zzaK("No value given for CSI experiment.");
      return;
    }
    zzcb localzzcb = paramzzjp.zzic().zzdA();
    if (localzzcb == null)
    {
      zzin.zzaK("No ticker for WebView, dropping experiment ID.");
      return;
    }
    localzzcb.zzc("e", str);
  }

  private void zzd(zzjp paramzzjp, Map<String, String> paramMap)
  {
    String str1 = (String)paramMap.get("name");
    String str2 = (String)paramMap.get("value");
    if (TextUtils.isEmpty(str2))
    {
      zzin.zzaK("No value given for CSI extra.");
      return;
    }
    if (TextUtils.isEmpty(str1))
    {
      zzin.zzaK("No name given for CSI extra.");
      return;
    }
    zzcb localzzcb = paramzzjp.zzic().zzdA();
    if (localzzcb == null)
    {
      zzin.zzaK("No ticker for WebView, dropping extra parameter.");
      return;
    }
    localzzcb.zzc(str1, str2);
  }

  private long zzc(long paramLong)
  {
    long l1 = zzr.zzbG().currentTimeMillis();
    long l2 = zzr.zzbG().elapsedRealtime();
    return l2 + (paramLong - l1);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzdd
 * JD-Core Version:    0.6.0
 */