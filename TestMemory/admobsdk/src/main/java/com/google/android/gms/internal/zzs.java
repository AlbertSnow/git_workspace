package com.google.android.gms.internal;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class zzs
{
  public static String TAG = "Volley";
  public static boolean DEBUG = Log.isLoggable(TAG, 2);

  public static void zza(String paramString, Object[] paramArrayOfObject)
  {
    if (DEBUG)
      Log.v(TAG, zzd(paramString, paramArrayOfObject));
  }

  public static void zzb(String paramString, Object[] paramArrayOfObject)
  {
    Log.d(TAG, zzd(paramString, paramArrayOfObject));
  }

  public static void zzc(String paramString, Object[] paramArrayOfObject)
  {
    Log.e(TAG, zzd(paramString, paramArrayOfObject));
  }

  public static void zza(Throwable paramThrowable, String paramString, Object[] paramArrayOfObject)
  {
    Log.e(TAG, zzd(paramString, paramArrayOfObject), paramThrowable);
  }

  private static String zzd(String paramString, Object[] paramArrayOfObject)
  {
    String str1 = paramArrayOfObject == null ? paramString : String.format(Locale.US, paramString, paramArrayOfObject);
    StackTraceElement[] arrayOfStackTraceElement = new Throwable().fillInStackTrace().getStackTrace();
    String str2 = "<unknown>";
    for (int i = 2; i < arrayOfStackTraceElement.length; i++)
    {
      Class localClass = arrayOfStackTraceElement[i].getClass();
      if (localClass.equals(zzs.class))
        continue;
      String str3 = arrayOfStackTraceElement[i].getClassName();
      str3 = str3.substring(str3.lastIndexOf('.') + 1);
      str3 = str3.substring(str3.lastIndexOf('$') + 1);
      str2 = str3 + "." + arrayOfStackTraceElement[i].getMethodName();
      break;
    }
    return String.format(Locale.US, "[%d] %s: %s", new Object[] { Long.valueOf(Thread.currentThread().getId()), str2, str1 });
  }

  static class zza
  {
    public static final boolean zzak = zzs.DEBUG;
    private final List<zza> zzal = new ArrayList();
    private boolean zzam = false;

    public synchronized void zza(String paramString, long paramLong)
    {
      if (this.zzam)
        throw new IllegalStateException("Marker added to finished log");
      this.zzal.add(new zza(paramString, paramLong, SystemClock.elapsedRealtime()));
    }

    public synchronized void zzd(String paramString)
    {
      this.zzam = true;
      long l1 = zzx();
      if (l1 <= 0L)
        return;
      long l2 = ((zza)this.zzal.get(0)).time;
      zzs.zzb("(%-4d ms) %s", new Object[] { Long.valueOf(l1), paramString });
      Iterator localIterator = this.zzal.iterator();
      while (localIterator.hasNext())
      {
        zza localzza = (zza)localIterator.next();
        long l3 = localzza.time;
        zzs.zzb("(+%-4d) [%2d] %s", new Object[] { Long.valueOf(l3 - l2), Long.valueOf(localzza.zzan), localzza.name });
        l2 = l3;
      }
    }

    protected void finalize()
      throws Throwable
    {
      if (!this.zzam)
      {
        zzd("Request on the loose");
        zzs.zzc("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
      }
    }

    private long zzx()
    {
      if (this.zzal.size() == 0)
        return 0L;
      long l1 = ((zza)this.zzal.get(0)).time;
      long l2 = ((zza)this.zzal.get(this.zzal.size() - 1)).time;
      return l2 - l1;
    }

    private static class zza
    {
      public final String name;
      public final long zzan;
      public final long time;

      public zza(String paramString, long paramLong1, long paramLong2)
      {
        this.name = paramString;
        this.zzan = paramLong1;
        this.time = paramLong2;
      }
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzs
 * JD-Core Version:    0.6.0
 */