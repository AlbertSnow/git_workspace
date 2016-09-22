package com.wandoujia.ripple_framework.download;

import android.content.Context;
import android.text.TextUtils;
import com.wandoujia.download2.DownloadInfo2;
import com.wandoujia.download2.DownloadRequestParam;
import com.wandoujia.ripple_framework.download.a.a;
import de.greenrobot.event.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

class w
{
  private final Map<String, Long> a = new HashMap();
  private boolean b;
  private Map<String, DownloadInfo> c = new HashMap();
  private Map<String, DownloadInfo> d = new HashMap();
  private Set<String> e = new HashSet();
  private Map<String, ah> f = new HashMap();
  private a g;
  private boolean h;

  static
  {
    w.class.getSimpleName();
  }

  w(Context paramContext, c paramc)
  {
    this.g = new a(paramContext, paramc);
  }

  private DownloadInfo a(DownloadInfo paramDownloadInfo, DownloadInfo2 paramDownloadInfo2, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramDownloadInfo.a(paramDownloadInfo2);
      return paramDownloadInfo;
    }
    a(paramDownloadInfo.b, paramDownloadInfo);
    paramDownloadInfo.a(paramDownloadInfo2);
    this.g.d(paramDownloadInfo, new af(this, paramDownloadInfo));
    return paramDownloadInfo;
  }

  private void a(String paramString, DownloadInfo paramDownloadInfo)
  {
    if (!this.f.containsKey(paramString))
      this.f.put(paramString, new ah(0));
    List localList = ah.a((ah)this.f.get(paramString));
    if (paramDownloadInfo != null);
    for (DownloadInfo localDownloadInfo = paramDownloadInfo.a(); ; localDownloadInfo = null)
    {
      localList.add(localDownloadInfo);
      return;
    }
  }

  private static void b(DownloadInfo paramDownloadInfo, boolean paramBoolean, String paramString)
  {
    paramDownloadInfo.c = DownloadInfo.Status.PENDING;
    paramDownloadInfo.d.c = 0;
    paramDownloadInfo.d.d = 0L;
    paramDownloadInfo.d.g = null;
    paramDownloadInfo.d.e = 0L;
    paramDownloadInfo.d.f = 0L;
    paramDownloadInfo.d.g = null;
    paramDownloadInfo.d.b = null;
    if (paramBoolean)
      paramDownloadInfo.i = System.currentTimeMillis();
    if (!TextUtils.isEmpty(paramString))
      paramDownloadInfo.d.a.e = paramString;
  }

  private void c(DownloadInfo paramDownloadInfo)
  {
    this.c.put(paramDownloadInfo.b, paramDownloadInfo);
    this.d.put(paramDownloadInfo.d.a.b, paramDownloadInfo);
    if (paramDownloadInfo.h)
    {
      if (paramDownloadInfo.c.isSucceed())
        this.e.remove(paramDownloadInfo.a);
    }
    else
      return;
    this.e.add(paramDownloadInfo.a);
  }

  private void d(DownloadInfo paramDownloadInfo)
  {
    this.c.remove(paramDownloadInfo.b);
    this.d.remove(paramDownloadInfo.d.a.b);
    if ((paramDownloadInfo.h) && (!paramDownloadInfo.c.isSucceed()))
      this.e.remove(paramDownloadInfo.a);
  }

  final DownloadInfo a(DownloadInfo2 paramDownloadInfo2)
  {
    DownloadInfo localDownloadInfo = b(paramDownloadInfo2.a.b);
    if (localDownloadInfo == null)
      localDownloadInfo = null;
    do
    {
      return localDownloadInfo;
      a(localDownloadInfo.b, localDownloadInfo);
      localDownloadInfo.a(paramDownloadInfo2);
      this.g.c(localDownloadInfo, new ab(this, localDownloadInfo));
    }
    while (!localDownloadInfo.c.isSucceed());
    this.e.remove(localDownloadInfo.a);
    this.a.remove(localDownloadInfo.a);
    return localDownloadInfo;
  }

  final DownloadInfo a(DownloadInfo paramDownloadInfo, boolean paramBoolean, String paramString)
  {
    String str = paramDownloadInfo.b;
    if (c(str))
    {
      DownloadInfo localDownloadInfo = a(str);
      a(str, localDownloadInfo);
      b(localDownloadInfo, paramBoolean, paramString);
      this.g.c(localDownloadInfo, new ad(this, str));
      return localDownloadInfo;
    }
    a(paramDownloadInfo.b, null);
    b(paramDownloadInfo, paramBoolean, paramString);
    c(paramDownloadInfo);
    this.g.c(paramDownloadInfo, new ae(this, str));
    return paramDownloadInfo;
  }

  final DownloadInfo a(String paramString)
  {
    return (DownloadInfo)this.c.get(paramString);
  }

  final DownloadInfo a(String paramString, DownloadInfo.Status paramStatus)
  {
    DownloadInfo localDownloadInfo = a(paramString);
    if (localDownloadInfo == null)
      localDownloadInfo = null;
    do
    {
      return localDownloadInfo;
      a(localDownloadInfo.b, localDownloadInfo);
      localDownloadInfo.c = paramStatus;
      this.g.c(localDownloadInfo, new ac(this, localDownloadInfo));
    }
    while (!paramStatus.isSucceed());
    this.e.remove(localDownloadInfo.a);
    this.a.remove(localDownloadInfo.a);
    return localDownloadInfo;
  }

  final a a()
  {
    return this.g;
  }

  final List<DownloadInfo> a(e parame)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.c.values().iterator();
    while (localIterator.hasNext())
    {
      DownloadInfo localDownloadInfo = (DownloadInfo)localIterator.next();
      if ((localDownloadInfo.h != parame.d().booleanValue()) || ((parame.c() != null) && (!parame.c().contains(localDownloadInfo.c))) || ((parame.b() != null) && (!parame.b().contains(localDownloadInfo.e))))
        continue;
      localArrayList.add(localDownloadInfo);
    }
    return localArrayList;
  }

  final List<DownloadInfo> a(DownloadInfo.Status[] paramArrayOfStatus)
  {
    List localList = Arrays.asList(paramArrayOfStatus);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.c.values().iterator();
    while (localIterator.hasNext())
    {
      DownloadInfo localDownloadInfo = (DownloadInfo)localIterator.next();
      if (!localList.contains(localDownloadInfo.c))
        continue;
      localArrayList.add(localDownloadInfo);
    }
    return localArrayList;
  }

  final void a(DownloadInfo paramDownloadInfo)
  {
    a(paramDownloadInfo.b, null);
    c(paramDownloadInfo);
    this.g.a(paramDownloadInfo, new y(this, paramDownloadInfo));
  }

  final void a(ag paramag)
  {
    if (this.h)
      return;
    this.h = true;
    this.g.a(new x(this, paramag));
  }

  final void a(List<DownloadInfo> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      DownloadInfo localDownloadInfo = (DownloadInfo)localIterator.next();
      if (!c(localDownloadInfo.b))
        continue;
      a(localDownloadInfo.b, localDownloadInfo);
      d(localDownloadInfo);
      localArrayList.add(localDownloadInfo.b);
    }
    this.g.a(paramList, new aa(this, localArrayList));
  }

  final DownloadInfo b(DownloadInfo2 paramDownloadInfo2)
  {
    DownloadInfo localDownloadInfo = b(paramDownloadInfo2.a.b);
    if (localDownloadInfo == null)
      return null;
    long l = System.currentTimeMillis();
    Long localLong = (Long)this.a.get(localDownloadInfo.a);
    if ((localLong != null) && (l - localLong.longValue() < 1000L))
      return a(localDownloadInfo, paramDownloadInfo2, true);
    this.a.put(localDownloadInfo.a, Long.valueOf(l));
    return a(localDownloadInfo, paramDownloadInfo2, false);
  }

  final DownloadInfo b(String paramString)
  {
    return (DownloadInfo)this.d.get(paramString);
  }

  final void b(DownloadInfo paramDownloadInfo)
  {
    if (!c(paramDownloadInfo.b));
    for (boolean bool = true; ; bool = false)
    {
      if (!bool)
      {
        a(paramDownloadInfo.b, paramDownloadInfo);
        d(paramDownloadInfo);
      }
      this.g.b(paramDownloadInfo, new z(this, bool, paramDownloadInfo));
      return;
    }
  }

  final boolean b()
  {
    return this.b;
  }

  final int c()
  {
    return this.c.size();
  }

  final boolean c(String paramString)
  {
    return this.c.containsKey(paramString);
  }

  final int d()
  {
    return this.e.size();
  }

  final boolean d(String paramString)
  {
    return this.d.containsKey(paramString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.download.w
 * JD-Core Version:    0.6.0
 */