package com.google.android.gms.internal;

import java.util.Map;

@zzhb
public final class zzda
  implements zzdf
{
  private final zzdb zzyW;

  public zzda(zzdb paramzzdb)
  {
    this.zzyW = paramzzdb;
  }

  public void zza(zzjp paramzzjp, Map<String, String> paramMap)
  {
    String str = (String)paramMap.get("name");
    if (str == null)
    {
      zzin.zzaK("App event with no name parameter.");
      return;
    }
    this.zzyW.onAppEvent(str, (String)paramMap.get("info"));
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzda
 * JD-Core Version:    0.6.0
 */