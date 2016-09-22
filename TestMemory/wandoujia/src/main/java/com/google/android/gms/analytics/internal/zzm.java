package com.google.android.gms.analytics.internal;

public enum zzm
{
  static
  {
    zzKA = new zzm("BATCH_BY_SESSION", 1);
    zzKB = new zzm("BATCH_BY_TIME", 2);
    zzKC = new zzm("BATCH_BY_BRUTE_FORCE", 3);
    zzKD = new zzm("BATCH_BY_COUNT", 4);
    zzKE = new zzm("BATCH_BY_SIZE", 5);
    zzm[] arrayOfzzm = new zzm[6];
    arrayOfzzm[0] = zzKz;
    arrayOfzzm[1] = zzKA;
    arrayOfzzm[2] = zzKB;
    arrayOfzzm[3] = zzKC;
    arrayOfzzm[4] = zzKD;
    arrayOfzzm[5] = zzKE;
    zzKF = arrayOfzzm;
  }

  public static zzm zzbc(String paramString)
  {
    if ("BATCH_BY_SESSION".equalsIgnoreCase(paramString))
      return zzKA;
    if ("BATCH_BY_TIME".equalsIgnoreCase(paramString))
      return zzKB;
    if ("BATCH_BY_BRUTE_FORCE".equalsIgnoreCase(paramString))
      return zzKC;
    if ("BATCH_BY_COUNT".equalsIgnoreCase(paramString))
      return zzKD;
    if ("BATCH_BY_SIZE".equalsIgnoreCase(paramString))
      return zzKE;
    return zzKz;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.internal.zzm
 * JD-Core Version:    0.6.0
 */