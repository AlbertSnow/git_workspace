package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzr;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@zzhb
public class zzdu extends zzdr
{
  private static final Set<String> zzzX = Collections.synchronizedSet(new HashSet());
  private static final DecimalFormat zzzY = new DecimalFormat("#,###");
  private File zzzZ;
  private boolean zzAa;

  public zzdu(zzjp paramzzjp)
  {
    super(paramzzjp);
    File localFile = this.mContext.getCacheDir();
    if (localFile == null)
    {
      zzin.zzaK("Context.getCacheDir() returned null");
      return;
    }
    this.zzzZ = new File(localFile, "admobVideoStreams");
    if ((!this.zzzZ.isDirectory()) && (!this.zzzZ.mkdirs()))
    {
      zzin.zzaK("Could not create preload cache directory at " + this.zzzZ.getAbsolutePath());
      this.zzzZ = null;
      return;
    }
    if ((!this.zzzZ.setReadable(true, false)) || (!this.zzzZ.setExecutable(true, false)))
    {
      zzin.zzaK("Could not set cache file permissions at " + this.zzzZ.getAbsolutePath());
      this.zzzZ = null;
      return;
    }
  }

  public boolean zzU(String paramString)
  {
    if (this.zzzZ == null)
    {
      zza(paramString, null, "noCacheDir", null);
      return false;
    }
    while (zzea() > ((Integer)zzbt.zzvO.get()).intValue())
    {
      if (zzeb())
        continue;
      zzin.zzaK("Unable to expire stream cache");
      zza(paramString, null, "expireFailed", null);
      return false;
    }
    String str1 = zzV(paramString);
    File localFile1 = new File(this.zzzZ, str1);
    File localFile2 = zza(localFile1);
    if ((localFile1.isFile()) && (localFile2.isFile()))
    {
      int i = (int)localFile1.length();
      zzin.zzaI("Stream cache hit at " + paramString);
      zza(paramString, localFile1.getAbsolutePath(), i);
      return true;
    }
    String str2 = this.zzzZ.getAbsolutePath() + paramString;
    synchronized (zzzX)
    {
      if (zzzX.contains(str2))
      {
        zzin.zzaK("Stream cache already in progress at " + paramString);
        zza(paramString, localFile1.getAbsolutePath(), "inProgress", null);
        return false;
      }
      zzzX.add(str2);
    }
    ??? = null;
    String str3 = "error";
    String str4 = null;
    try
    {
      URLConnection localURLConnection = new URL(paramString).openConnection();
      int j = ((Integer)zzbt.zzvT.get()).intValue();
      localURLConnection.setConnectTimeout(j);
      localURLConnection.setReadTimeout(j);
      if ((localURLConnection instanceof HttpURLConnection))
      {
        k = ((HttpURLConnection)localURLConnection).getResponseCode();
        if (k >= 400)
        {
          str3 = "badUrl";
          str4 = "HTTP request failed. Code: " + Integer.toString(k);
          throw new IOException("HTTP status code " + k + " at " + paramString);
        }
      }
      int k = localURLConnection.getContentLength();
      if (k < 0)
      {
        zzin.zzaK("Stream cache aborted, missing content-length header at " + paramString);
        zza(paramString, localFile1.getAbsolutePath(), "contentLengthMissing", null);
        zzzX.remove(str2);
        return false;
      }
      String str5 = zzzY.format(k);
      int m = ((Integer)zzbt.zzvP.get()).intValue();
      if (k > m)
      {
        zzin.zzaK("Content length " + str5 + " exceeds limit at " + paramString);
        localObject2 = "File too big for full file cache. Size: " + str5;
        zza(paramString, localFile1.getAbsolutePath(), "sizeExceeded", (String)localObject2);
        zzzX.remove(str2);
        return false;
      }
      zzin.zzaI("Caching " + str5 + " bytes from " + paramString);
      Object localObject2 = localURLConnection.getInputStream();
      ReadableByteChannel localReadableByteChannel = Channels.newChannel((InputStream)localObject2);
      ??? = new FileOutputStream(localFile1);
      FileChannel localFileChannel = ((FileOutputStream)???).getChannel();
      ByteBuffer localByteBuffer = ByteBuffer.allocate(1048576);
      zzmq localzzmq = zzr.zzbG();
      int n = 0;
      long l1 = localzzmq.currentTimeMillis();
      long l2 = ((Long)zzbt.zzvS.get()).longValue();
      zziz localzziz = new zziz(l2);
      long l3 = ((Long)zzbt.zzvR.get()).longValue();
      int i1;
      while ((i1 = localReadableByteChannel.read(localByteBuffer)) >= 0)
      {
        n += i1;
        if (n > m)
        {
          str3 = "sizeExceeded";
          str4 = "File too big for full file cache. Size: " + Integer.toString(n);
          throw new IOException("stream cache file size limit exceeded");
        }
        localByteBuffer.flip();
        while (localFileChannel.write(localByteBuffer) > 0);
        localByteBuffer.clear();
        long l4 = localzzmq.currentTimeMillis();
        if (l4 - l1 > l3 * 1000L)
        {
          str3 = "downloadTimeout";
          str4 = "Timeout exceeded. Limit: " + Long.toString(l3) + " sec";
          throw new IOException("stream cache time limit exceeded");
        }
        if (this.zzAa)
        {
          str3 = "externalAbort";
          throw new IOException("abort requested");
        }
        if (localzziz.tryAcquire())
          zza(paramString, localFile1.getAbsolutePath(), n, k, false);
      }
      ((FileOutputStream)???).close();
      if (zzin.zzQ(3))
      {
        String str6 = zzzY.format(n);
        zzin.zzaI("Preloaded " + str6 + " bytes from " + paramString);
      }
      localFile1.setReadable(true, false);
      zzb(localFile2);
      zza(paramString, localFile1.getAbsolutePath(), n);
      zzzX.remove(str2);
      return true;
    }
    catch (RuntimeException localRuntimeException)
    {
      if ((localRuntimeException instanceof RuntimeException))
        zzr.zzbF().zzb(localRuntimeException, true);
      try
      {
        ((FileOutputStream)???).close();
      }
      catch (NullPointerException localNullPointerException)
      {
      }
      if (this.zzAa)
        zzin.zzaJ("Preload aborted for URL \"" + paramString + "\"");
      else
        zzin.zzd("Preload failed for URL \"" + paramString + "\"", localRuntimeException);
      if ((localFile1.exists()) && (!localFile1.delete()))
        zzin.zzaK("Could not delete partial cache file at " + localFile1.getAbsolutePath());
      zza(paramString, localFile1.getAbsolutePath(), str3, str4);
      zzzX.remove(str2);
    }
    return false;
  }

