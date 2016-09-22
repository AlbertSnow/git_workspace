package com.google.android.gms.internal;

import android.os.SystemClock;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class zzv
  implements zzb
{
  private final Map<String, zza> zzax = new LinkedHashMap(16, 0.75F, true);
  private long zzay = 0L;
  private final File zzaz;
  private final int zzaA;

  public zzv(File paramFile, int paramInt)
  {
    this.zzaz = paramFile;
    this.zzaA = paramInt;
  }

  public zzv(File paramFile)
  {
    this(paramFile, 5242880);
  }

  public synchronized zzb.zza zza(String paramString)
  {
    zza localzza = (zza)this.zzax.get(paramString);
    if (localzza == null)
      return null;
    File localFile = zzf(paramString);
    zzb localzzb = null;
    try
    {
      localzzb = new zzb(new FileInputStream(localFile), null);
      zza.zzf(localzzb);
      byte[] arrayOfByte = zza(localzzb, (int)(localFile.length() - zzb.zza(localzzb)));
      localzza1 = localzza.zzb(arrayOfByte);
      return localzza1;
    }
    catch (IOException localIOException1)
    {
      zzs.zzb("%s: %s", new Object[] { localFile.getAbsolutePath(), localIOException1.toString() });
      remove(paramString);
      zzb.zza localzza1 = null;
      return localzza1;
    }
    finally
    {
      if (localzzb != null)
        try
        {
          localzzb.close();
        }
        catch (IOException localIOException4)
        {
          return null;
        }
    }
    throw localObject;
  }

  public synchronized void zza()
  {
    if (!this.zzaz.exists())
    {
      if (!this.zzaz.mkdirs())
        zzs.zzc("Unable to create cache dir %s", new Object[] { this.zzaz.getAbsolutePath() });
      return;
    }
    File[] arrayOfFile1 = this.zzaz.listFiles();
    if (arrayOfFile1 == null)
      return;
    for (File localFile : arrayOfFile1)
    {
      BufferedInputStream localBufferedInputStream = null;
      try
      {
        localBufferedInputStream = new BufferedInputStream(new FileInputStream(localFile));
        zza localzza = zza.zzf(localBufferedInputStream);
        localzza.zzaB = localFile.length();
        zza(localzza.key, localzza);
      }
      catch (IOException localIOException3)
      {
        if (localFile != null)
          localFile.delete();
      }
      finally
      {
        try
        {
          if (localBufferedInputStream != null)
            localBufferedInputStream.close();
        }
        catch (IOException localIOException4)
        {
        }
      }
    }
  }

  public synchronized void zza(String paramString, zzb.zza paramzza)
  {
    zzc(paramzza.data.length);
    File localFile = zzf(paramString);
    try
    {
      FileOutputStream localFileOutputStream = new FileOutputStream(localFile);
      zza localzza = new zza(paramString, paramzza);
      boolean bool2 = localzza.zza(localFileOutputStream);
      if (!bool2)
      {
        localFileOutputStream.close();
        zzs.zzb("Failed to write header for %s", new Object[] { localFile.getAbsolutePath() });
        throw new IOException();
      }
      localFileOutputStream.write(paramzza.data);
      localFileOutputStream.close();
      zza(paramString, localzza);
      return;
    }
    catch (IOException bool1)
    {
      boolean bool1 = localFile.delete();
      if (!bool1)
        zzs.zzb("Could not clean up file %s", new Object[] { localFile.getAbsolutePath() });
    }
  }

  public synchronized void remove(String key)
  {
    boolean bool = zzf(key).delete();
    removeEntry(key);
    if (!bool)
      zzs.zzb("Could not delete cache entry for key=%s, filename=%s", new Object[] { key, zze(key) });
  }

  private String zze(String paramString)
  {
    int i = paramString.length() / 2;
    String str = String.valueOf(paramString.substring(0, i).hashCode());
    str = str + String.valueOf(paramString.substring(i).hashCode());
    return str;
  }

  public File zzf(String paramString)
  {
    return new File(this.zzaz, zze(paramString));
  }

  private void zzc(int paramInt)
  {
    if (this.zzay + paramInt < this.zzaA)
      return;
    if (zzs.DEBUG)
      zzs.zza("Pruning old cache entries.", new Object[0]);
    long l1 = this.zzay;
    int i = 0;
    long l2 = SystemClock.elapsedRealtime();
    Iterator localIterator = this.zzax.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      zza localzza = (zza)localEntry.getValue();
      boolean bool = zzf(localzza.key).delete();
      if (bool)
        this.zzay -= localzza.zzaB;
      else
        zzs.zzb("Could not delete cache entry for key=%s, filename=%s", new Object[] { localzza.key, zze(localzza.key) });
      localIterator.remove();
      i++;
      if ((float)(this.zzay + paramInt) < this.zzaA * 0.9F)
        break;
    }
    if (zzs.DEBUG)
      zzs.zza("pruned %d files, %d bytes, %d ms", new Object[] { Integer.valueOf(i), Long.valueOf(this.zzay - l1), Long.valueOf(SystemClock.elapsedRealtime() - l2) });
  }

  private void zza(String paramString, zza paramzza)
  {
    if (!this.zzax.containsKey(paramString))
    {
      this.zzay += paramzza.zzaB;
    }
    else
    {
      zza localzza = (zza)this.zzax.get(paramString);
      this.zzay += paramzza.zzaB - localzza.zzaB;
    }
    this.zzax.put(paramString, paramzza);
  }

  private void removeEntry(String key)
  {
    zza localzza = (zza)this.zzax.get(key);
    if (localzza != null)
    {
      this.zzay -= localzza.zzaB;
      this.zzax.remove(key);
    }
  }

  private static byte[] zza(InputStream paramInputStream, int paramInt)
    throws IOException
  {
    byte[] arrayOfByte = new byte[paramInt];
    int j = 0;
    int i;
    while ((j < paramInt) && ((i = paramInputStream.read(arrayOfByte, j, paramInt - j)) != -1))
      j += i;
    if (j != paramInt)
      throw new IOException("Expected " + paramInt + " bytes, read " + j + " bytes");
    return arrayOfByte;
  }

  private static int zza(InputStream paramInputStream)
    throws IOException
  {
    int i = paramInputStream.read();
    if (i == -1)
      throw new EOFException();
    return i;
  }

  static void zza(OutputStream paramOutputStream, int paramInt)
    throws IOException
  {
    paramOutputStream.write(paramInt >> 0 & 0xFF);
    paramOutputStream.write(paramInt >> 8 & 0xFF);
    paramOutputStream.write(paramInt >> 16 & 0xFF);
    paramOutputStream.write(paramInt >> 24 & 0xFF);
  }

  static int zzb(InputStream paramInputStream)
    throws IOException
  {
    int i = 0;
    i |= zza(paramInputStream) << 0;
    i |= zza(paramInputStream) << 8;
    i |= zza(paramInputStream) << 16;
    i |= zza(paramInputStream) << 24;
    return i;
  }

  static void zza(OutputStream paramOutputStream, long paramLong)
    throws IOException
  {
    paramOutputStream.write((byte)(int)(paramLong >>> 0));
    paramOutputStream.write((byte)(int)(paramLong >>> 8));
    paramOutputStream.write((byte)(int)(paramLong >>> 16));
    paramOutputStream.write((byte)(int)(paramLong >>> 24));
    paramOutputStream.write((byte)(int)(paramLong >>> 32));
    paramOutputStream.write((byte)(int)(paramLong >>> 40));
    paramOutputStream.write((byte)(int)(paramLong >>> 48));
    paramOutputStream.write((byte)(int)(paramLong >>> 56));
  }

  static long zzc(InputStream paramInputStream)
    throws IOException
  {
    long l = 0L;
    l |= (zza(paramInputStream) & 0xFF) << 0;
    l |= (zza(paramInputStream) & 0xFF) << 8;
    l |= (zza(paramInputStream) & 0xFF) << 16;
    l |= (zza(paramInputStream) & 0xFF) << 24;
    l |= (zza(paramInputStream) & 0xFF) << 32;
    l |= (zza(paramInputStream) & 0xFF) << 40;
    l |= (zza(paramInputStream) & 0xFF) << 48;
    l |= (zza(paramInputStream) & 0xFF) << 56;
    return l;
  }

  static void zza(OutputStream paramOutputStream, String paramString)
    throws IOException
  {
    byte[] arrayOfByte = paramString.getBytes("UTF-8");
    zza(paramOutputStream, arrayOfByte.length);
    paramOutputStream.write(arrayOfByte, 0, arrayOfByte.length);
  }

  static String zzd(InputStream paramInputStream)
    throws IOException
  {
    int i = (int)zzc(paramInputStream);
    byte[] arrayOfByte = zza(paramInputStream, i);
    return new String(arrayOfByte, "UTF-8");
  }

  static void zza(Map<String, String> paramMap, OutputStream paramOutputStream)
    throws IOException
  {
    if (paramMap != null)
    {
      zza(paramOutputStream, paramMap.size());
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        zza(paramOutputStream, (String)localEntry.getKey());
        zza(paramOutputStream, (String)localEntry.getValue());
      }
    }
    else
    {
      zza(paramOutputStream, 0);
    }
  }

  static Map<String, String> zze(InputStream paramInputStream)
    throws IOException
  {
    int i = zzb(paramInputStream);
    HashMap localHashMap = i == 0 ? Collections.emptyMap() : new HashMap(i);
    for (int j = 0; j < i; j++)
    {
      String str1 = zzd(paramInputStream).intern();
      String str2 = zzd(paramInputStream).intern();
      localHashMap.put(str1, str2);
    }
    return localHashMap;
  }

  private static class zzb extends FilterInputStream
  {
    private int zzaC = 0;

    private zzb(InputStream paramInputStream)
    {
      super();
    }

    public int read()
      throws IOException
    {
      int i = super.read();
      if (i != -1)
        this.zzaC += 1;
      return i;
    }

    public int read(byte[] buffer, int offset, int count)
      throws IOException
    {
      int i = super.read(buffer, offset, count);
      if (i != -1)
        this.zzaC += i;
      return i;
    }
  }

  static class zza
  {
    public long zzaB;
    public String key;
    public String zzb;
    public long zzc;
    public long zzd;
    public long zze;
    public long zzf;
    public Map<String, String> zzg;

    private zza()
    {
    }

    public zza(String paramString, zzb.zza paramzza)
    {
      this.key = paramString;
      this.zzaB = paramzza.data.length;
      this.zzb = paramzza.zzb;
      this.zzc = paramzza.zzc;
      this.zzd = paramzza.zzd;
      this.zze = paramzza.zze;
      this.zzf = paramzza.zzf;
      this.zzg = paramzza.zzg;
    }

    public static zza zzf(InputStream paramInputStream)
      throws IOException
    {
      zza localzza = new zza();
      int i = zzv.zzb(paramInputStream);
      if (i != 538247942)
        throw new IOException();
      localzza.key = zzv.zzd(paramInputStream);
      localzza.zzb = zzv.zzd(paramInputStream);
      if (localzza.zzb.equals(""))
        localzza.zzb = null;
      localzza.zzc = zzv.zzc(paramInputStream);
      localzza.zzd = zzv.zzc(paramInputStream);
      localzza.zze = zzv.zzc(paramInputStream);
      localzza.zzf = zzv.zzc(paramInputStream);
      localzza.zzg = zzv.zze(paramInputStream);
      return localzza;
    }

    public zzb.zza zzb(byte[] paramArrayOfByte)
    {
      zzb.zza localzza = new zzb.zza();
      localzza.data = paramArrayOfByte;
      localzza.zzb = this.zzb;
      localzza.zzc = this.zzc;
      localzza.zzd = this.zzd;
      localzza.zze = this.zze;
      localzza.zzf = this.zzf;
      localzza.zzg = this.zzg;
      return localzza;
    }

    public boolean zza(OutputStream paramOutputStream)
    {
      try
      {
        zzv.zza(paramOutputStream, 538247942);
        zzv.zza(paramOutputStream, this.key);
        zzv.zza(paramOutputStream, this.zzb == null ? "" : this.zzb);
        zzv.zza(paramOutputStream, this.zzc);
        zzv.zza(paramOutputStream, this.zzd);
        zzv.zza(paramOutputStream, this.zze);
        zzv.zza(paramOutputStream, this.zzf);
        zzv.zza(this.zzg, paramOutputStream);
        paramOutputStream.flush();
        return true;
      }
      catch (IOException localIOException)
      {
        zzs.zzb("%s", new Object[] { localIOException.toString() });
      }
      return false;
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzv
 * JD-Core Version:    0.6.0
 */