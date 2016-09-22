package com.google.android.gms.ads.internal.request;

import android.content.Context;
import com.google.android.gms.ads.internal.config.d;
import com.google.android.gms.ads.internal.config.m;
import com.google.android.gms.ads.internal.request.service.aa;
import com.google.android.gms.ads.internal.request.service.ab;
import com.google.android.gms.ads.internal.request.service.z;

@com.google.android.gms.ads.internal.report.client.a
public final class n extends k
{
  private final Context a;

  public n(Context paramContext, com.google.android.gms.ads.internal.util.promise.a parama, i parami)
  {
    super(parama, parami);
    this.a = paramContext;
  }

  public final void a()
  {
  }

  public final w b()
  {
    com.google.android.gms.ads.internal.config.a locala = new com.google.android.gms.ads.internal.config.a((String)m.a.a());
    return com.google.android.gms.ads.internal.request.service.b.a(this.a, locala, new com.google.android.gms.ads.internal.request.service.a(new com.google.android.gms.ads.internal.social.b(), new com.google.android.gms.ads.internal.config.b(), new z(), new com.google.android.gms.ads.internal.location.b(), new com.google.android.gms.ads.internal.spamsignals.a(), new ab(), new aa(), null));
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.n
 * JD-Core Version:    0.6.0
 */