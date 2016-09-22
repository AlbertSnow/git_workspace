package com.google.android.gms.ads.internal.csi;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.config.d;
import com.google.android.gms.ads.internal.config.m;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.y;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

@a
public final class b
{
  public LinkedHashMap a = new LinkedHashMap();
  private BlockingQueue b;
  private ExecutorService c;
  private Map d = new HashMap();
  private String e;
  private Context f;
  private String g;
  private AtomicBoolean h;
  private File i;

  public b(Context paramContext, String paramString1, String paramString2, Map paramMap)
  {
    this.f = paramContext;
    this.g = paramString1;
    this.e = paramString2;
    this.h = new AtomicBoolean(false);
    this.h.set(((Boolean)m.x.a()).booleanValue());
    if (this.h.get())
    {
      File localFile = Environment.getExternalStorageDirectory();
      if (localFile != null)
        this.i = new File(localFile, "sdk_csi_data.txt");
    }
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      this.a.put((String)localEntry.getKey(), (String)localEntry.getValue());
    }
    this.b = new ArrayBlockingQueue(30);
    this.c = Executors.newSingleThreadExecutor();
    this.c.execute(new c(this));
    this.d.put("action", f.b);
    this.d.put("ad_format", f.b);
    this.d.put("e", f.c);
  }

  // ERROR //
  private static void a(File paramFile, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +97 -> 98
    //   4: new 165	java/io/FileOutputStream
    //   7: dup
    //   8: aload_0
    //   9: iconst_1
    //   10: invokespecial 168	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   13: astore_2
    //   14: aload_2
    //   15: aload_1
    //   16: invokevirtual 172	java/lang/String:getBytes	()[B
    //   19: invokevirtual 176	java/io/FileOutputStream:write	([B)V
    //   22: aload_2
    //   23: bipush 10
    //   25: invokevirtual 178	java/io/FileOutputStream:write	(I)V
    //   28: aload_2
    //   29: invokevirtual 181	java/io/FileOutputStream:close	()V
    //   32: return
    //   33: astore 7
    //   35: ldc 183
    //   37: aload 7
    //   39: invokestatic 188	com/google/android/gms/ads/internal/util/c:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   42: return
    //   43: astore_3
    //   44: aconst_null
    //   45: astore_2
    //   46: ldc 190
    //   48: aload_3
    //   49: invokestatic 188	com/google/android/gms/ads/internal/util/c:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   52: aload_2
    //   53: ifnull -21 -> 32
    //   56: aload_2
    //   57: invokevirtual 181	java/io/FileOutputStream:close	()V
    //   60: return
    //   61: astore 6
    //   63: ldc 183
    //   65: aload 6
    //   67: invokestatic 188	com/google/android/gms/ads/internal/util/c:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   70: return
    //   71: astore 4
    //   73: aconst_null
    //   74: astore_2
    //   75: aload_2
    //   76: ifnull +7 -> 83
    //   79: aload_2
    //   80: invokevirtual 181	java/io/FileOutputStream:close	()V
    //   83: aload 4
    //   85: athrow
    //   86: astore 5
    //   88: ldc 183
    //   90: aload 5
    //   92: invokestatic 188	com/google/android/gms/ads/internal/util/c:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   95: goto -12 -> 83
    //   98: ldc 192
    //   100: invokestatic 195	com/google/android/gms/ads/internal/util/c:e	(Ljava/lang/String;)V
    //   103: return
    //   104: astore 4
    //   106: goto -31 -> 75
    //   109: astore_3
    //   110: goto -64 -> 46
    //
    // Exception table:
    //   from	to	target	type
    //   28	32	33	java/io/IOException
    //   4	14	43	java/io/IOException
    //   56	60	61	java/io/IOException
    //   4	14	71	finally
    //   79	83	86	java/io/IOException
    //   14	28	104	finally
    //   46	52	104	finally
    //   14	28	109	java/io/IOException
  }

  public final f a(String paramString)
  {
    f localf = (f)this.d.get(paramString);
    if (localf != null)
      return localf;
    return f.a;
  }

  final Map a(Map paramMap1, Map paramMap2)
  {
    LinkedHashMap localLinkedHashMap = new LinkedHashMap(paramMap1);
    if (paramMap2 == null)
      return localLinkedHashMap;
    Iterator localIterator = paramMap2.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      String str1 = (String)localEntry.getKey();
      String str2 = (String)localEntry.getValue();
      String str3 = (String)localLinkedHashMap.get(str1);
      localLinkedHashMap.put(str1, a(str1).a(str3, str2));
    }
    return localLinkedHashMap;
  }

  final void a()
  {
    while (true)
    {
      String str1;
      Uri.Builder localBuilder;
      try
      {
        l locall = (l)this.b.take();
        str1 = locall.b();
        if (TextUtils.isEmpty(str1))
          continue;
        Map localMap = a(this.a, locall.c());
        localBuilder = Uri.parse(this.e).buildUpon();
        Iterator localIterator = localMap.entrySet().iterator();
        if (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          localBuilder.appendQueryParameter((String)localEntry.getKey(), (String)localEntry.getValue());
          continue;
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        com.google.android.gms.ads.internal.util.c.c("CsiReporter:reporter interrupted", localInterruptedException);
        return;
      }
      StringBuilder localStringBuilder = new StringBuilder(localBuilder.build().toString());
      localStringBuilder.append("&").append("it").append("=").append(str1);
      String str2 = localStringBuilder.toString();
      if (this.h.get())
      {
        a(this.i, str2);
        continue;
      }
      bc.a().e.a(this.f, this.g, str2);
    }
  }

  public final boolean a(l paraml)
  {
    return this.b.offer(paraml);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.csi.b
 * JD-Core Version:    0.6.0
 */