package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzr;
import java.util.Map;

@zzhb
public class zzfo
{
  private final zzjp zzpD;
  private final boolean zzDp;
  private final String zzDq;

  public zzfo(zzjp paramzzjp, Map<String, String> paramMap)
  {
    this.zzpD = paramzzjp;
    this.zzDq = ((String)paramMap.get("forceOrientation"));
    if (paramMap.containsKey("allowOrientationChange"))
      this.zzDp = Boolean.parseBoolean((String)paramMap.get("allowOrientationChange"));
    else
      this.zzDp = true;
  }

  public void execute()
  {
    if (this.zzpD == null)
    {
      zzin.zzaK("AdWebView is null");
      return;
    }
    int i;
    if ("portrait".equalsIgnoreCase(this.zzDq))
      i = zzr.zzbE().zzhw();
    else if ("landscape".equalsIgnoreCase(this.zzDq))
      i = zzr.zzbE().zzhv();
    else if (this.zzDp)
      i = -1;
    else
      i = zzr.zzbE().zzhx();
    this.zzpD.setRequestedOrientation(i);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzfo
 * JD-Core Version:    0.6.0
 */