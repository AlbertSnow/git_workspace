package com.google.android.gms.internal;

import java.util.Date;
import java.util.Map;
import org.apache.http.impl.cookie.DateParseException;
import org.apache.http.impl.cookie.DateUtils;

public class zzx
{
  public static zzb.zza zzb(zzi paramzzi)
  {
    long l1 = System.currentTimeMillis();
    Map localMap = paramzzi.zzA;
    long l2 = 0L;
    long l3 = 0L;
    long l4 = 0L;
    long l5 = 0L;
    long l6 = 0L;
    long l7 = 0L;
    long l8 = 0L;
    int i = 0;
    int j = 0;
    String str1 = null;
    String str2 = (String)localMap.get("Date");
    if (str2 != null)
      l2 = zzg(str2);
    str2 = (String)localMap.get("Cache-Control");
    if (str2 != null)
    {
      i = 1;
      localObject = str2.split(",");
      for (int k = 0; k < localObject.length; k++)
      {
        String str3 = localObject[k].trim();
        if ((str3.equals("no-cache")) || (str3.equals("no-store")))
          return null;
        if (str3.startsWith("max-age="))
        {
          try
          {
            l7 = Long.parseLong(str3.substring(8));
          }
          catch (Exception localException1)
          {
          }
        }
        else if (str3.startsWith("stale-while-revalidate="))
        {
          try
          {
            l8 = Long.parseLong(str3.substring(23));
          }
          catch (Exception localException2)
          {
          }
        }
        else
        {
          if ((!str3.equals("must-revalidate")) && (!str3.equals("proxy-revalidate")))
            continue;
          j = 1;
        }
      }
    }
    str2 = (String)localMap.get("Expires");
    if (str2 != null)
      l4 = zzg(str2);
    str2 = (String)localMap.get("Last-Modified");
    if (str2 != null)
      l3 = zzg(str2);
    str1 = (String)localMap.get("ETag");
    if (i != 0)
    {
      l5 = l1 + l7 * 1000L;
      l6 = j != 0 ? l5 : l5 + l8 * 1000L;
    }
    else if ((l2 > 0L) && (l4 >= l2))
    {
      l5 = l1 + (l4 - l2);
      l6 = l5;
    }
    Object localObject = new zzb.zza();
    ((zzb.zza)localObject).data = paramzzi.data;
    ((zzb.zza)localObject).zzb = str1;
    ((zzb.zza)localObject).zzf = l5;
    ((zzb.zza)localObject).zze = l6;
    ((zzb.zza)localObject).zzc = l2;
    ((zzb.zza)localObject).zzd = l3;
    ((zzb.zza)localObject).zzg = localMap;
    return (zzb.zza)localObject;
  }

  public static long zzg(String paramString)
  {
    try
    {
      return DateUtils.parseDate(paramString).getTime();
    }
    catch (DateParseException localDateParseException)
    {
    }
    return 0L;
  }

  public static String zzb(Map<String, String> paramMap, String paramString)
  {
    String str = (String)paramMap.get("Content-Type");
    if (str != null)
    {
      String[] arrayOfString1 = str.split(";");
      for (int i = 1; i < arrayOfString1.length; i++)
      {
        String[] arrayOfString2 = arrayOfString1[i].trim().split("=");
        if ((arrayOfString2.length == 2) && (arrayOfString2[0].equals("charset")))
          return arrayOfString2[1];
      }
    }
    return paramString;
  }

  public static String zza(Map<String, String> paramMap)
  {
    return zzb(paramMap, "ISO-8859-1");
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzx
 * JD-Core Version:    0.6.0
 */