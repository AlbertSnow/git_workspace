package com.google.android.gms.ads.internal.gmsg;

import android.os.Handler;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.util.y;
import com.google.android.gms.ads.internal.webview.b;
import java.util.List;

@com.google.android.gms.ads.internal.report.client.a
public final class ao extends com.google.android.gms.ads.internal.util.a
{
  final b a;
  final ar b;
  private final String c;

  ao(b paramb, ar paramar, String paramString)
  {
    this.a = paramb;
    this.b = paramar;
    this.c = paramString;
    bc.a().x.a.add(this);
  }

  public final void a()
  {
    try
    {
      this.b.a(this.c);
      return;
    }
    finally
    {
      y.a.post(new ap(this));
    }
    throw localObject;
  }

  public final void b()
  {
    this.b.a();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.ao
 * JD-Core Version:    0.6.0
 */