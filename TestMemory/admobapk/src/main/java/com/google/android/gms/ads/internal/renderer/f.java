package com.google.android.gms.ads.internal.renderer;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.state.b;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.y;

@com.google.android.gms.ads.internal.report.client.a
public abstract class f extends com.google.android.gms.ads.internal.util.a
{
  public final k a;
  public final Context b;
  public final Object c = new Object();
  public final Object d = new Object();
  public final b e;
  public AdResponseParcel f;

  protected f(Context paramContext, b paramb, k paramk)
  {
    super(true);
    this.b = paramContext;
    this.e = paramb;
    this.f = paramb.b;
    this.a = paramk;
  }

  protected abstract com.google.android.gms.ads.internal.state.a a(int paramInt);

  public final void a()
  {
    while (true)
    {
      int j;
      synchronized (this.c)
      {
        c.b("AdRendererBackgroundTask started.");
        int i = this.e.e;
        try
        {
          a(SystemClock.elapsedRealtime());
          com.google.android.gms.ads.internal.state.a locala = a(i);
          y.a.post(new h(this, locala));
          return;
        }
        catch (i locali)
        {
          j = locali.a;
          if (j == 3)
            continue;
        }
        if (j != -1)
          continue;
        c.d(locali.getMessage());
        if (this.f == null)
        {
          this.f = new AdResponseParcel(j);
          y.a.post(new g(this));
          i = j;
          continue;
          c.e(locali.getMessage());
        }
      }
      this.f = new AdResponseParcel(j, this.f.k);
    }
  }

  protected abstract void a(long paramLong);

  public void b()
  {
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.renderer.f
 * JD-Core Version:    0.6.0
 */