  public void abort()
  {
    this.zzAa = true;
  }

  public int zzea()
  {
    if (this.zzzZ == null)
      return 0;
    int i = 0;
    for (File localFile : this.zzzZ.listFiles())
    {
      if (localFile.getName().endsWith(".done"))
        continue;
      i++;
    }
    return i;
  }

  public boolean zzeb()
  {
    if (this.zzzZ == null)
      return false;
    Object localObject = null;
    long l1 = 9223372036854775807L;
    for (File localFile2 : this.zzzZ.listFiles())
    {
      if (localFile2.getName().endsWith(".done"))
        continue;
      long l2 = localFile2.lastModified();
      if (l2 >= l1)
        continue;
      localObject = localFile2;
      l1 = l2;
    }
    boolean bool = false;
    if (localObject != null)
    {
      bool = localObject.delete();
      File localFile1 = zza(localObject);
      if (localFile1.isFile())
        bool &= localFile1.delete();
    }
    return bool;
  }

  private File zza(File paramFile)
  {
    return new File(this.zzzZ, paramFile.getName() + ".done");
  }

  private static void zzb(File paramFile)
  {
    if (paramFile.isFile())
      paramFile.setLastModified(System.currentTimeMillis());
    else
      try
      {
        paramFile.createNewFile();
      }
      catch (IOException localIOException)
      {
      }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzdu
 * JD-Core Version:    0.6.0
 */