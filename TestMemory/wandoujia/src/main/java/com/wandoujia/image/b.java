package com.wandoujia.image;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Drawable;
import android.net.http.AndroidHttpClient;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import com.android.volley.toolbox.o;
import com.wandoujia.base.http.HttpClientWrapper;
import com.wandoujia.base.utils.ImageUtil;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public final class b
{
  private final com.wandoujia.image.a.f a;
  private final ac b;
  private final com.android.volley.toolbox.j c;
  private final com.wandoujia.image.b.a d;
  private com.android.volley.i e;
  private final Handler f = new Handler(Looper.getMainLooper());
  private final HashMap<String, q> g = new LinkedHashMap();
  private final HashMap<String, q> h = new HashMap();
  private final HashMap<String, q> i = new HashMap();
  private boolean j = true;
  private boolean k = false;
  private Runnable l;

  public b(Context paramContext, a parama)
  {
    this(paramContext, parama, 0);
  }

  private b(Context paramContext, a parama, byte paramByte)
  {
    com.android.volley.toolbox.b localb = new com.android.volley.toolbox.b(131072);
    this.b = new ac();
    this.a = new com.wandoujia.image.a.f(parama.d());
    z localz = new z(0);
    com.wandoujia.image.a.a locala = new com.wandoujia.image.a.a(new File(parama.b(), "volley"), parama.c());
    String str = paramContext.getPackageName();
    if (Build.VERSION.SDK_INT >= 9);
    for (Object localObject = new com.android.volley.toolbox.h(new c()); ; localObject = new com.android.volley.toolbox.f(HttpClientWrapper.newInstance(AndroidHttpClient.newInstance(str))))
    {
      com.android.volley.i locali = new com.android.volley.i(locala, new com.android.volley.toolbox.a((com.android.volley.toolbox.g)localObject, localb), 3);
      locali.a();
      this.e = locali;
      this.c = new com.android.volley.toolbox.j(this.e, localz);
      this.d = new com.wandoujia.image.b.a(parama.a(), localb);
      return;
    }
  }

  private r a(String paramString, ae paramae, t paramt)
  {
    g();
    String str = paramt.a();
    r localr = new r(this, paramString, str, paramae);
    Bitmap localBitmap = this.a.a(str);
    if (localBitmap != null)
    {
      localr.a(localBitmap);
      return localr;
    }
    localr.a();
    q localq1 = (q)this.h.get(str);
    if (localq1 != null)
    {
      localq1.a(localr);
      return localr;
    }
    s locals = paramt.a(new u(this, str));
    if (this.k)
    {
      q localq2 = (q)this.g.get(str);
      if (localq2 != null)
      {
        localq2.a(localr);
        return localr;
      }
      this.g.put(str, new q(locals, localr));
    }
    while (true)
    {
      return localr;
      locals.a();
      this.h.put(str, new q(locals, localr));
    }
  }

  private static void g()
  {
    if (Looper.myLooper() != Looper.getMainLooper())
      throw new IllegalStateException("ImageLoader must be invoked from the main thread.");
  }

  public final Bitmap a(Context paramContext, int paramInt)
  {
    String str = String.valueOf(paramInt);
    Bitmap localBitmap = this.a.b(str);
    if (localBitmap != null);
    while (true)
    {
      return localBitmap;
      try
      {
        Drawable localDrawable = paramContext.getResources().getDrawable(paramInt);
        localBitmap = ImageUtil.drawableToBitmap(localDrawable, new Bitmap.Config[0]);
        if (localBitmap == null)
          continue;
        this.b.a(new k(this, str, localBitmap));
        return localBitmap;
      }
      catch (Resources.NotFoundException localNotFoundException)
      {
      }
    }
    return null;
  }

  public final o a()
  {
    return this.a;
  }

  public final r a(String paramString)
  {
    return b(paramString, null);
  }

  public final r a(String paramString, ae paramae)
  {
    return a(paramString, paramae, 0, 0);
  }

  public final r a(String paramString, ae paramae, int paramInt1, int paramInt2)
  {
    if (!this.j)
    {
      r localr = new r(this, paramString, null, paramae);
      localr.a(null);
      return localr;
    }
    return a(paramString, paramae, new f(this, paramString, paramInt1, paramInt2));
  }

  public final com.android.volley.i b()
  {
    return this.e;
  }

  public final r b(String paramString, ae paramae)
  {
    return a(paramString, paramae, new h(this, paramString));
  }

  public final r b(String paramString, ae paramae, int paramInt1, int paramInt2)
  {
    return a(paramString, paramae, new g(this, paramString, paramInt1, paramInt2));
  }

  public final r c(String paramString, ae paramae)
  {
    return a(paramString, paramae, new i(this, paramString));
  }

  public final void c()
  {
    this.a.a();
  }

  public final r d(String paramString, ae paramae)
  {
    return a(paramString, paramae, new j(this, paramString));
  }

  public final void d()
  {
    this.j = true;
  }

  public final void e()
  {
    g();
    if (!this.k)
      return;
    this.k = false;
    Iterator localIterator = this.g.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      String str = (String)localEntry.getKey();
      q localq = (q)localEntry.getValue();
      q.a(localq).a();
      this.h.put(str, localq);
    }
    this.g.clear();
  }

  public final void f()
  {
    g();
    this.k = true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.image.b
 * JD-Core Version:    0.6.0
 */