package com.google.android.gms.ads.internal.overlay;

import android.annotation.TargetApi;
import anw;
import com.google.android.gms.ads.internal.util.y;
import hn;
import hp;
import hq;
import hv;
import hy;
import il;
import ip;
import iv;
import ix;

@com.google.android.gms.ads.internal.report.client.a
@TargetApi(16)
public final class a
{
  public hn a;
  il b;
  hv c;
  private d d;
  private final c e = new c(this);
  private final e f = new e(this);
  private final b g = new b(this);

  public a()
  {
    anw.b("ExoPlayer must be created on the main UI thread.");
    this.a = new hq(2, 2500, 5000);
    this.a.a(this.e);
  }

  public final void a()
  {
    if (this.a != null)
    {
      this.a.d();
      this.a = null;
    }
  }

  public final void a(d paramd)
  {
    monitorenter;
    try
    {
      this.d = paramd;
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public final void a(hp paramhp, ip paramip, hy paramhy)
  {
    this.e.a = paramhp;
    this.f.a = paramip;
    this.g.a = paramhy;
  }

  final void a(String paramString1, String paramString2)
  {
    monitorenter;
    try
    {
      if (this.d != null)
        this.d.a(paramString1, paramString2);
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public final boolean a(iv paramiv)
  {
    if (this.a == null)
      return false;
    this.b = new il(paramiv, 1, 0L, y.a, this.f, -1);
    this.c = new hv(paramiv, y.a, this.g);
    ix[] arrayOfix = new ix[2];
    arrayOfix[0] = this.b;
    arrayOfix[1] = this.c;
    this.a.a(arrayOfix);
    return true;
  }

  public final void b()
  {
    monitorenter;
    try
    {
      this.d = null;
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.a
 * JD-Core Version:    0.6.0
 */