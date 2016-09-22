package com.google.android.gms.ads.internal.safebrowsing;

import aiq;
import android.os.Bundle;
import com.google.android.gms.ads.internal.config.d;
import com.google.android.gms.ads.internal.config.m;
import com.google.android.gms.ads.internal.util.future.a;
import java.util.Set;
import java.util.Timer;

final class h
  implements aiq
{
  h(f paramf, Set paramSet, a parama)
  {
  }

  public final void a(int paramInt)
  {
  }

  public final void a(Bundle paramBundle)
  {
    this.c.b.schedule(new i(this), ((Long)m.aS.a()).longValue());
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.safebrowsing.h
 * JD-Core Version:    0.6.0
 */