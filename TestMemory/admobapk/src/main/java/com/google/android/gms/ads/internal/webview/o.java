package com.google.android.gms.ads.internal.webview;

import com.google.android.gms.ads.internal.client.bd;
import com.google.android.gms.ads.internal.client.bf;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.y;
import java.util.HashMap;
import java.util.Map;

@a
public final class o extends bd
{
  final b a;
  public final Object b = new Object();
  public int c;
  bf d;
  boolean e;
  public boolean f;
  public float g;
  private final float h;

  public o(b paramb, float paramFloat)
  {
    this.a = paramb;
    this.h = paramFloat;
  }

  public final void a()
  {
    a("play", null);
  }

  public final void a(bf parambf)
  {
    synchronized (this.b)
    {
      this.d = parambf;
      return;
    }
  }

  public final void a(String paramString, Map paramMap)
  {
    if (paramMap == null);
    for (HashMap localHashMap = new HashMap(); ; localHashMap = new HashMap(paramMap))
    {
      localHashMap.put("action", paramString);
      y.a(new p(this, localHashMap));
      return;
    }
  }

  public final void a(boolean paramBoolean)
  {
    if (paramBoolean);
    for (String str = "mute"; ; str = "unmute")
    {
      a(str, null);
      return;
    }
  }

  public final void b()
  {
    a("pause", null);
  }

  public final boolean c()
  {
    synchronized (this.b)
    {
      boolean bool = this.f;
      return bool;
    }
  }

  public final int d()
  {
    synchronized (this.b)
    {
      int i = this.c;
      return i;
    }
  }

  public final float e()
  {
    return this.h;
  }

  public final float f()
  {
    synchronized (this.b)
    {
      float f1 = this.g;
      return f1;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.webview.o
 * JD-Core Version:    0.6.0
 */