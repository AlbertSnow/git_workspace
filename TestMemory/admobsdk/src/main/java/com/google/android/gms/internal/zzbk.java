package com.google.android.gms.internal;

import java.util.PriorityQueue;

@zzhb
public class zzbk
{
  public static void zza(String[] paramArrayOfString, int paramInt1, int paramInt2, PriorityQueue<zza> paramPriorityQueue)
  {
    if (paramArrayOfString.length < paramInt2)
    {
      l1 = zzb(paramArrayOfString, 0, paramArrayOfString.length);
      zza(paramInt1, l1, zza(paramArrayOfString, 0, paramArrayOfString.length), paramArrayOfString.length, paramPriorityQueue);
      return;
    }
    long l1 = zzb(paramArrayOfString, 0, paramInt2);
    zza(paramInt1, l1, zza(paramArrayOfString, 0, paramInt2), paramInt2, paramPriorityQueue);
    long l2 = zza(16785407L, paramInt2 - 1);
    for (int i = 1; i < paramArrayOfString.length - paramInt2 + 1; i++)
    {
      l1 = zza(zzbi.zzx(paramArrayOfString[(i - 1)]), zzbi.zzx(paramArrayOfString[(i + paramInt2 - 1)]), l1, l2, 16785407L);
      zza(paramInt1, l1, zza(paramArrayOfString, i, paramInt2), paramArrayOfString.length, paramPriorityQueue);
    }
  }

  static void zza(int paramInt1, long paramLong, String paramString, int paramInt2, PriorityQueue<zza> paramPriorityQueue)
  {
    zza localzza = new zza(paramLong, paramString, paramInt2);
    if ((paramPriorityQueue.size() == paramInt1) && (((zza)paramPriorityQueue.peek()).value > localzza.value))
      return;
    if (paramPriorityQueue.contains(localzza))
      return;
    paramPriorityQueue.add(localzza);
    if (paramPriorityQueue.size() > paramInt1)
      paramPriorityQueue.poll();
  }

  static long zza(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3)
  {
    long l1 = paramLong2 * ((paramInt1 + 2147483647L) % 1073807359L) % 1073807359L;
    paramLong1 = (paramLong1 + 1073807359L - l1) % 1073807359L;
    paramLong1 = paramLong1 * paramLong3 % 1073807359L;
    long l2 = (paramInt2 + 2147483647L) % 1073807359L;
    paramLong1 += l2;
    paramLong1 %= 1073807359L;
    return paramLong1;
  }

  static String zza(String[] paramArrayOfString, int paramInt1, int paramInt2)
  {
    if (paramArrayOfString.length < paramInt1 + paramInt2)
    {
      zzin.e("Unable to construct shingle");
      return "";
    }
    StringBuffer localStringBuffer = new StringBuffer();
    for (int i = paramInt1; i < paramInt1 + paramInt2 - 1; i++)
    {
      localStringBuffer.append(paramArrayOfString[i]);
      localStringBuffer.append(' ');
    }
    localStringBuffer.append(paramArrayOfString[(paramInt1 + paramInt2 - 1)]);
    return localStringBuffer.toString();
  }

  private static long zzb(String[] paramArrayOfString, int paramInt1, int paramInt2)
  {
    long l = (zzbi.zzx(paramArrayOfString[paramInt1]) + 2147483647L) % 1073807359L;
    for (int i = paramInt1 + 1; i < paramInt1 + paramInt2; i++)
    {
      l = l * 16785407L % 1073807359L;
      l += (zzbi.zzx(paramArrayOfString[i]) + 2147483647L) % 1073807359L;
      l %= 1073807359L;
    }
    return l;
  }

  static long zza(long paramLong, int paramInt)
  {
    if (paramInt == 0)
      return 1L;
    if (paramInt == 1)
      return paramLong;
    if (paramInt % 2 == 0)
      return zza(paramLong * paramLong % 1073807359L, paramInt / 2) % 1073807359L;
    return paramLong * (zza(paramLong * paramLong % 1073807359L, paramInt / 2) % 1073807359L) % 1073807359L;
  }

  public static class zza
  {
    final long value;
    final String zztx;
    final int zzty;

    zza(long paramLong, String paramString, int paramInt)
    {
      this.value = paramLong;
      this.zztx = paramString;
      this.zzty = paramInt;
    }

    public boolean equals(Object other)
    {
      if ((other == null) || (!(other instanceof zza)))
        return false;
      return (((zza)other).value == this.value) && (((zza)other).zzty == this.zzty);
    }

    public int hashCode()
    {
      return (int)this.value;
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzbk
 * JD-Core Version:    0.6.0
 */