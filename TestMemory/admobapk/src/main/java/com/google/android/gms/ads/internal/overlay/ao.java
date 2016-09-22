package com.google.android.gms.ads.internal.overlay;

import alv;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.internal.csi.j;
import com.google.android.gms.ads.internal.csi.l;
import com.google.android.gms.ads.internal.m;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.y;
import com.google.android.gms.ads.internal.webview.b;
import java.util.HashMap;

@a
public final class ao extends FrameLayout
  implements al
{
  public final FrameLayout a;
  public final bn b;
  public am c;
  TextView d;
  long e;
  public String f;
  public String g;
  private final b h;
  private boolean i;
  private boolean j;
  private long k;

  public ao(Context paramContext, b paramb, int paramInt, boolean paramBoolean, l paraml, j paramj)
  {
    super(paramContext);
    this.h = paramb;
    this.a = new FrameLayout(paramContext);
    addView(this.a, new FrameLayout.LayoutParams(-1, -1));
    alv.a(paramb.h());
    this.c = paramb.h().b.a(paramContext, paramb, paramInt, paramBoolean, paraml, paramj);
    if (this.c != null)
      this.a.addView(this.c, new FrameLayout.LayoutParams(-1, -1, 17));
    this.d = new TextView(paramContext);
    this.d.setBackgroundColor(-16777216);
    j();
    this.b = new bn(this);
    this.b.a();
    if (this.c != null)
      this.c.a(this);
    if (this.c == null)
      a("AdVideoUnderlay Error", "Allocating player failed.");
  }

  private final void j()
  {
    if (!h())
    {
      this.a.addView(this.d, new FrameLayout.LayoutParams(-1, -1));
      this.a.bringChildToFront(this.d);
    }
  }

  public final void a()
  {
    y.a.post(new ap(this));
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt3 == 0) || (paramInt4 == 0))
      return;
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(paramInt3 + 2, paramInt4 + 2);
    localLayoutParams.setMargins(paramInt1 - 1, paramInt2 - 1, 0, 0);
    this.a.setLayoutParams(localLayoutParams);
    requestLayout();
  }

  public final void a(String paramString1, String paramString2)
  {
    a("error", new String[] { "what", paramString1, "extra", paramString2 });
  }

  public final void a(String paramString, String[] paramArrayOfString)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("event", paramString);
    int m = paramArrayOfString.length;
    int n = 0;
    Object localObject = null;
    if (n < m)
    {
      String str = paramArrayOfString[n];
      if (localObject == null);
      while (true)
      {
        n++;
        localObject = str;
        break;
        localHashMap.put(localObject, str);
        str = null;
      }
    }
    this.h.a("onVideoEvent", localHashMap);
  }

  public final void b()
  {
    if (this.c == null);
    do
      return;
    while (this.k != 0L);
    float f1 = this.c.k() / 1000.0F;
    int m = this.c.l();
    int n = this.c.m();
    String[] arrayOfString = new String[6];
    arrayOfString[0] = "duration";
    arrayOfString[1] = String.valueOf(f1);
    arrayOfString[2] = "videoWidth";
    arrayOfString[3] = String.valueOf(m);
    arrayOfString[4] = "videoHeight";
    arrayOfString[5] = String.valueOf(n);
    a("canplaythrough", arrayOfString);
  }

  public final void c()
  {
    if ((this.h.f() != null) && (!this.i))
      if ((0x80 & this.h.f().getWindow().getAttributes().flags) == 0)
        break label82;
    label82: for (boolean bool = true; ; bool = false)
    {
      this.j = bool;
      if (!this.j)
      {
        this.h.f().getWindow().addFlags(128);
        this.i = true;
      }
      return;
    }
  }

  public final void d()
  {
    a("pause", new String[0]);
    i();
  }

  public final void e()
  {
    a("ended", new String[0]);
    i();
  }

  public final void f()
  {
    j();
    this.k = this.e;
    y.a.post(new aq(this));
  }

  public final void g()
  {
    if (this.c == null)
      return;
    this.c.g();
  }

  final boolean h()
  {
    return this.d.getParent() != null;
  }

  public final void i()
  {
    if (this.h.f() == null);
    do
      return;
    while ((!this.i) || (this.j));
    this.h.f().getWindow().clearFlags(128);
    this.i = false;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.ao
 * JD-Core Version:    0.6.0
 */