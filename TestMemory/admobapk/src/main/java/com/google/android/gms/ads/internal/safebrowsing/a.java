package com.google.android.gms.ads.internal.safebrowsing;

import aio;
import aip;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import anw;
import aqr;
import awb;
import awg;
import awn;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.av;
import com.google.android.gms.ads.internal.util.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

@com.google.android.gms.ads.internal.report.client.a
public final class a
  implements m
{
  final awg a;
  boolean b;
  final Object c;
  private final Map d;
  private final Context e;
  private final f f;
  private boolean g;
  private final JSONObject h;

  public a(Context paramContext, AdResponseParcel paramAdResponseParcel)
  {
    this(paramContext, paramAdResponseParcel, new f());
  }

  // ERROR //
  private a(Context paramContext, AdResponseParcel paramAdResponseParcel, f paramf)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 35	java/lang/Object:<init>	()V
    //   4: aload_0
    //   5: new 4	java/lang/Object
    //   8: dup
    //   9: invokespecial 35	java/lang/Object:<init>	()V
    //   12: putfield 37	com/google/android/gms/ads/internal/safebrowsing/a:c	Ljava/lang/Object;
    //   15: aload_1
    //   16: invokevirtual 43	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   19: ifnull +8 -> 27
    //   22: aload_1
    //   23: invokevirtual 43	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   26: astore_1
    //   27: aload_0
    //   28: aload_1
    //   29: putfield 45	com/google/android/gms/ads/internal/safebrowsing/a:e	Landroid/content/Context;
    //   32: aload_0
    //   33: new 47	java/util/HashMap
    //   36: dup
    //   37: invokespecial 48	java/util/HashMap:<init>	()V
    //   40: putfield 50	com/google/android/gms/ads/internal/safebrowsing/a:d	Ljava/util/Map;
    //   43: aload_0
    //   44: aload_3
    //   45: putfield 52	com/google/android/gms/ads/internal/safebrowsing/a:f	Lcom/google/android/gms/ads/internal/safebrowsing/f;
    //   48: getstatic 58	com/google/android/gms/ads/internal/config/m:aP	Lcom/google/android/gms/ads/internal/config/d;
    //   51: invokevirtual 63	com/google/android/gms/ads/internal/config/d:a	()Ljava/lang/Object;
    //   54: checkcast 65	java/lang/Boolean
    //   57: invokevirtual 69	java/lang/Boolean:booleanValue	()Z
    //   60: istore 4
    //   62: aload_2
    //   63: getfield 75	com/google/android/gms/ads/internal/request/AdResponseParcel:K	Ljava/lang/String;
    //   66: ifnull +153 -> 219
    //   69: new 77	org/json/JSONObject
    //   72: dup
    //   73: aload_2
    //   74: getfield 75	com/google/android/gms/ads/internal/request/AdResponseParcel:K	Ljava/lang/String;
    //   77: invokespecial 80	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   80: astore 6
    //   82: aload 6
    //   84: ldc 82
    //   86: iconst_0
    //   87: invokevirtual 86	org/json/JSONObject:optBoolean	(Ljava/lang/String;Z)Z
    //   90: istore 9
    //   92: iload 9
    //   94: iload 4
    //   96: iand
    //   97: istore 5
    //   99: aload_0
    //   100: aload 6
    //   102: putfield 88	com/google/android/gms/ads/internal/safebrowsing/a:h	Lorg/json/JSONObject;
    //   105: aload_0
    //   106: iload 5
    //   108: putfield 90	com/google/android/gms/ads/internal/safebrowsing/a:g	Z
    //   111: new 92	awg
    //   114: dup
    //   115: invokespecial 93	awg:<init>	()V
    //   118: astore 7
    //   120: aload 7
    //   122: bipush 8
    //   124: invokestatic 99	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   127: putfield 102	awg:a	Ljava/lang/Integer;
    //   130: aload 7
    //   132: aload_2
    //   133: getfield 104	com/google/android/gms/ads/internal/request/AdResponseParcel:b	Ljava/lang/String;
    //   136: putfield 105	awg:b	Ljava/lang/String;
    //   139: aload 7
    //   141: aload_2
    //   142: getfield 104	com/google/android/gms/ads/internal/request/AdResponseParcel:b	Ljava/lang/String;
    //   145: putfield 107	awg:c	Ljava/lang/String;
    //   148: aload_0
    //   149: getfield 88	com/google/android/gms/ads/internal/safebrowsing/a:h	Lorg/json/JSONObject;
    //   152: ifnull +32 -> 184
    //   155: aload 7
    //   157: new 109	awh
    //   160: dup
    //   161: invokespecial 110	awh:<init>	()V
    //   164: putfield 113	awg:d	Lawh;
    //   167: aload 7
    //   169: getfield 113	awg:d	Lawh;
    //   172: aload_0
    //   173: getfield 88	com/google/android/gms/ads/internal/safebrowsing/a:h	Lorg/json/JSONObject;
    //   176: ldc 115
    //   178: invokevirtual 119	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   181: putfield 121	awh:a	Ljava/lang/String;
    //   184: aload_0
    //   185: aload 7
    //   187: putfield 123	com/google/android/gms/ads/internal/safebrowsing/a:a	Lawg;
    //   190: return
    //   191: astore 10
    //   193: aconst_null
    //   194: astore 6
    //   196: aload 10
    //   198: astore 8
    //   200: ldc 125
    //   202: aload 8
    //   204: invokestatic 130	com/google/android/gms/ads/internal/safebrowsing/l:a	(Ljava/lang/String;Ljava/lang/Exception;)V
    //   207: iload 4
    //   209: istore 5
    //   211: goto -112 -> 99
    //   214: astore 8
    //   216: goto -16 -> 200
    //   219: iload 4
    //   221: istore 5
    //   223: aconst_null
    //   224: astore 6
    //   226: goto -127 -> 99
    //
    // Exception table:
    //   from	to	target	type
    //   69	82	191	org/json/JSONException
    //   82	92	214	org/json/JSONException
  }

  public final void a()
  {
    synchronized (this.c)
    {
      f localf = this.f;
      Context localContext = this.e;
      Set localSet = this.d.keySet();
      com.google.android.gms.ads.internal.util.future.a locala = new com.google.android.gms.ads.internal.util.future.a();
      aip localaip = new aip(localContext).a(aqr.b);
      h localh = new h(localf, localSet, locala);
      anw.a(localh, "Listener must not be null");
      localaip.a.add(localh);
      g localg = new g(localf, locala);
      anw.a(localg, "Listener must not be null");
      localaip.b.add(localg);
      localf.c = localaip.b();
      localf.c.b();
      locala.a(new c(this, locala));
      return;
    }
  }

  public final void a(View paramView)
  {
    if (!this.g)
      return;
    Bitmap localBitmap;
    if (paramView == null)
      localBitmap = null;
    while (localBitmap == null)
    {
      l.a("Failed to capture the webview bitmap.");
      return;
      localBitmap = y.c(paramView);
      if (localBitmap != null)
        continue;
      localBitmap = y.b(paramView);
    }
    y.b(new b(this, localBitmap));
  }

  public final void a(String paramString)
  {
    synchronized (this.c)
    {
      this.a.f = paramString;
      return;
    }
  }

  final void b()
  {
    if ((!this.b) && (!((Boolean)com.google.android.gms.ads.internal.config.m.aO.a()).booleanValue()))
    {
      l.a("No malicious URL found, skip sending report.");
      return;
    }
    synchronized (this.c)
    {
      this.a.e = new awn[this.d.size()];
      this.d.values().toArray(this.a.e);
      if (l.a())
      {
        String str1 = String.valueOf(this.a.b);
        String str2 = String.valueOf(this.a.f);
        String str3 = String.valueOf(this.a.g);
        StringBuilder localStringBuilder = new StringBuilder(68 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + "Sending SB report\n  url: " + str1 + "\n  clickUrl: " + str2 + "\n  screenShot: " + str3 + "\n  resources: \n");
        for (awn localawn : this.a.e)
        {
          localStringBuilder.append("    [");
          localStringBuilder.append(localawn.d.length);
          localStringBuilder.append("] ");
          localStringBuilder.append(localawn.b);
        }
        l.a(localStringBuilder.toString());
      }
      byte[] arrayOfByte = awb.a(this.a);
      com.google.android.gms.ads.internal.util.future.g localg = new av(this.e).a(1, (String)com.google.android.gms.ads.internal.config.m.aQ.a(), null, arrayOfByte);
      if (l.a())
        localg.a(new d(this));
      return;
    }
  }

  public final void b(String paramString)
  {
    synchronized (this.c)
    {
      if (this.d.containsKey(paramString))
        return;
      awn localawn = new awn();
      localawn.c = Integer.valueOf(1);
      localawn.a = Integer.valueOf(this.d.size());
      localawn.b = paramString;
      this.d.put(paramString, localawn);
      return;
    }
  }

  public final awn c(String paramString)
  {
    synchronized (this.c)
    {
      awn localawn = (awn)this.d.get(paramString);
      return localawn;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.safebrowsing.a
 * JD-Core Version:    0.6.0
 */