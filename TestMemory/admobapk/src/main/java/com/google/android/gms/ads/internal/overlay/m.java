package com.google.android.gms.ads.internal.overlay;

import android.os.Handler;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.y;
import hm;
import hp;

final class m
  implements hp
{
  m(f paramf)
  {
  }

  public final void a(hm paramhm)
  {
    this.a.a("PlayerError", paramhm.getMessage());
  }

  public final void a(boolean paramBoolean, int paramInt)
  {
    if (this.a.b != paramInt)
      this.a.b = paramInt;
    switch (paramInt)
    {
    default:
      return;
    case 4:
      this.a.b();
      return;
    case 5:
    }
    f localf = this.a;
    c.a("Video ended.");
    y.a.post(new j(localf));
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.m
 * JD-Core Version:    0.6.0
 */