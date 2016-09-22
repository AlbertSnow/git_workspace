package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class zzu
{
  private List<byte[]> zzas = new LinkedList();
  private List<byte[]> zzat = new ArrayList(64);
  private int zzau = 0;
  private final int zzav;
  protected static final Comparator<byte[]> zzaw = new Comparator()
  {
    public int zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
    {
      return paramArrayOfByte1.length - paramArrayOfByte2.length;
    }
  };

  public zzu(int paramInt)
  {
    this.zzav = paramInt;
  }

  public synchronized byte[] zzb(int paramInt)
  {
    for (int i = 0; i < this.zzat.size(); i++)
    {
      byte[] arrayOfByte = (byte[])this.zzat.get(i);
      if (arrayOfByte.length < paramInt)
        continue;
      this.zzau -= arrayOfByte.length;
      this.zzat.remove(i);
      this.zzas.remove(arrayOfByte);
      return arrayOfByte;
    }
    return new byte[paramInt];
  }

  public synchronized void zza(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length > this.zzav))
      return;
    this.zzas.add(paramArrayOfByte);
    int i = Collections.binarySearch(this.zzat, paramArrayOfByte, zzaw);
    if (i < 0)
      i = -i - 1;
    this.zzat.add(i, paramArrayOfByte);
    this.zzau += paramArrayOfByte.length;
    zzy();
  }

  private synchronized void zzy()
  {
    while (this.zzau > this.zzav)
    {
      byte[] arrayOfByte = (byte[])this.zzas.remove(0);
      this.zzat.remove(arrayOfByte);
      this.zzau -= arrayOfByte.length;
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzu
 * JD-Core Version:    0.6.0
 */