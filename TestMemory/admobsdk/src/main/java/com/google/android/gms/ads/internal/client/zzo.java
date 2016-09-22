package com.google.android.gms.ads.internal.client;

import com.google.android.gms.internal.zzhb;
import java.util.Random;

@zzhb
public class zzo extends zzx.zza
{
  private final Random zzuy = new Random();
  private long zzuz;
  private Object zzpV = new Object();

  public zzo()
  {
    zzcY();
  }

  public void zzcY()
  {
    synchronized (this.zzpV)
    {
      long l = 0L;
      int i = 3;
      while (true)
      {
        i--;
        if (i <= 0)
          break;
        l = this.zzuy.nextInt() + 2147483648L;
        if ((l == this.zzuz) || (l == 0L))
          continue;
      }
      this.zzuz = l;
    }
  }

  public long getValue()
  {
    return this.zzuz;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzo
 * JD-Core Version:    0.6.0
 */