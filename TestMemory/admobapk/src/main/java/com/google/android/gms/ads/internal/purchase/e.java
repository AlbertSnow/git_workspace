package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.purchase.client.b;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.state.h;
import com.google.android.gms.ads.internal.state.i;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.y;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

@a
public final class e extends b
{
  private String a;
  private Context b;
  private String c;
  private ArrayList d;

  public e(String paramString1, ArrayList paramArrayList, Context paramContext, String paramString2)
  {
    this.c = paramString1;
    this.d = paramArrayList;
    this.a = paramString2;
    this.b = paramContext;
  }

  private String a(String paramString, HashMap paramHashMap)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 25	com/google/android/gms/ads/internal/purchase/e:b	Landroid/content/Context;
    //   4: invokevirtual 34	android/content/Context:getPackageName	()Ljava/lang/String;
    //   7: astore_3
    //   8: aload_0
    //   9: getfield 25	com/google/android/gms/ads/internal/purchase/e:b	Landroid/content/Context;
    //   12: invokevirtual 38	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   15: aload_3
    //   16: iconst_0
    //   17: invokevirtual 44	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   20: getfield 49	android/content/pm/PackageInfo:versionName	Ljava/lang/String;
    //   23: astore 31
    //   25: aload 31
    //   27: astore 5
    //   29: invokestatic 54	com/google/android/gms/ads/internal/bc:a	()Lcom/google/android/gms/ads/internal/bc;
    //   32: getfield 58	com/google/android/gms/ads/internal/bc:h	Lcom/google/android/gms/ads/internal/state/h;
    //   35: invokevirtual 63	com/google/android/gms/ads/internal/state/h:b	()Lcom/google/android/gms/ads/internal/state/i;
    //   38: getfield 68	com/google/android/gms/ads/internal/state/i:b	J
    //   41: lstore 6
    //   43: invokestatic 74	android/os/SystemClock:elapsedRealtime	()J
    //   46: lload 6
    //   48: lsub
    //   49: lstore 8
    //   51: aload_2
    //   52: invokevirtual 80	java/util/HashMap:keySet	()Ljava/util/Set;
    //   55: invokeinterface 86 1 0
    //   60: astore 10
    //   62: aload 10
    //   64: invokeinterface 92 1 0
    //   69: ifeq +80 -> 149
    //   72: aload 10
    //   74: invokeinterface 96 1 0
    //   79: checkcast 98	java/lang/String
    //   82: astore 28
    //   84: ldc 100
    //   86: iconst_1
    //   87: anewarray 102	java/lang/Object
    //   90: dup
    //   91: iconst_0
    //   92: aload 28
    //   94: aastore
    //   95: invokestatic 106	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   98: astore 29
    //   100: iconst_1
    //   101: anewarray 102	java/lang/Object
    //   104: astore 30
    //   106: aload 30
    //   108: iconst_0
    //   109: aload_2
    //   110: aload 28
    //   112: invokevirtual 110	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   115: aastore
    //   116: aload_1
    //   117: aload 29
    //   119: ldc 112
    //   121: aload 30
    //   123: invokestatic 106	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   126: invokevirtual 116	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   129: astore_1
    //   130: goto -68 -> 62
    //   133: astore 4
    //   135: ldc 118
    //   137: aload 4
    //   139: invokestatic 123	com/google/android/gms/ads/internal/util/c:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   142: ldc 125
    //   144: astore 5
    //   146: goto -117 -> 29
    //   149: ldc 100
    //   151: iconst_1
    //   152: anewarray 102	java/lang/Object
    //   155: dup
    //   156: iconst_0
    //   157: ldc 127
    //   159: aastore
    //   160: invokestatic 106	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   163: astore 11
    //   165: iconst_1
    //   166: anewarray 102	java/lang/Object
    //   169: astore 12
    //   171: aload 12
    //   173: iconst_0
    //   174: invokestatic 54	com/google/android/gms/ads/internal/bc:a	()Lcom/google/android/gms/ads/internal/bc;
    //   177: getfield 58	com/google/android/gms/ads/internal/bc:h	Lcom/google/android/gms/ads/internal/state/h;
    //   180: getfield 129	com/google/android/gms/ads/internal/state/h:b	Ljava/lang/String;
    //   183: invokestatic 135	android/net/Uri:encode	(Ljava/lang/String;)Ljava/lang/String;
    //   186: aastore
    //   187: aload_1
    //   188: aload 11
    //   190: ldc 112
    //   192: aload 12
    //   194: invokestatic 106	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   197: invokevirtual 116	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   200: astore 13
    //   202: ldc 100
    //   204: iconst_1
    //   205: anewarray 102	java/lang/Object
    //   208: dup
    //   209: iconst_0
    //   210: ldc 137
    //   212: aastore
    //   213: invokestatic 106	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   216: astore 14
    //   218: iconst_1
    //   219: anewarray 102	java/lang/Object
    //   222: astore 15
    //   224: aload 15
    //   226: iconst_0
    //   227: aload_3
    //   228: invokestatic 135	android/net/Uri:encode	(Ljava/lang/String;)Ljava/lang/String;
    //   231: aastore
    //   232: aload 13
    //   234: aload 14
    //   236: ldc 112
    //   238: aload 15
    //   240: invokestatic 106	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   243: invokevirtual 116	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   246: astore 16
    //   248: ldc 100
    //   250: iconst_1
    //   251: anewarray 102	java/lang/Object
    //   254: dup
    //   255: iconst_0
    //   256: ldc 139
    //   258: aastore
    //   259: invokestatic 106	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   262: astore 17
    //   264: iconst_1
    //   265: anewarray 102	java/lang/Object
    //   268: astore 18
    //   270: aload 18
    //   272: iconst_0
    //   273: getstatic 145	android/os/Build$VERSION:SDK_INT	I
    //   276: invokestatic 149	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   279: invokestatic 135	android/net/Uri:encode	(Ljava/lang/String;)Ljava/lang/String;
    //   282: aastore
    //   283: aload 16
    //   285: aload 17
    //   287: ldc 112
    //   289: aload 18
    //   291: invokestatic 106	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   294: invokevirtual 116	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   297: astore 19
    //   299: ldc 100
    //   301: iconst_1
    //   302: anewarray 102	java/lang/Object
    //   305: dup
    //   306: iconst_0
    //   307: ldc 151
    //   309: aastore
    //   310: invokestatic 106	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   313: astore 20
    //   315: iconst_1
    //   316: anewarray 102	java/lang/Object
    //   319: astore 21
    //   321: aload 21
    //   323: iconst_0
    //   324: aload_0
    //   325: getfield 23	com/google/android/gms/ads/internal/purchase/e:a	Ljava/lang/String;
    //   328: invokestatic 135	android/net/Uri:encode	(Ljava/lang/String;)Ljava/lang/String;
    //   331: aastore
    //   332: aload 19
    //   334: aload 20
    //   336: ldc 112
    //   338: aload 21
    //   340: invokestatic 106	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   343: invokevirtual 116	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   346: astore 22
    //   348: ldc 100
    //   350: iconst_1
    //   351: anewarray 102	java/lang/Object
    //   354: dup
    //   355: iconst_0
    //   356: ldc 153
    //   358: aastore
    //   359: invokestatic 106	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   362: astore 23
    //   364: iconst_1
    //   365: anewarray 102	java/lang/Object
    //   368: astore 24
    //   370: aload 24
    //   372: iconst_0
    //   373: aload 5
    //   375: invokestatic 135	android/net/Uri:encode	(Ljava/lang/String;)Ljava/lang/String;
    //   378: aastore
    //   379: aload 22
    //   381: aload 23
    //   383: ldc 112
    //   385: aload 24
    //   387: invokestatic 106	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   390: invokevirtual 116	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   393: astore 25
    //   395: ldc 100
    //   397: iconst_1
    //   398: anewarray 102	java/lang/Object
    //   401: dup
    //   402: iconst_0
    //   403: ldc 155
    //   405: aastore
    //   406: invokestatic 106	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   409: astore 26
    //   411: iconst_1
    //   412: anewarray 102	java/lang/Object
    //   415: astore 27
    //   417: aload 27
    //   419: iconst_0
    //   420: lload 8
    //   422: invokestatic 158	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   425: invokestatic 135	android/net/Uri:encode	(Ljava/lang/String;)Ljava/lang/String;
    //   428: aastore
    //   429: aload 25
    //   431: aload 26
    //   433: ldc 112
    //   435: aload 27
    //   437: invokestatic 106	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   440: invokevirtual 116	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   443: ldc 100
    //   445: iconst_1
    //   446: anewarray 102	java/lang/Object
    //   449: dup
    //   450: iconst_0
    //   451: ldc 160
    //   453: aastore
    //   454: invokestatic 106	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   457: ldc 112
    //   459: iconst_1
    //   460: anewarray 102	java/lang/Object
    //   463: dup
    //   464: iconst_0
    //   465: ldc 125
    //   467: aastore
    //   468: invokestatic 106	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   471: invokevirtual 116	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   474: ldc 162
    //   476: ldc 164
    //   478: invokevirtual 116	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   481: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   8	25	133	android/content/pm/PackageManager$NameNotFoundException
  }

  private void b()
  {
    try
    {
      Class localClass = this.b.getClassLoader().loadClass("com.google.ads.conversiontracking.IAPConversionReporter");
      Class[] arrayOfClass = new Class[4];
      arrayOfClass[0] = Context.class;
      arrayOfClass[1] = String.class;
      arrayOfClass[2] = String.class;
      arrayOfClass[3] = Boolean.TYPE;
      Method localMethod = localClass.getDeclaredMethod("reportWithProductId", arrayOfClass);
      Object[] arrayOfObject = new Object[4];
      arrayOfObject[0] = this.b;
      arrayOfObject[1] = this.c;
      arrayOfObject[2] = "";
      arrayOfObject[3] = Boolean.valueOf(true);
      localMethod.invoke(null, arrayOfObject);
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      c.e("Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.");
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      c.e("Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.");
      return;
    }
    catch (Exception localException)
    {
      c.c("Fail to report a conversion.", localException);
    }
  }

  public final String a()
  {
    return this.c;
  }

  public final void a(int paramInt)
  {
    if (paramInt == 1)
      b();
    HashMap localHashMap = new HashMap();
    localHashMap.put("status", String.valueOf(paramInt));
    localHashMap.put("sku", this.c);
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
      localLinkedList.add(a((String)localIterator.next(), localHashMap));
    y.a(this.b, this.a, localLinkedList);
  }

  public final void b(int paramInt)
  {
    int i = 1;
    if (paramInt == 0)
      b();
    HashMap localHashMap = new HashMap();
    localHashMap.put("google_play_status", String.valueOf(paramInt));
    localHashMap.put("sku", this.c);
    if (paramInt == 0);
    LinkedList localLinkedList;
    while (true)
    {
      localHashMap.put("status", String.valueOf(i));
      localLinkedList = new LinkedList();
      Iterator localIterator = this.d.iterator();
      while (localIterator.hasNext())
        localLinkedList.add(a((String)localIterator.next(), localHashMap));
      if (paramInt == i)
      {
        i = 2;
        continue;
      }
      if (paramInt == 4)
      {
        i = 3;
        continue;
      }
      i = 0;
    }
    y.a(this.b, this.a, localLinkedList);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.purchase.e
 * JD-Core Version:    0.6.0
 */