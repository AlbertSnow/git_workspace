package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.util.client.f;

@com.google.android.gms.ads.internal.report.client.a
public final class bg extends a
{
  private final f a;
  private final String b;

  public bg(Context paramContext, String paramString1, String paramString2)
  {
    this(paramString2, bc.a().e.a(paramContext, paramString1));
  }

  public bg(String paramString1, String paramString2)
  {
    this.a = new f(paramString2);
    this.b = paramString1;
  }

  public final void a()
  {
    this.a.a(this.b);
  }

  public final void b()
  {
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.bg
 * JD-Core Version:    0.6.0
 */