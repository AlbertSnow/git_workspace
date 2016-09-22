package com.google.android.gms.internal;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

@zzhb
public class zzbh
{
  private final int zztp;
  private final int zztq;
  private final int zztr;
  private final zzbg zzts = new zzbj();

  public zzbh(int paramInt)
  {
    this.zztq = paramInt;
    this.zztp = 6;
    this.zztr = 0;
  }

  public String zza(ArrayList<String> paramArrayList)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      str = str.toLowerCase(Locale.US);
      localStringBuffer.append(str);
      localStringBuffer.append('\n');
    }
    switch (this.zztr)
    {
    case 0:
      return zzw(localStringBuffer.toString());
    case 1:
      return zzv(localStringBuffer.toString());
    }
    return "";
  }

  zza zzcM()
  {
    return new zza();
  }

  private String zzv(String paramString)
  {
    String[] arrayOfString = paramString.split("\n");
    if (arrayOfString.length == 0)
      return "";
    zza localzza = zzcM();
    Arrays.sort(arrayOfString, new Comparator()
    {
      public int compare(String s1, String s2)
      {
        return s2.length() - s1.length();
      }
    });
    for (int i = 0; (i < arrayOfString.length) && (i < this.zztq); i++)
    {
      if (arrayOfString[i].trim().length() == 0)
        continue;
      try
      {
        localzza.write(this.zzts.zzu(arrayOfString[i]));
      }
      catch (IOException localIOException)
      {
        zzin.zzb("Error while writing hash to byteStream", localIOException);
        break;
      }
    }
    return localzza.toString();
  }

  String zzw(String paramString)
  {
    String[] arrayOfString1 = paramString.split("\n");
    if (arrayOfString1.length == 0)
      return "";
    zza localzza = zzcM();
    PriorityQueue localPriorityQueue = new PriorityQueue(this.zztq, new Comparator()
    {
      public int zza(zzbk.zza paramzza1, zzbk.zza paramzza2)
      {
        int i = paramzza1.zzty - paramzza2.zzty;
        return i != 0 ? i : (int)(paramzza1.value - paramzza2.value);
      }
    });
    Object localObject;
    for (int i = 0; i < arrayOfString1.length; i++)
    {
      localObject = arrayOfString1[i];
      String[] arrayOfString2 = zzbi.zzy((String)localObject);
      if (arrayOfString2.length == 0)
        continue;
      zzbk.zza(arrayOfString2, this.zztq, this.zztp, localPriorityQueue);
    }
    Iterator localIterator = localPriorityQueue.iterator();
    while (localIterator.hasNext())
    {
      localObject = (zzbk.zza)localIterator.next();
      try
      {
        localzza.write(this.zzts.zzu(((zzbk.zza)localObject).zztx));
      }
      catch (IOException localIOException)
      {
        zzin.zzb("Error while writing hash to byteStream", localIOException);
        break;
      }
    }
    return (String)localzza.toString();
  }

  static class zza
  {
    ByteArrayOutputStream zztu = new ByteArrayOutputStream(4096);
    Base64OutputStream zztv = new Base64OutputStream(this.zztu, 10);

    public void write(byte[] data)
      throws IOException
    {
      this.zztv.write(data);
    }

    public String toString()
    {
      try
      {
        this.zztv.close();
      }
      catch (IOException localIOException1)
      {
        zzin.zzb("HashManager: Unable to convert to Base64.", localIOException1);
      }
      try
      {
        this.zztu.close();
        String str1 = this.zztu.toString();
        return str1;
      }
      catch (IOException localIOException2)
      {
        zzin.zzb("HashManager: Unable to convert to Base64.", localIOException2);
        String str2 = "";
        return str2;
      }
      finally
      {
        this.zztu = null;
        this.zztv = null;
      }
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzbh
 * JD-Core Version:    0.6.0
 */