package com.google.android.gms.ads.internal.prefetch;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.util.y;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@com.google.android.gms.ads.internal.report.client.a
public final class c
  implements a
{
  final Context a;
  final Set b = Collections.synchronizedSet(new HashSet());

  public c(Context paramContext)
  {
    this.a = paramContext;
  }

  public final void a(String paramString1, String paramString2)
  {
    com.google.android.gms.ads.internal.util.c.b("Fetching assets for the given html");
    y.a.post(new d(this, paramString1, paramString2));
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.prefetch.c
 * JD-Core Version:    0.6.0
 */