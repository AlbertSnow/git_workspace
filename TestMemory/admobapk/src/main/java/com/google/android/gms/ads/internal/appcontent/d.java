package com.google.android.gms.ads.internal.appcontent;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import aoq;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.config.k;
import com.google.android.gms.ads.internal.config.m;
import java.util.Iterator;
import java.util.List;

@com.google.android.gms.ads.internal.report.client.a
@TargetApi(14)
public final class d extends Thread
{
  public boolean a = false;
  public final Object b;
  public final b c;
  final com.google.android.gms.ads.internal.report.a d;
  final int e;
  final int f;
  final int g;
  final int h;
  private boolean i = false;
  private boolean j = false;
  private final c k;
  private final int l;

  public d(c paramc, b paramb, com.google.android.gms.ads.internal.report.a parama)
  {
    this.k = paramc;
    this.c = paramb;
    this.d = parama;
    this.b = new Object();
    com.google.android.gms.ads.internal.config.d locald1 = m.z;
    this.e = ((Integer)bc.a().n.a(locald1)).intValue();
    com.google.android.gms.ads.internal.config.d locald2 = m.A;
    this.f = ((Integer)bc.a().n.a(locald2)).intValue();
    com.google.android.gms.ads.internal.config.d locald3 = m.B;
    this.g = ((Integer)bc.a().n.a(locald3)).intValue();
    com.google.android.gms.ads.internal.config.d locald4 = m.C;
    this.h = ((Integer)bc.a().n.a(locald4)).intValue();
    com.google.android.gms.ads.internal.config.d locald5 = m.D;
    this.l = ((Integer)bc.a().n.a(locald5)).intValue();
    setName("ContentFetchTask");
  }

