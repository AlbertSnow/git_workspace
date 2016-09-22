package com.google.android.gms.ads.internal.csi;

import android.text.TextUtils;
import aom;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.state.h;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@a
public final class l
{
  public boolean a;
  public final Object b = new Object();
  public String c;
  public j d;
  public l e;
  private final List f = new LinkedList();
  private final Map g = new LinkedHashMap();

  public l(boolean paramBoolean, String paramString1, String paramString2)
  {
    this.a = paramBoolean;
    this.g.put("action", paramString1);
    this.g.put("ad_format", paramString2);
  }

  public final j a()
  {
    return a(bc.a().i.b());
  }

  public final j a(long paramLong)
  {
    if (!this.a)
      return null;
    return new j(paramLong, null, null);
  }

  public final void a(String paramString1, String paramString2)
  {
    if ((!this.a) || (TextUtils.isEmpty(paramString2)));
    b localb;
    do
    {
      return;
      localb = bc.a().h.c();
    }
    while (localb == null);
    synchronized (this.b)
    {
      f localf = localb.a(paramString1);
      Map localMap = this.g;
      localMap.put(paramString1, localf.a((String)localMap.get(paramString1), paramString2));
      return;
    }
  }

  public final boolean a(j paramj, long paramLong, String[] paramArrayOfString)
  {
    synchronized (this.b)
    {
      int i = paramArrayOfString.length;
      for (int j = 0; j < i; j++)
      {
        j localj = new j(paramLong, paramArrayOfString[j], paramj);
        this.f.add(localj);
      }
      return true;
    }
  }

  public final boolean a(j paramj, String[] paramArrayOfString)
  {
    if ((!this.a) || (paramj == null))
      return false;
    return a(paramj, bc.a().i.b(), paramArrayOfString);
  }

  public final String b()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    synchronized (this.b)
    {
      Iterator localIterator = this.f.iterator();
      while (localIterator.hasNext())
      {
        j localj1 = (j)localIterator.next();
        long l1 = localj1.a;
        String str2 = localj1.b;
        j localj2 = localj1.c;
        if ((localj2 == null) || (l1 <= 0L))
          continue;
        long l2 = l1 - localj2.a;
        localStringBuilder.append(str2).append('.').append(l2).append(',');
      }
    }
    this.f.clear();
    if (!TextUtils.isEmpty(this.c))
      localStringBuilder.append(this.c);
    while (true)
    {
      String str1 = localStringBuilder.toString();
      monitorexit;
      return str1;
      if (localStringBuilder.length() <= 0)
        continue;
      localStringBuilder.setLength(-1 + localStringBuilder.length());
    }
  }

  final Map c()
  {
    synchronized (this.b)
    {
      b localb = bc.a().h.c();
      if ((localb == null) || (this.e == null))
      {
        Map localMap1 = this.g;
        return localMap1;
      }
      Map localMap2 = localb.a(this.g, this.e.c());
      return localMap2;
    }
  }

  public final j d()
  {
    synchronized (this.b)
    {
      j localj = this.d;
      return localj;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.csi.l
 * JD-Core Version:    0.6.0
 */