package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.ax;
import com.google.android.gms.ads.internal.config.d;
import com.google.android.gms.ads.internal.config.k;
import com.google.android.gms.ads.internal.config.m;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

@a
public final class al extends ax
{
  private static final Object b = new Object();
  private static al c;
  private final Context a;
  private final Object d = new Object();
  private boolean e;
  private boolean f;
  private float g = -1.0F;
  private VersionInfoParcel h;

  private al(Context paramContext, VersionInfoParcel paramVersionInfoParcel)
  {
    this.a = paramContext;
    this.h = paramVersionInfoParcel;
    this.e = false;
  }

  public static al a()
  {
    synchronized (b)
    {
      al localal = c;
      return localal;
    }
  }

  public static al a(Context paramContext, VersionInfoParcel paramVersionInfoParcel)
  {
    synchronized (b)
    {
      if (c == null)
        c = new al(paramContext.getApplicationContext(), paramVersionInfoParcel);
      al localal = c;
      return localal;
    }
  }

  public final void a(float paramFloat)
  {
    synchronized (this.d)
    {
      this.g = paramFloat;
      return;
    }
  }

  public final void a(String paramString)
  {
    m.a(this.a);
    if (!TextUtils.isEmpty(paramString))
    {
      d locald = m.aE;
      if (((Boolean)bc.a().n.a(locald)).booleanValue())
        bc.a().v.a(this.a, this.h, true, null, paramString, null);
    }
  }

  public final void a(boolean paramBoolean)
  {
    synchronized (this.d)
    {
      this.f = paramBoolean;
      return;
    }
  }

  public final void b()
  {
    synchronized (b)
    {
      if (this.e)
      {
        c.e("Mobile ads is initialized already.");
        return;
      }
      this.e = true;
      return;
    }
  }

  public final float c()
  {
    synchronized (this.d)
    {
      float f1 = this.g;
      return f1;
    }
  }

  public final boolean d()
  {
    while (true)
    {
      synchronized (this.d)
      {
        if (this.g >= 0.0F)
        {
          i = 1;
          return i;
        }
      }
      int i = 0;
    }
  }

  public final boolean e()
  {
    synchronized (this.d)
    {
      boolean bool = this.f;
      return bool;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.al
 * JD-Core Version:    0.6.0
 */