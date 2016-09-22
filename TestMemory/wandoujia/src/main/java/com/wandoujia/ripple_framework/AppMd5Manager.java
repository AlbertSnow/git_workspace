package com.wandoujia.ripple_framework;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.wandoujia.base.utils.AppUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class AppMd5Manager
{
  private final Map<String, f> a = new HashMap();
  private SharedPreferences b;
  private SharedPreferences.Editor c;
  private final List<WeakReference<e>> d = new LinkedList();
  private final AppMd5Manager.ScreenReceiver e = new AppMd5Manager.ScreenReceiver(this, 0);
  private final AtomicBoolean f = new AtomicBoolean();
  private HandlerThread g;
  private Handler h;
  private l i = new a(this);

  public AppMd5Manager()
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.SCREEN_OFF");
    localIntentFilter.addAction("android.intent.action.SCREEN_ON");
    i.k().g().registerReceiver(this.e, localIntentFilter);
    ReceiverMonitor.a().a(this.i);
    this.g = new HandlerThread("app_md5_manager");
    this.g.start();
    this.h = new Handler(this.g.getLooper());
  }

  // ERROR //
  private String a(String paramString, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: invokestatic 74	com/wandoujia/ripple_framework/i:k	()Lcom/wandoujia/ripple_framework/i;
    //   5: invokevirtual 77	com/wandoujia/ripple_framework/i:g	()Landroid/content/Context;
    //   8: invokevirtual 126	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   11: aload_1
    //   12: iconst_0
    //   13: invokevirtual 132	android/content/pm/PackageManager:getApplicationInfo	(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   16: astore 6
    //   18: new 134	java/io/File
    //   21: dup
    //   22: aload 6
    //   24: getfield 140	android/content/pm/ApplicationInfo:sourceDir	Ljava/lang/String;
    //   27: invokespecial 141	java/io/File:<init>	(Ljava/lang/String;)V
    //   30: astore 7
    //   32: new 143	java/io/BufferedInputStream
    //   35: dup
    //   36: new 145	java/io/FileInputStream
    //   39: dup
    //   40: aload 7
    //   42: invokespecial 148	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   45: invokespecial 151	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   48: astore 8
    //   50: aload 8
    //   52: aload_2
    //   53: invokestatic 157	com/wandoujia/base/utils/MD5Utils:md5Digest	(Ljava/io/InputStream;[B)Ljava/lang/String;
    //   56: astore_3
    //   57: aload_0
    //   58: aload_1
    //   59: new 159	com/wandoujia/ripple_framework/f
    //   62: dup
    //   63: aload_3
    //   64: aload 7
    //   66: invokevirtual 163	java/io/File:length	()J
    //   69: aload 7
    //   71: invokevirtual 166	java/io/File:lastModified	()J
    //   74: invokespecial 169	com/wandoujia/ripple_framework/f:<init>	(Ljava/lang/String;JJ)V
    //   77: invokespecial 172	com/wandoujia/ripple_framework/AppMd5Manager:a	(Ljava/lang/String;Lcom/wandoujia/ripple_framework/f;)V
    //   80: aload 8
    //   82: invokevirtual 175	java/io/BufferedInputStream:close	()V
    //   85: aload_3
    //   86: areturn
    //   87: astore 18
    //   89: aconst_null
    //   90: astore 10
    //   92: aload 10
    //   94: ifnull -9 -> 85
    //   97: aload 10
    //   99: invokevirtual 175	java/io/BufferedInputStream:close	()V
    //   102: aload_3
    //   103: areturn
    //   104: astore 11
    //   106: aload_3
    //   107: areturn
    //   108: astore 17
    //   110: aconst_null
    //   111: astore 8
    //   113: aload 8
    //   115: ifnull -30 -> 85
    //   118: aload 8
    //   120: invokevirtual 175	java/io/BufferedInputStream:close	()V
    //   123: aload_3
    //   124: areturn
    //   125: astore 13
    //   127: aload_3
    //   128: areturn
    //   129: astore 14
    //   131: aconst_null
    //   132: astore 8
    //   134: aload 8
    //   136: ifnull +8 -> 144
    //   139: aload 8
    //   141: invokevirtual 175	java/io/BufferedInputStream:close	()V
    //   144: aload 14
    //   146: athrow
    //   147: astore 16
    //   149: aload_3
    //   150: areturn
    //   151: astore 15
    //   153: goto -9 -> 144
    //   156: astore 14
    //   158: goto -24 -> 134
    //   161: astore 12
    //   163: goto -50 -> 113
    //   166: astore 9
    //   168: aload 8
    //   170: astore 10
    //   172: goto -80 -> 92
    //   175: astore 5
    //   177: aconst_null
    //   178: areturn
    //   179: astore 4
    //   181: aconst_null
    //   182: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   32	50	87	java/io/FileNotFoundException
    //   97	102	104	java/io/IOException
    //   32	50	108	java/io/IOException
    //   118	123	125	java/io/IOException
    //   32	50	129	finally
    //   80	85	147	java/io/IOException
    //   139	144	151	java/io/IOException
    //   50	80	156	finally
    //   50	80	161	java/io/IOException
    //   50	80	166	java/io/FileNotFoundException
    //   2	18	175	java/lang/RuntimeException
    //   2	18	179	android/content/pm/PackageManager$NameNotFoundException
  }

  private void a(String paramString, f paramf)
  {
    this.h.post(new c(this, paramString, paramf));
  }

  private void a(Map<String, String> paramMap)
  {
    while (true)
    {
      Iterator localIterator;
      synchronized (this.d)
      {
        localIterator = this.d.iterator();
        if (!localIterator.hasNext())
          break;
        e locale = (e)((WeakReference)localIterator.next()).get();
        if (locale != null)
          locale.a(paramMap);
      }
      localIterator.remove();
    }
    monitorexit;
  }

  private void b(String paramString)
  {
    this.h.post(new b(this, paramString));
  }

  public final String a(String paramString)
  {
    while (true)
    {
      f localf;
      synchronized (this.a)
      {
        localf = (f)this.a.get(paramString);
        if (localf == null)
        {
          j = 0;
          if (j == 0)
            break;
          return f.a(localf);
        }
      }
      PackageInfo localPackageInfo = AppUtils.getPackageInfo(i.k().g(), paramString, 0);
      if ((localPackageInfo != null) && (!TextUtils.isEmpty(localPackageInfo.applicationInfo.sourceDir)))
      {
        File localFile = new File(localPackageInfo.applicationInfo.sourceDir);
        if ((localFile.exists()) && (localFile.length() == f.b(localf)) && (localFile.lastModified() == f.c(localf)))
        {
          j = 1;
          continue;
        }
        if ((localFile.exists()) && (localFile.length() == f.b(localf)) && (f.c(localf) == 0L))
        {
          a(paramString, new f(f.a(localf), f.b(localf), localFile.lastModified()));
          j = 1;
          continue;
        }
      }
      b(paramString);
      int j = 0;
    }
    return null;
  }

  public final void a()
  {
    this.b = i.k().g().getSharedPreferences("app_md5s", 2);
    this.c = this.b.edit();
    Iterator localIterator = new HashMap(this.b.getAll()).entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      f localf = f.a((String)localEntry.getValue());
      if (localf == null)
        continue;
      synchronized (this.a)
      {
        this.a.put(localEntry.getKey(), localf);
      }
    }
    synchronized (this.f)
    {
      this.f.set(true);
      this.f.notifyAll();
      return;
    }
  }

  public final void a(e parame)
  {
    synchronized (this.d)
    {
      Iterator localIterator = this.d.iterator();
      while (localIterator.hasNext())
      {
        e locale = (e)((WeakReference)localIterator.next()).get();
        if ((locale != null) && (locale.equals(this.d)))
          return;
      }
      this.d.add(new WeakReference(parame));
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.AppMd5Manager
 * JD-Core Version:    0.6.0
 */