package com.google.android.gms.internal;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.cookie.DateUtils;

public class zzt
  implements zzf
{
  protected static final boolean DEBUG = zzs.DEBUG;
  private static int zzao = 3000;
  private static int zzap = 4096;
  protected final zzy zzaq;
  protected final zzu zzar;

  public zzt(zzy paramzzy)
  {
    this(paramzzy, new zzu(zzap));
  }

  public zzt(zzy paramzzy, zzu paramzzu)
  {
    this.zzaq = paramzzy;
    this.zzar = paramzzu;
  }

  public zzi zza(zzk<?> paramzzk)
    throws zzr
  {
    long l1 = SystemClock.elapsedRealtime();
    while (true)
    {
      HttpResponse localHttpResponse = null;
      byte[] arrayOfByte = null;
      Map localMap = Collections.emptyMap();
      int i;
      zzi localzzi;
      try
      {
        HashMap localHashMap = new HashMap();
        zza(localHashMap, paramzzk.zzi());
        localHttpResponse = this.zzaq.zza(paramzzk, localHashMap);
        StatusLine localStatusLine = localHttpResponse.getStatusLine();
        int j = localStatusLine.getStatusCode();
        localMap = zza(localHttpResponse.getAllHeaders());
        if (j == 304)
        {
          zzb.zza localzza = paramzzk.zzi();
          if (localzza == null)
            return new zzi(304, null, localMap, true, SystemClock.elapsedRealtime() - l1);
          localzza.zzg.putAll(localMap);
          return new zzi(304, localzza.data, localzza.zzg, true, SystemClock.elapsedRealtime() - l1);
        }
        if (localHttpResponse.getEntity() != null)
          arrayOfByte = zza(localHttpResponse.getEntity());
        else
          arrayOfByte = new byte[0];
        long l2 = SystemClock.elapsedRealtime() - l1;
        zza(l2, paramzzk, arrayOfByte, localStatusLine);
        if ((j < 200) || (j > 299))
          throw new IOException();
        return new zzi(j, arrayOfByte, localMap, false, SystemClock.elapsedRealtime() - l1);
      }
      catch (SocketTimeoutException localSocketTimeoutException)
      {
        zza("socket", paramzzk, new zzq());
      }
      catch (ConnectTimeoutException localConnectTimeoutException)
      {
        zza("connection", paramzzk, new zzq());
      }
      catch (MalformedURLException localMalformedURLException)
      {
        throw new RuntimeException("Bad URL " + paramzzk.getUrl(), localMalformedURLException);
      }
      catch (IOException localIOException)
      {
        i = 0;
        localzzi = null;
        if (localHttpResponse != null)
          i = localHttpResponse.getStatusLine().getStatusCode();
        else
          throw new zzj(localIOException);
      }
      zzs.zzc("Unexpected response code %d for %s", new Object[] { Integer.valueOf(i), paramzzk.getUrl() });
      if (arrayOfByte != null)
      {
        localzzi = new zzi(i, arrayOfByte, localMap, false, SystemClock.elapsedRealtime() - l1);
        if ((i == 401) || (i == 403))
          zza("auth", paramzzk, new zza(localzzi));
        else
          throw new zzp(localzzi);
      }
      else
      {
        throw new zzh(localzzi);
      }
    }
  }

  private void zza(long paramLong, zzk<?> paramzzk, byte[] paramArrayOfByte, StatusLine paramStatusLine)
  {
    if ((DEBUG) || (paramLong > zzao))
      zzs.zzb("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", new Object[] { paramzzk, Long.valueOf(paramLong), paramArrayOfByte != null ? Integer.valueOf(paramArrayOfByte.length) : "null", Integer.valueOf(paramStatusLine.getStatusCode()), Integer.valueOf(paramzzk.zzu().zze()) });
  }

  private static void zza(String paramString, zzk<?> paramzzk, zzr paramzzr)
    throws zzr
  {
    zzo localzzo = paramzzk.zzu();
    int i = paramzzk.zzt();
    try
    {
      localzzo.zza(paramzzr);
    }
    catch (zzr localzzr)
    {
      paramzzk.zzc(String.format("%s-timeout-giveup [timeout=%s]", new Object[] { paramString, Integer.valueOf(i) }));
      throw localzzr;
    }
    paramzzk.zzc(String.format("%s-retry [timeout=%s]", new Object[] { paramString, Integer.valueOf(i) }));
  }

  private void zza(Map<String, String> paramMap, zzb.zza paramzza)
  {
    if (paramzza == null)
      return;
    if (paramzza.zzb != null)
      paramMap.put("If-None-Match", paramzza.zzb);
    if (paramzza.zzd > 0L)
    {
      Date localDate = new Date(paramzza.zzd);
      paramMap.put("If-Modified-Since", DateUtils.formatDate(localDate));
    }
  }

  private byte[] zza(HttpEntity paramHttpEntity)
    throws IOException, zzp
  {
    zzaa localzzaa = new zzaa(this.zzar, (int)paramHttpEntity.getContentLength());
    byte[] arrayOfByte1 = null;
    try
    {
      InputStream localInputStream = paramHttpEntity.getContent();
      if (localInputStream == null)
        throw new zzp();
      arrayOfByte1 = this.zzar.zzb(1024);
      int i;
      while ((i = localInputStream.read(arrayOfByte1)) != -1)
        localzzaa.write(arrayOfByte1, 0, i);
      byte[] arrayOfByte2 = localzzaa.toByteArray();
      return arrayOfByte2;
    }
    finally
    {
      try
      {
        paramHttpEntity.consumeContent();
      }
      catch (IOException localIOException2)
      {
        zzs.zza("Error occured when calling consumingContent", new Object[0]);
      }
      this.zzar.zza(arrayOfByte1);
      localzzaa.close();
    }
    throw localObject;
  }

  protected static Map<String, String> zza(Header[] paramArrayOfHeader)
  {
    TreeMap localTreeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    for (int i = 0; i < paramArrayOfHeader.length; i++)
      localTreeMap.put(paramArrayOfHeader[i].getName(), paramArrayOfHeader[i].getValue());
    return localTreeMap;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzt
 * JD-Core Version:    0.6.0
 */