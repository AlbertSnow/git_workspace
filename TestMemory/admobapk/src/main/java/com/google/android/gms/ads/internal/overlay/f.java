package com.google.android.gms.ads.internal.overlay;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import aom;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.config.d;
import com.google.android.gms.ads.internal.gmsg.ar;
import com.google.android.gms.ads.internal.gmsg.bb;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.y;
import com.google.android.gms.ads.internal.webview.b;
import hn;
import hp;
import ht;
import hv;
import hy;
import il;
import ip;
import iv;
import jm;
import jp;
import kd;
import kn;
import ky;

@com.google.android.gms.ads.internal.report.client.a
@TargetApi(16)
public final class f extends am
  implements TextureView.SurfaceTextureListener
{
  private int A;
  private int B;
  private final AudioManager.OnAudioFocusChangeListener C = new l(this);
  private final hp D = new m(this);
  private final ip E = new n(this);
  private final hy F = new o(this);
  al a;
  int b = 1;
  boolean c;
  int d;
  int e;
  float f;
  private float g;
  private final b h;
  private final int i;
  private final AudioManager j;
  private final bm k;
  private final boolean l;
  private Surface m;
  private a n;
  private hn o;
  private il p;
  private hv q;
  private String r;
  private String s;
  private boolean t;
  private float u = 1.0F;
  private boolean v;
  private bl w;
  private boolean x;
  private boolean y;
  private boolean z;

  public f(Context paramContext, bm parambm, b paramb, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramContext);
    this.l = paramBoolean2;
    this.h = paramb;
    this.i = paramInt;
    this.j = ((AudioManager)paramb.getContext().getSystemService("audio"));
    setSurfaceTextureListener(this);
    this.k = parambm;
    this.x = paramBoolean1;
    this.k.a(this);
  }

  private final void a(float paramFloat, boolean paramBoolean)
  {
    if ((this.o != null) && (this.q != null))
    {
      if (paramBoolean)
      {
        this.o.b(this.q, 1, Float.valueOf(paramFloat));
        return;
      }
      this.o.a(this.q, 1, Float.valueOf(paramFloat));
      return;
    }
    c.e("Trying to set volume before player and renderers are initalized.");
  }

  private final void a(Surface paramSurface, boolean paramBoolean)
  {
    if ((this.o != null) && (this.p != null))
    {
      if (paramBoolean)
      {
        this.o.b(this.p, 1, paramSurface);
        return;
      }
      this.o.a(this.p, 1, paramSurface);
      return;
    }
    c.e("Trying to set surface before player and renderers are initalized.");
  }

  private final boolean n()
  {
    return (this.o != null) && (!this.t);
  }

  private final boolean o()
  {
    return (n()) && (this.b != 1);
  }

  private void p()
  {
    int i1 = 1;
    if (this.o != null);
    label422: label436: 
    do
    {
      do
      {
        do
          return;
        while ((this.s == null) || (this.m == null));
        Object localObject2;
        String str1;
        if (this.s.startsWith("cache:"))
        {
          ar localar = this.h.c(this.s);
          if ((localar != null) && ((localar instanceof bb)))
          {
            bb localbb = (bb)localar;
            localbb.c();
            localObject2 = localbb.d;
            ((a)localObject2).a(this.D, this.E, this.F);
            this.n = ((a)localObject2);
            if (this.n != null)
              break label436;
            str1 = String.valueOf(this.s);
            if (str1.length() == 0)
              break label422;
          }
        }
        for (String str2 = "AdExoPlayerHelper is null. Source: ".concat(str1); ; str2 = new String("AdExoPlayerHelper is null. Source: "))
        {
          c.e(str2);
          return;
          String str4 = String.valueOf(this.s);
          if (str4.length() != 0);
          for (String str5 = "Source is MD5 but not found in cache. Source: ".concat(str4); ; str5 = new String("Source is MD5 but not found in cache. Source: "))
          {
            c.e(str5);
            localObject2 = null;
            break;
          }
          Object localObject1;
          if (this.i == i1)
          {
            localObject1 = new ht(this.h.getContext(), Uri.parse(this.s), null, 2);
            a locala = new a();
            locala.a(this.D, this.E, this.F);
            if (!locala.a((iv)localObject1))
              a("AdExoPlayerHelper Error", "Prepare failed.");
            localObject2 = locala;
            break;
          }
          if (this.i == 2);
          while (i1 == 0)
          {
            throw new IllegalStateException();
            i1 = 0;
          }
          String str3 = bc.a().e.a(this.h.getContext(), this.h.o().b);
          ky localky = new ky(this.h.getContext(), str3);
          if ("video/webm".equals(this.r));
          for (Object localObject3 = new kn(); ; localObject3 = new kd())
          {
            localObject1 = new jp(Uri.parse(this.s), localky, (jm)localObject3, 2, ((Integer)com.google.android.gms.ads.internal.config.m.i.a()).intValue());
            break;
          }
        }
        this.o = this.n.a;
        this.p = this.n.b;
        this.q = this.n.c;
      }
      while (this.o == null);
      a(this.m, false);
      this.b = this.o.a();
    }
    while (this.b != 4);
    b();
  }

  private final void q()
  {
    if (!this.l);
    do
      return;
    while ((!n()) || (this.o.f() <= 0L) || (this.o.b()));
    a(0.0F, true);
    this.o.a(true);
    long l1 = this.o.f();
    long l2 = bc.a().i.a();
    while ((n()) && (this.o.f() == l1) && (bc.a().i.a() - l2 <= 250L));
    this.o.a(false);
    a();
  }

  private final void r()
  {
    if (this.c)
    {
      if (this.j.abandonAudioFocus(this.C) == 1)
        this.c = false;
    }
    else
      return;
    c.e("Abandon audio focus failed");
  }

  final void a()
  {
    if ((this.v) || (!this.c))
    {
      a(0.0F, false);
      return;
    }
    a(this.u, false);
  }

  public final void a(float paramFloat)
  {
    this.u = paramFloat;
    a();
  }

  public final void a(float paramFloat1, float paramFloat2)
  {
    if (this.w != null)
      this.w.a(paramFloat1, paramFloat2);
  }

  public final void a(int paramInt)
  {
    if (o())
      this.o.a(paramInt);
  }

  final void a(int paramInt1, int paramInt2, float paramFloat)
  {
    float f1;
    if (paramInt2 == 0)
      f1 = 1.0F;
    while (true)
    {
      if (this.g != f1)
      {
        this.g = f1;
        requestLayout();
      }
      return;
      f1 = paramFloat * paramInt1 / paramInt2;
    }
  }

  public final void a(al paramal)
  {
    this.a = paramal;
  }

  public final void a(String paramString)
  {
    this.r = paramString;
  }

  final void a(String paramString1, String paramString2)
  {
    c.e(19 + String.valueOf(paramString1).length() + String.valueOf(paramString2).length() + "Error received: " + paramString1 + " : " + paramString2);
    this.t = true;
    y.a.post(new k(this, paramString1, paramString2));
  }

  final void b()
  {
    if (this.y);
    do
    {
      return;
      this.y = true;
      c.a("Video is ready.");
      y.a.post(new g(this));
      a();
      this.k.a();
    }
    while (!this.z);
    e();
  }

  public final void b(String paramString)
  {
    if (paramString != null)
    {
      this.s = paramString;
      p();
      return;
    }
    c.e("Path is null.");
  }

  final void c()
  {
    this.c = true;
    a();
  }

  public final String d()
  {
    String str1;
    if (this.i == 1)
    {
      str1 = "/Framework";
      if (!this.x)
        break label126;
    }
    label126: for (String str2 = " spherical"; ; str2 = "")
    {
      return 9 + String.valueOf(str1).length() + String.valueOf(str2).length() + "ExoPlayer" + str1 + str2;
      if (this.i == 2)
      {
        String str3 = this.r;
        str1 = 12 + String.valueOf(str3).length() + "/Extractor(" + str3 + ")";
        break;
      }
      str1 = "/Unknown";
      break;
    }
  }

  public final void e()
  {
    if (o())
    {
      this.o.a(true);
      this.k.c();
      y.a.post(new p(this));
      return;
    }
    this.z = true;
  }

  public final void f()
  {
    if (n())
    {
      this.o.c();
      if (this.o != null)
      {
        a(null, true);
        this.n.a();
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.b = 1;
        this.t = false;
        this.y = false;
        this.z = false;
        r();
      }
    }
    this.k.a = false;
    this.k.b();
  }

  public final void g()
  {
    if (o())
    {
      this.o.a(false);
      this.k.a = false;
      y.a.post(new q(this));
    }
  }

  public final void h()
  {
    this.v = true;
    a();
  }

  public final void i()
  {
    this.v = false;
    a();
  }

  public final int j()
  {
    if (o())
      return (int)this.o.f();
    return 0;
  }

  public final int k()
  {
    if (o())
      return (int)this.o.e();
    return 0;
  }

  public final int l()
  {
    return this.d;
  }

  public final int m()
  {
    return this.e;
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    int i1 = getMeasuredWidth();
    int i2 = getMeasuredHeight();
    float f2;
    if ((this.g != 0.0F) && (this.w == null))
    {
      float f1 = i1 / i2;
      f2 = this.g / f1 - 1.0F;
      if (f2 <= 0.01F)
        break label150;
      i2 = (int)(i1 / this.g);
    }
    while (true)
    {
      setMeasuredDimension(i1, i2);
      if (this.w != null)
        this.w.a(i1, i2);
      if (Build.VERSION.SDK_INT == 16)
      {
        if (((this.A > 0) && (this.A != i1)) || ((this.B > 0) && (this.B != i2)))
          q();
        this.A = i1;
        this.B = i2;
      }
      return;
      label150: if (f2 >= -0.01F)
        continue;
      i1 = (int)(i2 * this.g);
    }
  }

  public final void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    if (this.x)
    {
      this.w = new bl(getContext());
      this.w.a(paramSurfaceTexture, paramInt1, paramInt2);
      this.w.start();
      SurfaceTexture localSurfaceTexture = this.w.c();
      if (localSurfaceTexture != null)
        paramSurfaceTexture = localSurfaceTexture;
    }
    else
    {
      this.m = new Surface(paramSurfaceTexture);
      if (this.o != null)
        break label154;
      p();
      label79: if (!this.c)
      {
        if (this.j.requestAudioFocus(this.C, 3, 2) != 1)
          break label181;
        c();
      }
    }
    while (true)
    {
      a(this.d, this.e, this.f);
      y.a.post(new h(this));
      return;
      this.w.b();
      this.w = null;
      break;
      label154: a(this.m, true);
      this.o.a(0, true);
      q();
      break label79;
      label181: c.e("Audio focus request failed");
    }
  }

  public final boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    c.a("Surface destroyed");
    g();
    if (this.w != null)
    {
      this.w.b();
      this.w = null;
    }
    if (this.o != null)
    {
      this.o.a(0, false);
      this.m = null;
      a(null, true);
    }
    r();
    y.a.post(new i(this));
    return true;
  }

  public final void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    if (this.w != null)
      this.w.a(paramInt1, paramInt2);
  }

  public final void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
    this.k.b(this);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.f
 * JD-Core Version:    0.6.0
 */