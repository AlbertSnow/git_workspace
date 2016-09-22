package com.google.android.gms.internal;

import android.support.annotation.Nullable;

@zzhb
public class zzbx
{
  public static boolean zza(@Nullable zzcb paramzzcb, @Nullable zzbz paramzzbz, String[] paramArrayOfString)
  {
    if ((paramzzcb == null) || (paramzzbz == null))
      return false;
    return paramzzcb.zza(paramzzbz, paramArrayOfString);
  }

  public static boolean zza(@Nullable zzcb paramzzcb, @Nullable zzbz paramzzbz, long paramLong, String[] paramArrayOfString)
  {
    if ((paramzzcb == null) || (paramzzbz == null))
      return false;
    return paramzzcb.zza(paramzzbz, paramLong, paramArrayOfString);
  }

  @Nullable
  public static zzbz zzb(@Nullable zzcb paramzzcb)
  {
    if (paramzzcb == null)
      return null;
    return paramzzcb.zzdB();
  }

  @Nullable
  public static zzbz zza(@Nullable zzcb paramzzcb, long paramLong)
  {
    if (paramzzcb == null)
      return null;
    return paramzzcb.zzb(paramLong);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzbx
 * JD-Core Version:    0.6.0
 */