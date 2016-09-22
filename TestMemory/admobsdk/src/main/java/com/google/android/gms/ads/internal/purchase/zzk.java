package com.google.android.gms.ads.internal.purchase;

import android.content.Intent;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;

@zzhb
public class zzk
{
  private final String zzuM;

  public zzk(String paramString)
  {
    this.zzuM = paramString;
  }

  public String zzfZ()
  {
    return zzr.zzbC().zzhs();
  }

  public boolean zza(String paramString, int paramInt, Intent paramIntent)
  {
    if ((paramString == null) || (paramIntent == null))
      return false;
    String str1 = zzr.zzbM().zze(paramIntent);
    String str2 = zzr.zzbM().zzf(paramIntent);
    if ((str1 == null) || (str2 == null))
      return false;
    String str3 = zzr.zzbM().zzaq(str1);
    if (!paramString.equals(str3))
    {
      zzin.zzaK("Developer payload not match.");
      return false;
    }
    if ((this.zzuM != null) && (!zzl.zzc(this.zzuM, str1, str2)))
    {
      zzin.zzaK("Fail to verify signature.");
      return false;
    }
    return true;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.purchase.zzk
 * JD-Core Version:    0.6.0
 */