  private boolean b()
  {
    while (true)
    {
      int m;
      int n;
      try
      {
        Context localContext = this.k.b;
        if (localContext == null)
          return false;
        ActivityManager localActivityManager = (ActivityManager)localContext.getSystemService("activity");
        KeyguardManager localKeyguardManager = (KeyguardManager)localContext.getSystemService("keyguard");
        if ((localActivityManager != null) && (localKeyguardManager != null))
        {
          List localList = localActivityManager.getRunningAppProcesses();
          if (localList == null)
            return false;
          Iterator localIterator = localList.iterator();
          if (!localIterator.hasNext())
            continue;
          ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)localIterator.next();
          if (Process.myPid() != localRunningAppProcessInfo.pid)
            continue;
          if (localRunningAppProcessInfo.importance != 100)
            break label178;
          m = 1;
          if ((m == 0) || (localKeyguardManager.inKeyguardRestrictedInputMode()))
            continue;
          PowerManager localPowerManager = (PowerManager)localContext.getSystemService("power");
          if (localPowerManager != null)
            continue;
          n = 0;
          break label171;
          boolean bool = localPowerManager.isScreenOn();
          n = bool;
          break label171;
          return false;
        }
      }
      catch (Throwable localThrowable)
      {
        return false;
      }
      return false;
      label171: if (n != 0)
      {
        return true;
        label178: m = 0;
      }
    }
  }

  private void c()
  {
    synchronized (this.b)
    {
      this.a = true;
      boolean bool = this.a;
      com.google.android.gms.ads.internal.util.c.b(42 + "ContentFetchThread: paused, mPause = " + bool);
      return;
    }
  }

  final h a(View paramView, a parama)
  {
    int m = 0;
    if (paramView == null)
      return new h(this, 0, 0);
    boolean bool = paramView.getGlobalVisibleRect(new Rect());
    if (((paramView instanceof TextView)) && (!(paramView instanceof EditText)))
    {
      CharSequence localCharSequence = ((TextView)paramView).getText();
      if (!TextUtils.isEmpty(localCharSequence))
      {
        parama.b(localCharSequence.toString(), bool);
        return new h(this, 1, 0);
      }
      return new h(this, 0, 0);
    }
    if (((paramView instanceof WebView)) && (!(paramView instanceof com.google.android.gms.ads.internal.webview.b)))
    {
      parama.b();
      WebView localWebView = (WebView)paramView;
      if (!aoq.a(19));
      for (int i2 = 0; i2 != 0; i2 = 1)
      {
        return new h(this, 0, 1);
        parama.b();
        localWebView.post(new f(this, parama, localWebView, bool));
      }
      return new h(this, 0, 0);
    }
    if ((paramView instanceof ViewGroup))
    {
      ViewGroup localViewGroup = (ViewGroup)paramView;
      int n = 0;
      int i1 = 0;
      while (m < localViewGroup.getChildCount())
      {
        h localh = a(localViewGroup.getChildAt(m), parama);
        i1 += localh.a;
        n += localh.b;
        m++;
      }
      return new h(this, i1, n);
    }
    return new h(this, 0, 0);
  }

  public final void a()
  {
    synchronized (this.b)
    {
      if (this.i)
      {
        com.google.android.gms.ads.internal.util.c.b("Content hash thread already started, quiting...");
        return;
      }
      this.i = true;
      start();
      return;
    }
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 270	com/google/android/gms/ads/internal/appcontent/d:b	()Z
    //   4: ifeq +199 -> 203
    //   7: aload_0
    //   8: getfield 39	com/google/android/gms/ads/internal/appcontent/d:k	Lcom/google/android/gms/ads/internal/appcontent/c;
    //   11: getfield 273	com/google/android/gms/ads/internal/appcontent/c:a	Landroid/app/Activity;
    //   14: astore 6
    //   16: aload 6
    //   18: ifnonnull +64 -> 82
    //   21: ldc_w 275
    //   24: invokestatic 188	com/google/android/gms/ads/internal/util/c:b	(Ljava/lang/String;)V
    //   27: aload_0
    //   28: invokespecial 277	com/google/android/gms/ads/internal/appcontent/d:c	()V
    //   31: sipush 1000
    //   34: aload_0
    //   35: getfield 96	com/google/android/gms/ads/internal/appcontent/d:l	I
    //   38: imul
    //   39: i2l
    //   40: invokestatic 281	java/lang/Thread:sleep	(J)V
    //   43: aload_0
    //   44: getfield 48	com/google/android/gms/ads/internal/appcontent/d:b	Ljava/lang/Object;
    //   47: astore_2
    //   48: aload_2
    //   49: monitorenter
    //   50: aload_0
    //   51: getfield 35	com/google/android/gms/ads/internal/appcontent/d:a	Z
    //   54: istore 4
    //   56: iload 4
    //   58: ifeq +158 -> 216
    //   61: ldc_w 283
    //   64: invokestatic 188	com/google/android/gms/ads/internal/util/c:b	(Ljava/lang/String;)V
    //   67: aload_0
    //   68: getfield 48	com/google/android/gms/ads/internal/appcontent/d:b	Ljava/lang/Object;
    //   71: invokevirtual 286	java/lang/Object:wait	()V
    //   74: goto -24 -> 50
    //   77: astore 5
    //   79: goto -29 -> 50
    //   82: aload 6
    //   84: ifnull -53 -> 31
    //   87: aload 6
    //   89: invokevirtual 292	android/app/Activity:getWindow	()Landroid/view/Window;
    //   92: astore 10
    //   94: aconst_null
    //   95: astore 8
    //   97: aload 10
    //   99: ifnull +41 -> 140
    //   102: aload 6
    //   104: invokevirtual 292	android/app/Activity:getWindow	()Landroid/view/Window;
    //   107: invokevirtual 298	android/view/Window:getDecorView	()Landroid/view/View;
    //   110: astore 11
    //   112: aconst_null
    //   113: astore 8
    //   115: aload 11
    //   117: ifnull +23 -> 140
    //   120: aload 6
    //   122: invokevirtual 292	android/app/Activity:getWindow	()Landroid/view/Window;
    //   125: invokevirtual 298	android/view/Window:getDecorView	()Landroid/view/View;
    //   128: ldc_w 299
    //   131: invokevirtual 302	android/view/View:findViewById	(I)Landroid/view/View;
    //   134: astore 12
    //   136: aload 12
    //   138: astore 8
    //   140: aload 8
    //   142: ifnull -111 -> 31
    //   145: aload 8
    //   147: ifnull -116 -> 31
    //   150: aload 8
    //   152: new 304	com/google/android/gms/ads/internal/appcontent/e
    //   155: dup
    //   156: aload_0
    //   157: aload 8
    //   159: invokespecial 307	com/google/android/gms/ads/internal/appcontent/e:<init>	(Lcom/google/android/gms/ads/internal/appcontent/d;Landroid/view/View;)V
    //   162: invokevirtual 308	android/view/View:post	(Ljava/lang/Runnable;)Z
    //   165: pop
    //   166: goto -135 -> 31
    //   169: astore_1
    //   170: ldc_w 310
    //   173: aload_1
    //   174: invokestatic 313	com/google/android/gms/ads/internal/util/c:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   177: aload_0
    //   178: getfield 43	com/google/android/gms/ads/internal/appcontent/d:d	Lcom/google/android/gms/ads/internal/report/a;
    //   181: aload_1
    //   182: iconst_1
    //   183: invokevirtual 318	com/google/android/gms/ads/internal/report/a:a	(Ljava/lang/Throwable;Z)V
    //   186: goto -143 -> 43
    //   189: astore 7
    //   191: ldc_w 320
    //   194: invokestatic 188	com/google/android/gms/ads/internal/util/c:b	(Ljava/lang/String;)V
    //   197: aconst_null
    //   198: astore 8
    //   200: goto -60 -> 140
    //   203: ldc_w 322
    //   206: invokestatic 188	com/google/android/gms/ads/internal/util/c:b	(Ljava/lang/String;)V
    //   209: aload_0
    //   210: invokespecial 277	com/google/android/gms/ads/internal/appcontent/d:c	()V
    //   213: goto -182 -> 31
    //   216: aload_2
    //   217: monitorexit
    //   218: goto -218 -> 0
    //   221: astore_3
    //   222: aload_2
    //   223: monitorexit
    //   224: aload_3
    //   225: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   61	74	77	java/lang/InterruptedException
    //   0	16	169	java/lang/Throwable
    //   21	31	169	java/lang/Throwable
    //   31	43	169	java/lang/Throwable
    //   150	166	169	java/lang/Throwable
    //   191	197	169	java/lang/Throwable
    //   203	213	169	java/lang/Throwable
    //   87	94	189	java/lang/Throwable
    //   102	112	189	java/lang/Throwable
    //   120	136	189	java/lang/Throwable
    //   50	56	221	finally
    //   61	74	221	finally
    //   216	218	221	finally
    //   222	224	221	finally
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.appcontent.d
 * JD-Core Version:    0.6.0
 */