package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.AbsoluteLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.webview.b;
import com.google.android.gms.appstreaming.AppStreamingInfo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import mp;
import mq;
import mv;

@a
public final class ay
  implements ar
{
  private final AtomicInteger a = new AtomicInteger();
  private b b;
  private RelativeLayout c = null;
  private Activity d;
  private HashMap e = new HashMap();
  private int f;
  private az g;

  public ay(Activity paramActivity, b paramb, RelativeLayout paramRelativeLayout)
  {
    this(new az(), paramActivity, paramb, paramRelativeLayout);
  }

  private ay(az paramaz, Activity paramActivity, b paramb, RelativeLayout paramRelativeLayout)
  {
    this.d = paramActivity;
    this.c = paramRelativeLayout;
    this.b = paramb;
    this.f = paramActivity.getRequestedOrientation();
    this.g = paramaz;
  }

  private static int a(String paramString, int paramInt)
  {
    try
    {
      int i = Integer.parseInt(paramString);
      return i;
    }
    catch (Throwable localThrowable)
    {
    }
    return paramInt;
  }

  private static Long a(String paramString, Long paramLong)
  {
    try
    {
      Long localLong = Long.valueOf(Long.parseLong(paramString));
      return localLong;
    }
    catch (Throwable localThrowable)
    {
    }
    return paramLong;
  }

  public final void a()
  {
    Iterator localIterator = this.e.entrySet().iterator();
    if (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      String str1 = String.valueOf((String)localEntry.getKey());
      if (str1.length() != 0);
      for (String str2 = "Pausing controller for key: ".concat(str1); ; str2 = new String("Pausing controller for key: "))
      {
        c.b(str2);
        ba localba = (ba)localEntry.getValue();
        if (!localba.f)
          break;
        localba.a("PAUSE");
        break;
      }
    }
  }

  public final void a(b paramb, Map paramMap)
  {
    String str1 = (String)paramMap.get("action");
    String str2 = (String)paramMap.get("internalSessionId");
    String str3 = (String)paramMap.get("appstreamingSessionId");
    String str4 = (String)paramMap.get("intentUrl");
    String str5 = (String)paramMap.get("registeredPackageName");
    Long localLong = a((String)paramMap.get("timestampNanos"), Long.valueOf(-1L));
    String str6 = (String)paramMap.get("nonce");
    String str7 = (String)paramMap.get("signature");
    String str8 = (String)paramMap.get("endpoint");
    String str9 = (String)paramMap.get("appVersion");
    int i = a((String)paramMap.get("width"), -1);
    int j = a((String)paramMap.get("height"), -1);
    int k = a((String)paramMap.get("x"), -1);
    int m = a((String)paramMap.get("y"), -1);
    String str10 = (String)paramMap.get("orientation");
    boolean bool1 = Boolean.parseBoolean((String)paramMap.get("haltOnPause"));
    int n = a((String)paramMap.get("volume"), 0);
    au localau = new au();
    localau.a = str2;
    localau.q = str5;
    localau.b = str3;
    localau.c = str1;
    localau.j = i;
    localau.k = j;
    localau.l = k;
    localau.m = m;
    localau.d = str4;
    localau.e = localLong.longValue();
    localau.f = str6;
    localau.g = str7;
    localau.h = str8;
    localau.i = str9;
    localau.o = bool1;
    localau.n = str10;
    localau.p = n;
    at localat = new at(localau);
    String str11 = localat.a;
    if (TextUtils.isEmpty(str11))
    {
      c.c("Session id is empty, not proceeding.");
      return;
    }
    ba localba1 = (ba)this.e.get(str11);
    ba localba3;
    if (localba1 == null)
    {
      c.d("Creating app streaming session controller");
      localba3 = new ba(this.g, str11, this.d, this.b, this.c, this.a.getAndIncrement(), this.f);
      this.e.put(str11, localba3);
    }
    for (ba localba2 = localba3; ; localba2 = localba1)
    {
      c.d("Processing streaming message");
      if ("startSession".equals(localat.b))
      {
        if (!"notStarted".equals(localba2.e))
        {
          c.c("App streams can only be started once");
          return;
        }
        c.d("Starting app streaming.");
        mv localmv = new mv(localat.c, localat.d, localat.e, localat.f, localat.g, localat.h);
        localmv.h = localat.p;
        if (localat.o == 0);
        mp localmp3;
        for (boolean bool2 = true; ; bool2 = false)
        {
          localmv.g = bool2;
          AppStreamingInfo localAppStreamingInfo = new AppStreamingInfo(localmv);
          localba2.e = "starting";
          localba2.f = localat.m;
          localmp3 = new mp();
          Bundle localBundle = new Bundle();
          localBundle.putParcelable("extra_AppStreamingInfo", localAppStreamingInfo);
          localmp3.setArguments(localBundle);
          localba2.d = localmp3;
          if (localba2.d != null)
            break;
          localba2.a(207);
          return;
        }
        localba2.a(localat);
        RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(localat.i, localat.j);
        localLayoutParams2.leftMargin = localat.k;
        localLayoutParams2.topMargin = localat.l;
        localba2.b.addView(localba2.c, 0, localLayoutParams2);
        localmp3.c.a = localba2;
        localba2.a.getFragmentManager().beginTransaction().add(localba2.c.getId(), localmp3, "appstreaming_fragment").attach(localba2.d).commit();
        return;
      }
      if ("endSession".equals(localat.b))
      {
        localba2.a("STOP");
        return;
      }
      if ("show".equals(localat.b))
      {
        localba2.a(localat);
        RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(localat.i, localat.j);
        localLayoutParams1.leftMargin = localat.k;
        localLayoutParams1.topMargin = localat.l;
        localba2.c.setLayoutParams(localLayoutParams1);
        localba2.c.setVisibility(0);
        localba2.c.bringToFront();
        return;
      }
      if ("hide".equals(localat.b))
      {
        localba2.c.setVisibility(8);
        return;
      }
      if ("lockOrientation".equals(localat.b))
      {
        localba2.a(localat);
        return;
      }
      if ("restoreOrientation".equals(localat.b))
      {
        localba2.a();
        return;
      }
      if ((!"setVolume".equals(localat.b)) || (localba2.d == null))
        break;
      int i1 = localat.o;
      if (i1 == 0)
      {
        mp localmp2 = localba2.d;
        if (localmp2.a == null)
          break;
        localmp2.a.g();
        return;
      }
      if (1 != i1)
        break;
      mp localmp1 = localba2.d;
      if (localmp1.a == null)
        break;
      localmp1.a.h();
      return;
    }
  }

  public final void b()
  {
    Iterator localIterator = this.e.entrySet().iterator();
    if (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      String str1 = String.valueOf((String)localEntry.getKey());
      if (str1.length() != 0);
      for (String str2 = "Resuming controller for key: ".concat(str1); ; str2 = new String("Resuming controller for key: "))
      {
        c.b(str2);
        localEntry.getValue();
        break;
      }
    }
  }

  public final void c()
  {
    Iterator localIterator = this.e.entrySet().iterator();
    if (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      String str1 = String.valueOf((String)localEntry.getKey());
      if (str1.length() != 0);
      for (String str2 = "Destroying controller for key: ".concat(str1); ; str2 = new String("Destroying controller for key: "))
      {
        c.b(str2);
        ((ba)localEntry.getValue()).a("STOP");
        break;
      }
    }
    this.e.clear();
  }

  public final boolean d()
  {
    Iterator localIterator = this.e.entrySet().iterator();
    int i = 1;
    if (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      String str = (String)localEntry.getKey();
      ba localba = (ba)localEntry.getValue();
      boolean bool2;
      label117: boolean bool1;
      if ((localba.d != null) && (("started".equals(localba.e)) || ("starting".equals(localba.e))))
      {
        mp localmp = localba.d;
        if (localmp.a != null)
        {
          bool2 = localmp.a.f();
          if (bool2)
            break label195;
          bool1 = true;
          label125: c.d(40 + String.valueOf(str).length() + "Controller for key: " + str + " allowed back: " + bool1);
          if ((!bool1) || (i == 0))
            break label207;
        }
      }
      label195: label207: for (int j = 1; ; j = 0)
      {
        i = j;
        break;
        bool2 = false;
        break label117;
        bool1 = false;
        break label125;
        bool1 = true;
        break label125;
      }
    }
    return i;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.ay
 * JD-Core Version:    0.6.0
 */