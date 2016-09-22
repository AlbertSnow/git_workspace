package com.google.android.gms.ads.internal.renderer.nativeads;

import com.google.android.gms.ads.internal.report.client.a;
import dh;
import java.util.concurrent.Future;

@a
public final class r
  implements n
{
  private final boolean a;

  public r(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }

  private static dh a(dh paramdh)
  {
    dh localdh = new dh();
    for (int i = 0; i < paramdh.size(); i++)
      localdh.put(paramdh.b(i), ((Future)paramdh.c(i)).get());
    return localdh;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.renderer.nativeads.r
 * JD-Core Version:    0.6.0
 */